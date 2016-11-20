package com.fannie.bl;

import java.util.ArrayList;
import java.util.List;

import com.fannie.beans.Account;
import com.fannie.interfaces.IAccountBL;

// this class will have methods for CRUD operations 
// CREATE, READ, UPDATE, DELETE
public class AccountBL implements IAccountBL{

	@Override
	public boolean insertAccount(Account account) {
		// assuming DB operations go here... 
		return true;
	}

	@Override
	public List<Account> getAllAccounts() {

		List<Account> list = new ArrayList<Account>();
		list.add(new Account(101, "Savings", 10000));
		list.add(new Account(102, "Fixed", 5000));
		list.add(new Account(103, "Current", 30000));
		
		return list;
		
	}

	@Override
	public Account getAccount(int accNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
