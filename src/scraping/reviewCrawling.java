package scraping;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class reviewCrawling {

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
	
	
	public static void main(String[] args) {
		
		
		System.out.println("============================================================");
		System.out.println("네이버 리뷰\n");
		 
		 
		for(int i = 0; i < movieId.length; i++) {
			
			String url = "https://movie.naver.com/movie/point/af/list.nhn?st=mcode&sword="+ movieId[i] +"&target=after";
			Document doc = null;
			
			crawling(url, doc, i);
			
			
		} // end for
		
		
	} // end main()

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
	
	
	
	
} // end class



//			Elements element = doc.select("table.list_netizen").select("tbody");
//			//System.out.println(element.html());
//			Iterator<Element> review = element.select("tr").iterator();
//			while(review.hasNext()) {
//				Element reviewText = review.next();
//				String reviewSubject = reviewText.select(".title").select("a:nth-child(1)").text();
//				String reviewAvg = reviewText.select(".title").select(".list_netizen_score").select("em").text();
//				String reviewContent = reviewText.select(".title:nth-last-child(2)").text();
//				
//				System.out.println(reviewSubject + "\n" + reviewAvg + "\n" + reviewContent);
//				System.out.println();
//			}


//			Elements elements = doc.select("#old_content > table > tbody > tr > td.title");
//			System.out.println(elements.size());
//			
//			String content = "";
//			String subject = "";
//
//			for(Element e : elements) {
//				System.out.println("영화제목 => " + e.selectFirst("a.movie.color_b").text().trim());
//				System.out.println("평점 => " + e.selectFirst("div.list_netizen_score > em").text().trim());
//				
//				// 리뷰글
//				e.selectFirst("a.movie.color_b").remove();
//				e.selectFirst("div.list_netizen_score").remove();
//				e.selectFirst("a.report").remove();
//				if(e.text().trim().length() > 0) {
//				System.out.println(e.text().trim());
//				} else {
//					System.out.println("리뷰없이 평점만 등록하셨습니다");
//				}
//				
//				System.out.println("-------------------------------------");
//			}









// Jsoup를 이용해서 http://www.cgv.co.kr/movies/ 크롤링
//	String url = "http://www.cgv.co.kr/movies/";
//	Document doc = null; 
//		try {
//			doc = Jsoup.connect(url).get();
//		
//
//		//select를 이용하여 원하는 태그를 선택한다. select는 원하는 값을 가져오기 위한 중요한 기능이다.
//		
//		Elements element = doc.select("div.sect-movie-chart");
//		
//		System.out.println("============================================================");
//		System.out.println("CGV 무비차트\n");
//		
//		
//		//Iterator을 사용하여 하나씩 값 가져오기
//		Iterator<Element> rank = element.select("strong.rank").iterator();
//		Iterator<Element> title = element.select("strong.title").iterator();
//		
//		while(rank.hasNext()) {
//			System.out.println(rank.next().text() +"\t" + title.next().text());
//		}
//		
//
//	
//
//		System.out.println("============================================================");
//		System.out.println("CGV 실시간검색어\n");
//		Elements element3 = doc.select("div.searchrank");
//		Iterator<Element> ranking = element3.select("li").select("strong").iterator();
//		int a = 1;
//		while(ranking.hasNext()) {
//			System.out.println(a + " : " + ranking.next().text());
//			a++;
//		}
//		
//		} catch (IOException e) {
//			e.printStackTrace();
//		}