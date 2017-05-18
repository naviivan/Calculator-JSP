package it.ivan.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.ivan.dao.Calc;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private Calc bean;   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher;
		
		int result = 0;
		String opp = request.getParameter("opp");
		
		switch (opp) {
			case "somma":	
					result = bean.add(Integer.valueOf(request.getParameter("num1")),
							Integer.valueOf(request.getParameter("num2")));				
				break;
	
			case "sott":
				result = bean.sott(Integer.valueOf(request.getParameter("num1")),
						Integer.valueOf(request.getParameter("num2")));		
				break;
				
			case "molt":
				result = bean.molt(Integer.valueOf(request.getParameter("num1")),
						Integer.valueOf(request.getParameter("num2")));		
				break;
				
			case "div":
				result = bean.div(Integer.valueOf(request.getParameter("num1")),
						Integer.valueOf(request.getParameter("num2")));		
				break;
		}
		
		request.setAttribute("result", String.valueOf(result));
		dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}
}
