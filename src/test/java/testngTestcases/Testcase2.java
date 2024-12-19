package testngTestcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase2 {

	/*
	 * Hard Assert - whenever there is a failure. It terminates the test
	 * Assert - class
	 * 
	 * Soft Assert - we can proceed with the execution of further lines of code through
	 * there is an assertion failure.
	 * SoftAssert  - class
	 * sAssert.assertAll();
	 * 
	 */
	@Test
	void launchingBrowser() {
		String expectedtitle="facebook.com";
		String actualTitle = "gmail.com";
		
		if(actualTitle.equals(expectedtitle)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failure");
		}
		
		Assert.assertEquals(actualTitle,expectedtitle);//pass - fail
		Assert.assertTrue(false);
		Assert.assertFalse(true);
		System.out.println("Line 1");
		System.out.println("Line 2");
		System.out.println("Line 3");
		System.out.println("Line 4");
	}
	
	//@Test
	void softAssertDemo() {
		SoftAssert sAssert = new SoftAssert();
		
		String expectedtitle="facebook.com";
		String actualTitle = "gmail.com";
		
		if(actualTitle.equals(expectedtitle)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failure");
		}
		
		sAssert.assertEquals(actualTitle,expectedtitle);//pass - fail
		sAssert.assertTrue(false);
		sAssert.assertFalse(true);
		System.out.println("Line 1");
		System.out.println("Line 2");
		System.out.println("Line 3");
		System.out.println("Line 4");
		sAssert.assertAll();
		
	}
	
	//@Test
	void assertTrueDemo() {
		String expectedtext="facebook.com";
		Assert.assertTrue(expectedtext.contains("c"),"Your expected text does not have the given character. Please check once");
		//assertTrue(true) -- TC pass
		//Assert.assertFalse(condition)
		//assertFalse(false) -- TC pass
	}
	
	//@Test
	void assertFalseDemo() {
		String expectedtext="facebook.com";
		Assert.assertFalse(expectedtext.contains("z"),"Your character is present in the expected text");
		
	}
	
	//@Test
	void IntentionallyFail() {
		Assert.fail("Fails the testcase intentionally");
	}
	
	//@Test
	void IntentionallySkip() {
		throw new SkipException("Intentionnally skipped the testcase");
	}
	
	
}
