package com.naveen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetEmployeeController
 */
@WebServlet("/GetEmployee.do")
public class GetEmployeeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Req made... ");
		String str = "<table border='3'>";
		String name = request.getParameter("name");
		
		for(Emp emp :new EmployeeDAO().getEmps(name)){
			str +="<tr><td>" + emp.getEmpId() +"</td><td>"+emp.getEmpName()+"</td></tr>";
		}
		str+="</table>";
		response.setContentType("text/html");
		response.getWriter().print(str);
	}

}
