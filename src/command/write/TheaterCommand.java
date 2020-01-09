package command.write;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.NamingException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.beans.TheaterDAO;

public class TheaterCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		ArrayList<String[]> theaterArr = new ArrayList<String[]>() ;
		
		try {
			String path = TheaterCommand.class.getResource("").getPath();
			BufferedReader brA = new BufferedReader(new FileReader(path + "theater.txt"));
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
