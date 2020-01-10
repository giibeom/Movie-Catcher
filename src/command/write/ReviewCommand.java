package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ReviewDAO;
import com.beans.ReviewDTO;

public class ReviewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		ReviewDAO dao = new ReviewDAO();
		ReviewDTO[] arr = null;

		
		String movieName = request.getParameter("movieName");
		System.out.println(movieName);
		// 페이징 관련 세팅 값들
		int page = 1; // 현재 페이지 (디폴트 1 page)
		int writePages = 10; // 한 [페이징] 에 몇개의 '페이지' 를 표현할 것인가?
		int pageRows = 8; // 한 '페이지' 에 몇개의 글을 리스트업 할 것인가?
		int totalPage = 0; // 총 몇 '페이지' 분량인가?
		int cnt = 0; // 글은 총 몇개인가?

		// 현재 몇 페이지 인지 확인
		String param = request.getParameter("page");
		if (param != null && !param.trim().equals("")) {
			try {
				page = Integer.parseInt(param);
			} catch (NumberFormatException e) {
				// 별도의 처리는 안함
			}
		}
		
		if(movieName == null) {
		
		
		try {
			// 글 전체 개수 구하기
			cnt = dao.countAll();
			
			// 총 몇페이지 분량인가?
			totalPage = (int) Math.ceil(cnt / (double) pageRows);
			
			// 몇번째 row 부터?
			int fromRow = (page - 1) * pageRows; // MySQL은 0부터 시작!
			
			arr = dao.selectFromRow(fromRow, pageRows);
			
			request.setAttribute("list", arr);
			request.setAttribute("page", page);
			request.setAttribute("totalPage", totalPage);
			request.setAttribute("writePages", writePages);
			request.setAttribute("pageRows", pageRows);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		} else {
			try {
				movieName = "%" + movieName + "%";
				cnt = dao.countMovie(movieName);

				// 총 몇페이지 분량인가?
				totalPage = (int) Math.ceil(cnt / (double) pageRows);

				// 몇번째 row 부터?
				int fromRow = (page - 1) * pageRows; // MySQL은 0부터 시작!


				arr = dao.selectFromRow(fromRow, pageRows, movieName);
				System.out.println("들어옴");

				request.setAttribute("list", arr);
				request.setAttribute("page", page);
				request.setAttribute("totalPage", totalPage);
				request.setAttribute("writePages", writePages);
				request.setAttribute("pageRows", pageRows);
				
				

			} catch (SQLException e) {
				e.printStackTrace();
			}




			
			
		}
		
		
	} // end excute()

}
