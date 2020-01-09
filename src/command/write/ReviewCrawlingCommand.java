package command.write;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.beans.ReviewDAO;
import com.beans.ReviewDTO;

public class ReviewCrawlingCommand implements Command{
	int rs_num = 1;
	String [] movieId = {
			"181381", // 천문
			"187940", // 백두산
			"186615",	// 미드웨이
			"183876", // 시동
			"136873", // 겨울왕국2
			"189046", // 신비아파트
			"181710", // 포드v페라리
			"182013", // 21브릿지
			"189000", // 나이브스 아웃
			"190395", // 눈의 여왕4
			"159866", // 닥터 두리틀
			"144694" // 스타워즈
			
	};
	
	String [] movieName = {
			"천문", "백두산", "미드웨이", "시동", "겨울왕국2", "신비아파트", "포드v페라리", "21브릿지", "나이브스 아웃", "눈의 여왕4", "닥터 두리틀", "스타워즈"
	};
	
	
	ReviewDTO [] rdto = null;
	
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
			
		System.out.println("제발");
			for(int i = 0; i < movieId.length; i++) {
				
				String url = "https://movie.naver.com/movie/point/af/list.nhn?st=mcode&sword="+ movieId[i] +"&target=after";
				Document doc = null;
				
				crawling(url, doc, i);
				
				
			} // end for
			
	} // end execute

		public void crawling(String url, Document doc, int i) {
			System.out.println("========================================= " + movieName[i] + " =========================================");
			
			try {
				doc = Jsoup.connect(url).get();
				
				Elements elements = doc.select("#old_content > table > tbody > tr");

				if(elements.size() != 10) {
					System.out.println("해당 영화의 리뷰가 검색되지 않습니다");
					return;
				}
				
				for(Element e : elements) {
					String title = "";
					String content = "";
					double star = 0.0;
					String rv_id = "";
					String rv_date = "";
					
					title = e.selectFirst("td.title > a.movie.color_b").text().trim();
					star = Double.parseDouble(e.selectFirst("td.title > div.list_netizen_score > em").text().trim());
					rv_id = e.selectFirst("td.num > a.author").text().trim();
					
					// 리뷰 id 삭제
					e.selectFirst("td.ac.num").remove();
					// 영화제목 삭제
					e.selectFirst("td.title > a.movie.color_b").remove();
					// 평점 삭제
					e.selectFirst("td.title > div.list_netizen_score").remove();
					// 작성자 삭제
					e.selectFirst("td.num > a.author").remove();
					// 신고 삭제
					e.selectFirst("td.title > a.report").remove();
					
					rv_date = "20" + e.selectFirst("td.num").text().trim();
					rv_date = rv_date.replace(".", "-");
					e.selectFirst("td.num").remove();
					
					if(e.text().trim().length() > 0) {
						content = e.text().trim();
					} else {
						content = "리뷰없이 평점만 등록하셨습니다";
					}
					
					try {
						ReviewDAO rdao = new ReviewDAO();
						rdao.insert(title, content, star , rs_num, rv_id, rv_date);
						rs_num ++;
					} catch (SQLException e1) {
						e1.printStackTrace();
					} catch (NamingException e1) {
						e1.printStackTrace();
					}
					
				} // end for
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
			url = "https://movie.naver.com/movie/point/af/list.nhn?st=mcode&sword="+ movieId[i] +"&target=after&page=2";
			crawling2(url, doc, i);
			
			
		} // end crawling
		
		
		public void crawling2(String url, Document doc, int i) {
			
			try {
				doc = Jsoup.connect(url).get();
				
				Elements elements = doc.select("#old_content > table > tbody > tr");
				System.out.println(elements.size());

				for(Element e : elements) {
					String title = "";
					String content = "";
					double star = 0.0;
					String rv_id = "";
					String rv_date = "";
					
					title = e.selectFirst("td.title > a.movie.color_b").text().trim();
					star = Double.parseDouble(e.selectFirst("td.title > div.list_netizen_score > em").text().trim());
					rv_id = e.selectFirst("td.num > a.author").text().trim();
					
					// 리뷰 id 삭제
					e.selectFirst("td.ac.num").remove();
					// 영화제목 삭제
					e.selectFirst("td.title > a.movie.color_b").remove();
					// 평점 삭제
					e.selectFirst("td.title > div.list_netizen_score").remove();
					// 작성자 삭제
					e.selectFirst("td.num > a.author").remove();
					// 신고 삭제
					e.selectFirst("td.title > a.report").remove();
					
					rv_date = e.selectFirst("td.num").text().trim();
					
					e.selectFirst("td.num").remove();
					
					if(e.text().trim().length() > 0) {
						content = e.text().trim();
					} else {
						content = "리뷰없이 평점만 등록하셨습니다";
					}
					
					try {
						ReviewDAO rdao = new ReviewDAO();
						rdao.insert(title, content, star , rs_num, rv_id, rv_date);
						rs_num ++;
					} catch (SQLException e1) {
						e1.printStackTrace();
					} catch (NamingException e1) {
						e1.printStackTrace();
					}
					
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
		
		
	}

