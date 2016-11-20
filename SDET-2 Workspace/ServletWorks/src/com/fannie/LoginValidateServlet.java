package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login.do")
public class LoginValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
				HttpServletResponse response) 
					throws ServletException, IOException {

		// all requests to servlet comes with request object 
		// and response is given with response object 
		
		String uName = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// this validate over time will happen with DB
		out.println("<html><body>");
		if(uName.equals("java") && pass.equals("fannie")){
			request.getRequestDispatcher("Home.do").forward(request, response);
		}else{
			out.println("<h2>Sorry Invalid Credentidials </h2><hr />");
			request.getRequestDispatcher("LoginForm.html").include(request, response);
		}
		out.print("</body></html>");
	}

}
