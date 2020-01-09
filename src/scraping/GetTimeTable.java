package scraping;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.NamingException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.beans.*;

public class GetTimeTable {
	public static void main(String[] args) throws SQLException, NamingException {
		TheaterDAO tdao = new TheaterDAO();
		TheaterDTO[] tdto = tdao.select();
		int h_uid = 0;

		for (int i = 0; i < tdto.length; i++) {
			String areacode = tdto[i].getAreaCode();
			String theatercode = tdto[i].getTheaterCode();
			String selectDate = "20200108";
			String theaterName = tdto[i].getTheaterName();

			String url = "http://www.cgv.co.kr/common/showtimes/iframeTheater.aspx?areacode=" + areacode
					+ "&theaterCode=" + theatercode + "&date=" +selectDate ; // 크롤링할 url지정
			Document doc = null; // Document에는 페이지의 전체 소스가 저장된다
			try {
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				e.printStackTrace();
			}

			Elements element = doc.select("div.sect-showtimes");

			Iterator<Element> movie = element.select("div.col-times").iterator();

			System.out.println(theaterName + "점의 상영시간표입니다.");
			while (movie.hasNext()) {
				Element movieInfo = movie.next();
				Elements movieTitle = movieInfo.select("strong");

				String movieName = movieTitle.text();

				System.out.println("영화이름  : " + movieTitle.text());

				Iterator<Element> movieHallInfo = movieInfo.select("div.info-hall").iterator();
				Iterator<Element> movieTimetable = movieInfo.select("div.info-timetable").iterator();
				while (movieHallInfo.hasNext()) {
					Element hallInfo = movieHallInfo.next();
					Iterator<Element> info = hallInfo.select("li").iterator();
					String hallType = info.next().text();
					String hallLocation = info.next().text();
					String hallSize = info.next().text();
					HallDAO hdao = new HallDAO();
					hdao.insert(hallType, hallLocation, hallSize, theatercode, movieName);
					h_uid++;
					System.out.println("상영관 : " + hallType + "\t" + hallLocation + "\t" + hallSize);

					Element timeTable = movieTimetable.next();
					Iterator<Element> timeTableInfo = timeTable.select("li").iterator();
					while (timeTableInfo.hasNext()) {
						Elements realTimeTable = timeTableInfo.next().select("a");
						String movietime = realTimeTable.attr("data-playstarttime");
						String restSeatS = realTimeTable.attr("data-seatremaincnt").trim();
						int restSeat = 0;
						if (restSeatS == "") {
							restSeat = 0;
						} else {

							restSeat = Integer.parseInt(restSeatS.replaceAll("[^0-9]", ""));
						}
						String hall = realTimeTable.attr("data-screenkorname");
						TicketDAO ticketdao = new TicketDAO();
						ticketdao.insert(movietime, restSeat, h_uid);
						System.out.println("시간 : " + realTimeTable.attr("data-playstarttime"));
						System.out.println("남은 좌석 : " + realTimeTable.attr("data-seatremaincnt"));
						System.out.println("상영관 : " + realTimeTable.attr("data-screenkorname"));
						System.out.println();
					}
				}
			}
		}
	}
}
