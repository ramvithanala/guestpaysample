package com.example.guestpay.accountlookup.domain;

public class Account {
	public Account(int acctId, Long acctNbr, String acctStatus, String emailAdd) {
		super();
		this.acctId = acctId;
		this.acctNbr = acctNbr;
		this.acctStatus = acctStatus;
		this.emailAdd = emailAdd;
	}
	private int acctId;
	private Long acctNbr;
	private String acctStatus;
	private String emailAdd;
	public int getAcctId() {
		return acctId;
	}
	@Override
	public String toString() {
		return "Account [acctId=" + acctId + ", acctNbr=" + acctNbr + ", acctStatus=" + acctStatus + ", emailAdd="
				+ emailAdd + "]";
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}
	public Long getAcctNbr() {
		return acctNbr;
	}
	public void setAcctNbr(Long acctNbr) {
		this.acctNbr = acctNbr;
	}
	public String getAcctStatus() {
		return acctStatus;
	}
	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
}
