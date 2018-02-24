package com.suresh.servlets;

import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.time.DateUtils;

import com.suresh.Entitys.Customers;
import com.suresh.dao.Dao;
import com.suresh.dao.DaoImpl;
import com.suresh.exceptions.CustomException;

public class AddingCustomers {

	public static boolean prepareCustomerRequest(HttpServletRequest request) throws CustomException {
		Dao dao = new DaoImpl();
		Customers customer = new Customers();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		Date dob;
		try {
			dob = DateUtils.parseDate(request.getParameter("dob"), "MM-dd-yyyy");
		} catch (ParseException e) {
			throw new RuntimeException("Invalid dob " + request.getParameter("dob"));
		}
		String email = request.getParameter("email");
		String company = request.getParameter("company");
		String phone = request.getParameter("phone");

		customer.setDob(dob);
		customer.setEmail(email);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setCompany(company);
		boolean status = dao.addCustomer(customer);

		return status;
	}
}
