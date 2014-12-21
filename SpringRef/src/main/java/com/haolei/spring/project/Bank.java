package com.haolei.spring.project;

public class Bank {
	private String bankName;
	private String createDate;
	private Double balance;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(String bankName, String createDate, Double balance) {
		super();
		this.bankName = bankName;
		this.createDate = createDate;
		this.balance = balance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", createDate=" + createDate
				+ ", balance=" + balance + "]";
	}

}
