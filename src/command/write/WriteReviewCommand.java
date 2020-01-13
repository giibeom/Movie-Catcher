package command.write;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.HandTDTO;
import com.beans.ReserveDAO;
import com.beans.ReserveDTO;
import com.beans.TicketDAO;

public class WriteReviewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws NamingException {
		int rs_num = Integer.parseInt(request.getParameter("rs_num"));
		ReserveDAO rdao = new ReserveDAO();
		TicketDAO tdao = new TicketDAO();
		ReserveDTO[] rarr = null;
		HandTDTO[] tarr = null;
		try {
			rarr = rdao.get(rs_num);
			int t_uid = rarr[0].getT_uid();
			tarr = tdao.selectByCode(t_uid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", tarr);
	}

}
