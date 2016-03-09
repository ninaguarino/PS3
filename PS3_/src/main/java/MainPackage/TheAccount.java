package MainPackage;

import java.util.Date;

public class TheAccount {

	class Account {
		// define private data fields
		private int iD = 0;
		private double balance = 0.0;
		private double annualInterestRate = 0.0;
		private Date dateCreated;

		// no arg construtor
		Account() {
		}

		// A constructor that creates an account with the specified id and
		// initial balance and annual interest rate.

		Account(int iD, double balance) {
			this.iD = iD;
			this.balance = balance;
		}

		// The accessor methods for id, balance, annualInterestRate, and
		// dateCreated.
		public int getiD() {
			return this.iD;
		}

		public double getBalance() {
			return this.balance;
		}

		public double getAnnualInterestRate() {
			return this.annualInterestRate;
		}

		public String getdateCreated() {
			return dateCreated.toString();
		}

		// The mutator methods for id, balance, annualInterestRate, and
		// dateCreated.
		public void setiD(int iD) {
			this.iD = iD;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}

		public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
		}

		// A method named getMonthlyInterestRate() that returns the monthly
		// interest rate.
		public double getMonthlyInterestRate() {
			return getAnnualInterestRate() / 12;
		}

		// A method named withdraw that withdraws a specified amount from the
		// account.
		public double withdraw(double amount) throws InsufficientFundsException {
			double currentBalance = this.getBalance();
			if (currentBalance > amount){
				setBalance(currentBalance - amount);
				return getBalance();
			}
				else
					throw new InsufficientFundsException(currentBalance - amount);
			
			
		}
		// A method named deposit that deposits a specified amount to the
		// account.
		protected void deposit(double amount) {
			balance = balance + amount;
		}
		
		// A method that prints the balance, the monthly interest and the date the account was created.
		public String toString(){
			return "Current Balance: $" + getBalance() +  " Monthly Interest Rate: " + (getMonthlyInterestRate() * 100) + 
					"%" + " Date Account Created: " + getdateCreated();
		}		
		
	}

}