package controller.write;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.write.AdminCommand;
import command.write.AdminDeleteCommand;
import command.write.Command;
import command.write.MpUserDeleteCommand;
import command.write.MpUserUpdateCommand;
import command.write.MpUserViewCommand;
import command.write.MypageReviewCommand;
import command.write.ResListCommand;
import command.write.ReserveOkCommand;
import command.write.ReviewCommand;
import command.write.ReviewCrawlingCommand;
import command.write.ReviewDeleteCommand;
import command.write.TheaterCommand;
import command.write.TimeTableCommand;
import command.write.WriteReviewCommand;
import command.write.WriteReviewOkCommand;
import command.write.b_deleteCommand;
import command.write.b_writeCommand;
import command.write.boardCommand;
import command.write.bookingStep1Command;
import command.write.bookingStep2Command;
import command.write.bookingStep3Command;
import command.write.loginCommand;
import command.write.ReviewdeleteOkCommand;
import command.write.searchPageCommand;
import command.write.signupCommand;
import command.write.ReviewCommand;
import scraping.GetTimeTable;


@WebServlet("*.mc")
public class WriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public WriteController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			actionDo(request, response);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			actionDo(request, response);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NamingException {
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
		case "/review.mc":
			command = new ReviewCommand();
			command.execute(request, response);
			viewPage = "review.jsp";
			break;
		case "/bookingStep1.mc":
			command = new bookingStep1Command();
			command.execute(request, response);
			viewPage = "bookingStep1.jsp";
		break;
		case "/bookingStep2.mc":
			command = new bookingStep2Command();
			command.execute(request, response);
			viewPage = "bookingStep2.jsp";
		break;	
		
		case "/bookingStep3.mc":
			command = new bookingStep3Command();
			command.execute(request, response);
			viewPage = "bookingStep3.jsp";
			break;
		case "/scraping.mc":
			command = new TheaterCommand();
			command.execute(request, response);
			command = new TimeTableCommand();
			command.execute(request, response);	
			command = new ReviewCrawlingCommand();
			command.execute(request, response);
			break;
		case "/board.mc":
			command = new boardCommand();
			command.execute(request, response);
			viewPage = "board.jsp";
			break;
		case "/b_write.mc":
			viewPage = "b_write.jsp";
			break;
		case "/b_writeOk.mc":
			command = new b_writeCommand();
			command.execute(request, response);
			viewPage = "b_writeOk.jsp";
			break;
		case "/myPage.mc" :
			viewPage = "myPage.jsp";
			break;
		case "/myPagePrivate.mc" :
			command = new MpUserViewCommand();
			command.execute(request, response);
			viewPage = "myPagePrivate.jsp";
			break;
		case "/reviewScraping.mc":
			command = new ReviewCrawlingCommand();
			command.execute(request, response);
			break;
		case "/MyuserDeleteOk.mc":
			command = new MpUserUpdateCommand();
			command.execute(request, response);
			viewPage = "MyuserDeleteOk.jsp";
			break;
		case "/MyPageUpdateOk.mc":
			command = new MpUserUpdateCommand();
			command.execute(request, response);
			viewPage = "MyPageUpdateOk.jsp";
			break;
		case "/reserveOk.mc" :
			command = new ReserveOkCommand();
			command.execute(request, response);
			viewPage = "reserveOk.jsp";
			break;
		case "/myPageResList.mc" :
			command = new ResListCommand();
			command.execute(request, response);
			viewPage = "myPageResList.jsp";
			break;
		case "/writeReview.mc" :
			command = new WriteReviewCommand();
			command.execute(request, response);
			viewPage = "writeReview.jsp";
			break;
		case "/writeReviewOk.mc" :
			command = new WriteReviewOkCommand();
			command.execute(request, response);
			viewPage="writeReviewOk.jsp";
			break;
		case "/MypageReview.mc" :
			command = new MypageReviewCommand();
			command.execute(request, response);
			viewPage="MypageReview.jsp";
			break;
		case "/reviewdelete.mc" :
			command = new ReviewDeleteCommand();
			command.execute(request, response);
			viewPage="reviewdelete.jsp";
			break;
		case "/reviewdeleteOk.mc" :
			command = new ReviewdeleteOkCommand();
			command.execute(request, response);
			viewPage="reviewdeleteOk.jsp";
			break;
		case "/admin.mc":
			command = new AdminCommand();
			command.execute(request, response);
			viewPage = "admin.jsp";
			break;
		case "/adminDeleteOk.mc" :
			command = new AdminDeleteCommand();
			command.execute(request, response);
			viewPage = "adminDeleteOk.jsp";
			break;
		case "/b_deleteOk.mc" :
			command  = new b_deleteCommand();
			command.execute(request, response);
			viewPage = "b_deleteOk.jsp";
			break;
			
		}
		
	
		
		
		if(viewPage != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}	
	}
}
