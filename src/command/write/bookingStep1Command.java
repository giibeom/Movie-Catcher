package command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.*;

public class bookingStep1Command implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		TheaterDAO tdao = new TheaterDAO();
		TheaterDTO [] tarr = null;
		try {
			tarr = tdao.select();
			request.setAttribute("theater", tarr);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
