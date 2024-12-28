package testngTestcases;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import extentlisteners.ExtentListeners;

public class Test1 {

	@Test
	public void doLogin() {
		
		ExtentListeners.test.info("enter username");
		ExtentListeners.test.info("enter password");
		ExtentListeners.test.info("click on login button");
		//test.pass("testcase passed");
		
	}
	
	@Test
	public void doUserReg() {
		
		ExtentListeners.test.info("enter firstname");
		ExtentListeners.test.info("enter lastname");
		ExtentListeners.test.info("enter address");
		ExtentListeners.test.info("click on register button");
		//test.fail("Fail the testcase");
		Assert.fail("Intentionally failing");
	}
	
	@Test
	public void doSkip() {
		
		//test.skip("skip the testcase");
		throw new SkipException("intentionally skip");
	}
}
