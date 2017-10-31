package com.example.guestpay.accountlookup.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.guestpay.accountlookup.dao.AccountDAO;
import com.example.guestpay.accountlookup.dao.AccountDAOImpl;
import com.example.guestpay.accountlookup.domain.Account;

@Controller

public class AccountlookupController {
	@Autowired
	private AccountDAO accountDao;
	@RequestMapping(value="/guestpay")
	String testApp(){
		
       // jdbc.execute("insert into account(acctountid,accountnumber,account_status,email_address)values('1234','12340','B','r@s.com')");  

		Account acct=new Account();
		
		acct.setAcctId(12345);
		acct.setAcctNbr(Long.valueOf(1234567));
		acct.setAcctStatus("B");
		acct.setEmailAdd("r@s.com");
		//accountDao=new AccountDAOImpl();
		accountDao.addAccount(acct);
		
		return "hello";
	}
}
