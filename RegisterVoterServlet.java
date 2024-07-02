package com.skillogic.voterregister;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegisterVoterServlet extends GenericServlet{

	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("uname");
		String age=req.getParameter("uage");
		int uage=Integer.parseInt(age);
		String phone=req.getParameter("phone");
		String gender=req.getParameter("gender");
		String city=req.getParameter("city");
		String address=req.getParameter("address");
		pw.println("<html><body>");
		pw.println("<h3 style='color:blue;text-align:center'>user details</h3><br>");
		pw.println("Name::"+name+"<br>");
		pw.println("Age::"+uage+"<br>");
		pw.println("Contact::"+phone+"<br>");
		pw.println("Gender::"+gender+"<br>");
		pw.println("City::"+city+"<br>");
		pw.println("Address::"+address+"<br>");
		pw.println("</body></html>");
	}
}