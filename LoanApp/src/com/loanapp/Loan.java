package com.loanapp;


public class Loan {
	private String username;
	private double amount;
	private String state;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		//some comment
		this.username = username;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public boolean isapproved(){
	    return true;
	}
}