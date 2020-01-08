package controller.ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.write.AjaxListCommand;
import command.write.Command;
import command.write.ticketCommand;


@WebServlet("*.ajax")
public class AjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	 public AjaxController() {
	        super();
	    }

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ajaxAction(request, response);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ajaxAction(request, response);
		}
		
		protected void ajaxAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("ajaxAction()");
	request.setCharacterEncoding("utf-8");
			
			Command command = null; // 어떠한 커맨드 수행할지.
			String viewPage = null; // 어떠한 page(view);
			
			//URL로 부터 URI, ContextPath, Command 분리
			String uri = request.getRequestURI();
			String conPath = request.getContextPath();
			
			String com = uri.substring(conPath.length());
			//테스트 출력
			System.out.println("uri : " + uri  + "\nconPath : " + conPath);
			System.out.println("com : " + com);//url에서 커맨드 추출하기
			
			switch(com) {
			case "/ticket.ajax" : //글목록 ajax 요청
				new ticketCommand().execute(request, response);
				new AjaxListCommand().execute(request, response);
				break;
			}
		}
}
