package com.bank.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.account.entity.Account;
import com.bank.account.repository.AccountRepositoryDAO;
import com.bank.account.service.AccountServiceI;


@Controller
public class AccountController {
	
	
	@Autowired
	 private AccountServiceI accountservice;
	
	@Autowired
	private AccountRepositoryDAO accountrepodao;
	
	
	@RequestMapping(method=RequestMethod.GET,value="/demoaccount")
	public String demoservice()
	{
		//add row to account or place entry to account.
		System.out.println("-----------------Account Demo entry placed");
		//Account save = accountrepodao.save(account);
		
		
		return "hello";
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST,value="/createaccount")
	public Account CreateAccount(@RequestBody Account account)
	{
		//add row to account or place entry to account.
		System.out.println("-----------------Account row entry placed");
		Account save = accountrepodao.save(account);
		
		
		return save;
	}
	

	@RequestMapping(method=RequestMethod.POST,value="/updateaccount")
	public boolean updateAccount(@RequestBody Account account)
	{
		//add row to account or place entry to account.
		System.out.println("Account row entry Updated");
		accountrepodao.save(account);
		
		
		return true;
	}
	
	

	@RequestMapping(method=RequestMethod.POST,value="/deleteaccount")
	public boolean deleteAccount(@RequestBody Account account)
	{
		//add row to account or place entry to account.
		System.out.println("Account row entry delete");
		accountrepodao.delete(account);
		
		
		return true;
	}
	
	
	
	
	

}
