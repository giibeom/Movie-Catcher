package scraping;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.beans.TheaterDAO;


public class GetTheaterAddress {
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
		int cnt = 0;
		while(tIArr.hasNext()) {
			TheaterDAO dao = new TheaterDAO();
			String [] tArr = tIArr.next();
			String areaCode = tArr[0];
			String theaterCode = tArr[1];
			String theaterName = tArr[2];
			String url = "http://www.cgv.co.kr/theaters/?areacode=" + areaCode + "&theaterCode=" + theaterCode;  // 크롤링할 url지정
			Document doc = null; //Document에는 페이지의 전체 소스가 저장된다
			try {
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			Elements element = doc.select("div.sect-theater");
			Elements movieTitle = element.select("strong.title");
			System.out.println(theaterName);
			String address = movieTitle.text();
			address = address.split("위치")[0].trim();
			if(address == "\n") {
				Elements special = doc.select("p.txt-theaterinfo");
				System.out.println(special.html());
				address = special.text();
				address = address.split("위치")[0].trim();
			}
			String theaterAddress = address;
			try {
				cnt = dao.insert(theaterCode, theaterName, areaCode, theaterAddress);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
