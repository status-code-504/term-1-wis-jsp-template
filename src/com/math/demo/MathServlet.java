package com.math.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MathServlet
 */
@WebServlet("/MathServlet")
public class MathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MathServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("output.jsp");
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		char operator = request.getParameter("operator").charAt(0);
		int int1 = 0;
		int int2 = 0;
		int result = 0;
		try {
			int1 = Integer.parseInt(num1);
			int2 = Integer.parseInt(num2);
			if(!(operator == '+' || operator == '-' || operator == '/' 
					|| operator == '*' || operator == '%')) {
				throw new Exception();
			}
		} catch (Exception e) {
			request.setAttribute("error", "Input error. Please check your inputs and try again.");
		}
		switch (operator) {
		case '+':
			result = int1 + int2;
			break;
		case '-':
			result = int1 - int2;
			break;
		case '*':
			result = int1 * int2;
			break;
		case '/':
			result = int1 / int2;
			break;
		case '%':
			result = int1 % int2;
		}
		request.setAttribute("result", result);
		request.setAttribute("num1", int1);
		request.setAttribute("num2", int2);
		request.setAttribute("operator", operator);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
