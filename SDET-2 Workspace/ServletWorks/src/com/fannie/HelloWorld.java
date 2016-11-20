package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
				HttpServletResponse response) 
					throws ServletException, IOException {

		
		// will tell how the data will go 
		response.setContentType("text/html");
		
		// create a writer object from response 
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("<h2>Welcome to Servlets </h2>");
		out.println("</body>");
		out.println("</html>");
	}

}
