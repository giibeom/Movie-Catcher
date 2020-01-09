package command.write;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ReviewCrawlingCommand implements Command {

	static String [] movieId = {
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
	
	static String [] movieName = {
			"천문", "백두산", "미드웨이", "시동", "겨울왕국2", "신비아파트", "포드v페라리", "21브릿지", "나이브스 아웃", "눈의 여왕4", "닥터 두리틀", "스타워즈"
	};
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
			
			 
			for(int i = 0; i < movieId.length; i++) {
				
				String url = "https://movie.naver.com/movie/point/af/list.nhn?st=mcode&sword="+ movieId[i] +"&target=after";
				Document doc = null;
				
				crawling(url, doc, i);
				
				
			} // end for
			
	} // end execute

		public static void crawling(String url, Document doc, int i) {
			System.out.println("========================================= " + movieName[i] + " =========================================");
			
			try {
				doc = Jsoup.connect(url).get();
				
				Elements elements = doc.select("#old_content > table > tbody > tr");

				if(elements.size() != 10) {
					System.out.println("해당 영화의 리뷰가 검색되지 않습니다");
					return;
				}
				
				for(Element e : elements) {
					System.out.println("영화제목 => " + e.selectFirst("td.title > a.movie.color_b").text().trim());
					System.out.println("평점 => " + e.selectFirst("td.title > div.list_netizen_score > em").text().trim());
					System.out.println("작성자 => " + e.selectFirst("td.num > a.author").text().trim());
					
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
					
					System.out.println("작성일 => " + e.selectFirst("td.num").text().trim());
					
					e.selectFirst("td.num").remove();
					
					if(e.text().trim().length() > 0) {
						System.out.println(e.text().trim());
					} else {
						System.out.println("리뷰없이 평점만 등록하셨습니다");
					}
					
					
					System.out.println("-------------------------------------");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
			url = "https://movie.naver.com/movie/point/af/list.nhn?st=mcode&sword="+ movieId[i] +"&target=after&page=2";
			crawling2(url, doc, i);
			
			System.out.println();
		}
		
		
		public static void crawling2(String url, Document doc, int i) {
			
			try {
				doc = Jsoup.connect(url).get();
				
				Elements elements = doc.select("#old_content > table > tbody > tr");
				System.out.println(elements.size());

				for(Element e : elements) {
					System.out.println("영화제목 => " + e.selectFirst("td.title > a.movie.color_b").text().trim());
					System.out.println("평점 => " + e.selectFirst("td.title > div.list_netizen_score > em").text().trim());
					System.out.println("작성자 => " + e.selectFirst("td.num > a.author").text().trim());
					
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
					
					System.out.println("작성일 => " + e.selectFirst("td.num").text().trim());
					
					e.selectFirst("td.num").remove();
					
					if(e.text().trim().length() > 0) {
						System.out.println(e.text().trim());
					} else {
						System.out.println("리뷰없이 평점만 등록하셨습니다");
					}
					
					
					System.out.println("-------------------------------------");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
			System.out.println();
		}
		
		
		
	}

