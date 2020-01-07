package controller.write;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.write.Command;
import command.write.loginCommand;
import command.write.searchPageCommand;
import command.write.signupCommand;


@WebServlet("*.mc")
public class WriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public WriteController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		Command command = null; // 어떠한 커맨드 수행할지.
		String viewPage = null; // 어떠한 page(view);
		
		//URL로 부터 URI, ContextPath, Command 분리
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		
		String com = uri.substring(conPath.length());
		
		switch(com) {
		case "/welcome.mc":
			viewPage = "welcome.jsp";
			break;
		case "/login.mc":
			viewPage = "login.jsp";
			break;
		case "/main.mc":
			viewPage = "main.jsp";
			break;
		case "/searchPage.mc":
			//command = new searchPageCommand();
			//command.execute(request, response);
			viewPage = "searchPage.jsp";
			break;
		case "/mv_info.mc":
			viewPage = "mv_info.jsp";
			break;
		case "/loginOk.mc":
			command = new loginCommand();
			command.execute(request, response);
			viewPage = "loginOk.jsp";
			break;
		case "/signup.mc":
			viewPage = "signup.jsp";
			break;
		case "/signupOk.mc":
			command = new signupCommand();
			command.execute(request, response);
			viewPage = "signupOk.jsp";
		break;
			
			
			
			
		}
	
		
		
		if(viewPage != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}	
	}
}
