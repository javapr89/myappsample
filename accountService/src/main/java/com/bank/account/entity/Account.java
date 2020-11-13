package com.bank.account.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.bank.customer.entity.Customer;


@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Account_id")
	private long Account_id;
	
	
	@Column(name="Account_Bal")
	private int Account_Bal;
	
	@Column(name="created_on")
	private Date created_on;
	
	@Column(name="lastmodified_date")
	private Date  lastmodified_date;
	
	@OneToOne
	private Customer customer;
	
	
	Account(int Account_id,int Account_Bal, Date created_on, Date lastmodified_date)
	{
		this.Account_id=Account_id;
		this.Account_Bal=Account_Bal;
		this.created_on=created_on;
		this.lastmodified_date=lastmodified_date;	
	}
	
	public long getAccount_id() {
		return Account_id;
	}
	public long getAccount_Bal() {
		return Account_Bal;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public Date getLastmodified_date() {
		return lastmodified_date;
	}
	
	
	
	
	
	
	

}
