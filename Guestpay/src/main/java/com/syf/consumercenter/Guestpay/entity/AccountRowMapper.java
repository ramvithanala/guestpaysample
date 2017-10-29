package com.syf.consumercenter.Guestpay.entity;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
public class AccountRowMapper implements RowMapper<Account>{
	
	public Account mapRow(ResultSet row,int rowNum) throws SQLException{
		Account acct= new Account();
		acct.setAcctId(row.getInt("accountid"));
		acct.setAcctNbr(row.getLong("accountnumber"));
		acct.setAcctStatus(row.getString("account_status"));
		acct.setEmailAdd(row.getString("email_address"));
		return acct;
	}
}
