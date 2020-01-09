package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.BoardDAO;
import com.beans.BoardDTO;

public class boardCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		
		BoardDAO dao = new BoardDAO();
		BoardDTO [] arr = null;
	
		try {
			arr = dao.select();
			request.setAttribute("list", arr);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

