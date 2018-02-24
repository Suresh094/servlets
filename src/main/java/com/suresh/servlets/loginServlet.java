package com.suresh.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suresh.Entitys.Customers;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public loginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			boolean status = AddingCustomers.prepareCustomerRequest(request);

			// Prepare response
			if (status) {
				response.getWriter().println("Customer Added");
			} else {
				response.getWriter().println("Customer not Added");
			}
		} catch (Exception e) {
			response.getWriter().println("Unable to process request");
			e.printStackTrace();
		}
	}

}
