package com.bank.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bank.account.repository.AccountRepositoryDAO;
import com.bank.account.service.AccountServiceI;
import com.bank.account.service.AccountServiceImpl;

@Configuration
public class ConfigAccount {

	
	//service Bean
	@Bean
	public AccountServiceI getaccountservicebean()
	{
	return new AccountServiceImpl();	
	}
	
	
	/*
	 * public AccountRepositoryDAO getAccountRepositoryDAO() { return new
	 * AccountRepositoryDAO(); }
	 */
	
	
	
}
