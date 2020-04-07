package com.sk.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		String name = null;
		int age = 0;
		String gender = null;

		// get PrintWriter stream from res object having res as destination'
		pw = res.getWriter();
		// set contentType
		res.setContentType("text/html");
		// get request parameter value(Form Data)
		name = req.getParameter("pname");
		age = Integer.parseInt(req.getParameter("page"));
		gender = req.getParameter("gender");

		// write request processing logics
		if (gender.equalsIgnoreCase("F")) {
			pw.println("<h1 style='color:green'>" + name + " You are Eligiable for marriage</h1>");
		} else if (age < 18) {
			pw.println("<h1 style='color:green'>" + name + " You are not Eligiable for marriage</h1>");
		} else if (gender.equalsIgnoreCase("M"))
			pw.println("<h1 style='color:green'>" + name + " You are Eligiable for marriage</h1>");
		else if (age < 18) {
			pw.println("<h1 style='color:green'>" + name + " You are not Eligiable for marriage</h1>");
		}
		pw.println("<br> <a href='page.html'>Home</a>");

	}
}
