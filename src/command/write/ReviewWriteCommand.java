package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReviewDAO;

public class ReviewWriteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		int cnt = 0;
		ReviewDAO dao = new ReviewDAO();
		
		/*rs_num 파라미터를 어디서 받아야하는지 ㅠㅠ */
		int rs_num = Integer.parseInt(request.getParameter("num"));
		String rv_title = request.getParameter("title");
		String rv_content = request.getParameter("content");
		Double rv_star = Double.parseDouble(request.getParameter("rv_star"));
		if(rv_star == null) rv_star = 0.0;
		
		if(rv_title != null && rv_content != null && rv_title.trim().length() > 0 && rv_content.trim().length() >0 ) {
		
			try {
				cnt = dao.insert(rv_title, rv_content, rv_star, rs_num);
			}catch(SQLException e) {
				e.printStackTrace();
			}
	
		}
	}

}
