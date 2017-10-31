package com.example.guestpay.accountlookup.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.guestpay.accountlookup.domain.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {
	@Autowired
    JdbcTemplate jdbcTemplate;
		@Override
		public void addAccount(Account acct) {
			//Add Account
			//jdbcTemplate=new JdbcTemplate();
			String insertQuery = "INSERT INTO account (accountid, accountnumber, account_status, email_address) values (?, ?, ?, ?)";
			jdbcTemplate.update(insertQuery, acct.getAcctId(), acct.getAcctNbr(), acct.getAcctStatus(), acct.getEmailAdd());
			
		}
}

