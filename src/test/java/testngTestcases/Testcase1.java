package testngTestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
 * BeforeClass
 * BeforeMethod
 * Testcase1
 * AfterMethod
 * BeforeMethod
 * Testcase2
 * AfterMethod
 * AfterClass
 * 
 * 
 */
public class Testcase1 {
	
	@BeforeClass
	public void makeDBConnection() {
		System.out.println("Make DB Connection");
	}
	
	@AfterClass
	public void closeDBConnection() {
		System.out.println("Closing DB connection");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("close the browser");
	}
	
	
	@Test(priority=-2)
	public void doLogin() {
		System.out.println("Login");
	}

	@Test(priority=-11)
	public void doUserReg() {
		System.out.println("User Registration");
	}
}
