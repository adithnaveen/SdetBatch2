package com.fannie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fannie.beans.Account;
import com.fannie.bl.AccountBL;
import com.fannie.interfaces.IAccountBL;


/* 
 * you will never have any printable statements here 
 */

@WebServlet("/accins.do")
public class AccountInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		IAccountBL account = new AccountBL();
		
		if(account.insertAccount(getAccount(request))){
			// forward to Success page
			String uri ="/WEB-INF/view/Success.jsp"; 
			request.getRequestDispatcher(uri).forward(request, response);
		}else{
			// Say sorry
			String uri ="/WEB-INF/view/Failure.jsp";
			request.getRequestDispatcher(uri).include(request, response);
		}
		
	}

	
	public Account getAccount(HttpServletRequest request){
		Account temp = new Account();
		temp.setAccId(Integer.parseInt(request.getParameter("accid")));
		temp.setAccType(request.getParameter("acctype"));
		temp.setBalance(Double.parseDouble(request.getParameter("accbal")));
		return temp;
	}
	
}
