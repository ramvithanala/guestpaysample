package com.syf.consumercenter.Guestpay.entity;

public class Account {
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
