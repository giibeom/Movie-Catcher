package command.write;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.json.JSONArray;
import org.json.JSONObject;

import com.beans.*;

public class AjaxListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//parameter
		String reqType = request.getParameter("reqType");
		if(reqType == null) reqType = "json";
		
		//xml이나 혹은 json으로 response하기
		switch(reqType) {
		case "xml":
			responseJSON(request, response);
			break;
		case "json":
			responseJSON(request, response);
			break;
		default:
			responseJSON(request, response);
		}
		
		
		
	}
	
	
	private void responseJSON(HttpServletRequest request, HttpServletResponse response) {
		HandTDTO[] arr = (HandTDTO [])request.getAttribute("ticket");
		JSONObject jsonOutput = new JSONObject();
		//데이터 갯수
		int count = (arr == null) ? 0 : arr.length;
		jsonOutput.put("count", count);
		
		JSONArray dataArr = new JSONArray();
		for(int i = 0; i <count ; i++) {
			JSONObject dataObj = new JSONObject();
			
			dataObj.put("h_uid", arr[i].getH_uid());
			dataObj.put("hallType", arr[i].getHallType());
			dataObj.put("hallLocation", arr[i].getHallLocation());
			dataObj.put("hallSize", arr[i].getHallSize());
			dataObj.put("theaterCode", arr[i].getTheaterCode());
			dataObj.put("h_movie", arr[i].getH_movie());
			dataObj.put("t_uid", arr[i].getT_uid());
			dataObj.put("movietime", arr[i].getMovietime());
			dataObj.put("restSeat", arr[i].getRestSeat());
			
			
			//array에 추가
			dataArr.put(dataObj);
		}
		
		jsonOutput.put("DataList", dataArr);
		try {
			String jsonString = jsonOutput.toString();//JSONObject를 문자열로 반환
			System.out.println(jsonString);// 테스트용
			
			response.setContentType("application/json; charset=utf-8");// MIME 타입 설정 
			response.getWriter().write(jsonString);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
