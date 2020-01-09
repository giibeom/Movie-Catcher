package command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReviewDAO;

public class ReviewWriteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int cnt = 0;
		ReviewDAO dao = new ReviewDAO();
		
		/*rs_num 파라미터를 어디서 받아야하는지 ㅠㅠ */
		int rs_num = Integer.parseInt(request.getParameter("rs_num"));
		String rv_title = request.getParameter("title");
		String rv_content = request.getParameter("content");
		Double rv_star = Double.parseDouble(request.getParameter("star"));
		if(rv_content == null) rv_content = "";
		
		if(rv_title != null && rv_star != null && rv_title.trim().length() > 0) {
		
			try {
				cnt = dao.insert(rv_title, rv_content, rv_star, rs_num);
			}catch(SQLException e) {
				e.printStackTrace();
			}
	
		}
		request.setAttribute("result", cnt);
	}


}
