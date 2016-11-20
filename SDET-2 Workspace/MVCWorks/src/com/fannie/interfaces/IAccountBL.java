package com.fannie.interfaces;

import java.util.List;

import com.fannie.beans.Account;

public interface IAccountBL {
	public boolean insertAccount(Account account);
	public List<Account> getAllAccounts();
	public Account getAccount(int accNo);
	
	
	// try having methods for update, delete 
}
