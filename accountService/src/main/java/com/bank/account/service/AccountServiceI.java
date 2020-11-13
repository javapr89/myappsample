package com.bank.account.service;

import com.bank.account.entity.Account;

public interface AccountServiceI {
	
	boolean createAccount(Account acc);
	
	boolean updateAccount(Account acc);
	
	boolean deleteAccount(Account acc);
	

}
