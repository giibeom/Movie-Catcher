package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.TheaterDAO;
import com.beans.TheaterDTO;

/**
 * Servlet implementation class cinemaMap
 */
@WebServlet("/cinemaMap")
public class cinemaMap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cinemaMap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TheaterDAO dao = new TheaterDAO();
		TheaterDTO[] list = null;
		try {
			list = dao.select();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("list", list);
		RequestDispatcher  dispatcher = request.getRequestDispatcher("findcinema.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
