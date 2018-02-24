package com.suresh.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suresh.Entitys.Customers;
import com.suresh.dao.Dao;
import com.suresh.dao.DaoImpl;
import com.suresh.exceptions.CustomException;

/**
 * Servlet implementation class GetCustomer
 */
public class GetCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Dao dao = new DaoImpl();
		String s = request.getParameter("custumerId");
		Integer custId = Integer.parseInt(request.getParameter("custumerId"));
		// response.getWriter().println(custId);
		try {
			Customers customer = dao.loadCustomer(custId);
			request.setAttribute("customer", customer);
			request.getRequestDispatcher("returnCustomer.jsp").forward(request, response);
			// response.getWriter().println(customer);
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
