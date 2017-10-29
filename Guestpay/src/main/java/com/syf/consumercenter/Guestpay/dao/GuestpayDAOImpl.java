package com.syf.consumercenter.Guestpay.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.syf.consumercenter.Guestpay.entity.Account;

public class GuestpayDAOImpl implements GuestpatDAO {
		@Autowired
        private JdbcTemplate jdbcTemplate;
		@Override
		public void insertAccount(Account acct) {
			//Add Account
			String insertQuery = "INSERT INTO account (accountid, accountnumber, account_status, email_address) values (?, ?, ?, ?)";
			jdbcTemplate.update(insertQuery, acct.getAcctId(), acct.getAcctNbr(), acct.getAcctStatus(), acct.getEmailAdd());
			
		}
}
