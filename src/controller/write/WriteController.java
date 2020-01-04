package controller.write;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.write.Command;


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
		case "/":
			//command = new Command();
			command.execute(request, response);
			viewPage = "";
		break;
		}
		
		
		if(viewPage != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}	
	}
}
