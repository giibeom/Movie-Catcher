package scraping;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class GetTimeTable {
	public static void main(String[] args) {
		ArrayList<String[]> theaterArr = new ArrayList<String[]>() ;
		try {
			BufferedReader brA = new BufferedReader(new FileReader("WebContent/source/theater.txt"));
			while(true) {
				String line = brA.readLine();
				if (line == null) {
					break;
				}
				String [] arr = line.split("\t");
				theaterArr.add(arr);				
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Iterator<String[]> tIArr = theaterArr.iterator();
		while(tIArr.hasNext()) {
			String [] tArr = tIArr.next();
			String areacode = tArr[0];
			String theatercode = tArr[1];
			String selectDate = "20200102";
			String theaterName = tArr[2];
			
			String url = "http://www.cgv.co.kr/common/showtimes/iframeTheater.aspx?areacode=" + areacode + "&theaterCode=" + theatercode + "&date=" + selectDate;  // 크롤링할 url지정
			Document doc = null; //Document에는 페이지의 전체 소스가 저장된다
			try {
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			Elements element = doc.select("div.sect-showtimes");
			
			Iterator<Element> movie = element.select("div.col-times").iterator();
			System.out.println();
			System.out.println("------------------------------------------------------------");
			System.out.println(theaterName + "점의 상영시간표입니다.");
			while(movie.hasNext()) {
				System.out.println("============================================================");
				Element movieInfo = movie.next();
				//System.out.println(movieInfo.html());
				Elements movieTitle = movieInfo.select("strong");
				System.out.println("영화이름  : "+ movieTitle.text());
				Iterator<Element> movieHallInfo = movieInfo.select("div.info-hall").iterator();
				Iterator<Element> movieTimetable = movieInfo.select("div.info-timetable").iterator();
				while(movieHallInfo.hasNext()) {
					Element hallInfo = movieHallInfo.next();
					Iterator<Element> info = hallInfo.select("li").iterator();
					 String hallType = info.next().text();
		    		  String hallName = info.next().text();
		    		  String hallSize = info.next().text();
		    		  System.out.println("상영관 : " + hallType + "\t" + hallName + "\t" + hallSize);
					Element timeTable = movieTimetable.next();
					Iterator<Element> timeTableInfo = timeTable.select("li").iterator();
					while(timeTableInfo.hasNext()) {
						Elements realTimeTable = timeTableInfo.next().select("a");
						System.out.println("시간 : " +realTimeTable.attr("data-playstarttime"));
						System.out.println("남은 좌석 : " + realTimeTable.attr("data-seatremaincnt"));
						System.out.println("상영관 : " + realTimeTable.attr("data-screenkorname"));
						System.out.println();
					}
				}   
			}
			
		}
	      
	      
	      
	      
	      
	}
	   
}
