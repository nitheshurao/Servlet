package com.serlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet {
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n = Integer.parseInt(request.getParameter("n1"));  

		int n2 = Integer.parseInt(request.getParameter("n2"));  
		
		int k= n+n2;
		
		
		  PrintWriter out = response.getWriter();  
		  out.print( "sqr no : "+k);
		//  RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
	      //  rd.forward(request,response);  
	}
	
}
