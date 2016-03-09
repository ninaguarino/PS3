import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;


import MainPackage.InsufficientFundsException;
import MainPackage.TheAccount;
 
public class TheAccountTest extends TheAccount {

	
	
	@Test
	public void Test() {
		TheAccount myAccount = new TheAccount();
		assertTrue(myAccount.getiD() == 1);
		assertTrue(myAccount.getBalance() == 0);
		assertTrue(myAccount.getAnnualInterestRate() == 0.045);
		assertEqualsmyAccount.getDateCreated() , new Date());
		
	}
	
	@Test
	public void Test2() {
		TheAccount myAccount = new TheAccount();
		assertTrue(myAccount.getiD() == 1122);
		assertTrue(myAccount.getBalance() == 20000.00);
		
	}
	
	@Test
	public void test3() throws InsufficientFundsException {
		TheAccount myAccount = new TheAccount();
		try {
			myAccount.withdraw(2500.00);
		}
		catch (InsufficientFundsException e) {
			assertTrue(true);
		}
		myAccount.deposit(3000);
		assertTrue(myAccount.withdraw(2500) == 500);
		}
 
	@Test
	public void test4(){
		TheAccount myAccount = new TheAccount(1122,2000.00);
		assertEquals(myAccount.toString() , "The current balance is  $20000.0 and the monthly interest rate is 0.375%. The date account created is: " + myAccount.getdateCreated());
	}
}








