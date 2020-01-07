package command.write;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class searchPageCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String movieName = (String) request.getAttribute("movieName");
		System.out.println(movieName);
		request.setAttribute("movieName", movieName);
	}

}
