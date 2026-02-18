	package com.linkcode.encapsulation;
	
	public class Customer {
		//private Getter Setter
		
		private int accno;
		String name;
		long mobile;
		String add;
		private double bankBalance;
		private String Pass;
		
		
		public Customer(int accno, String name, long contact, String add, double bankBalance,String Pass) {
			super();
			this.accno = accno;
			this.name = name;
			this.mobile = contact;
			this.add = add;
			this.bankBalance = bankBalance;
			this.Pass = Pass;
		}
		public String getPass() {
			return this.Pass;
		}
	
		public double getBankBalance() {
			return this.bankBalance;
		}
		
		public void setBankBalance(double amount) {
			this.bankBalance+=amount;
		}
		
		public int getAccNo() {
			return this.accno;
		}
		public void setAccNo(int no) {
			this.accno=no;
		}
		
		public void displayInfo() {
			System.out.println("Account No :"+this.accno);
			System.out.println("Name :"+this.name);
			System.out.println("Contact No :"+this.mobile);
			System.out.println("Address :"+this.add);
			System.out.println("Bank Balance"+bankBalance);
		}
		
		

		public void withdraw(double amount) {
			System.out.println("withdrawing Amount....");
			this.bankBalance-=amount;
			System.out.println("Available Balance :"+this.bankBalance);
			
			
		}
		public void deposit(double amount) {
			System.out.println("Depositing Amount ");
			this.bankBalance+=amount;
			System.out.println("Available Balance :"+this.bankBalance);
			
		}
		
		
		
	}
