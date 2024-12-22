package testngTestcases;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener implements ITestListener{

	public void onTestStart(ITestResult result) {
	   Reporter.log("Test case has been started: " +result.getName());
	  }
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case has been passed: " +result.getName());
	  }
	
	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("Test case has been failed: " +result.getName());
		Reporter.log("<a href=\"C:\\Users\\91733\\OneDrive\\Desktop\\nw.jpg\" target=\"_blank\">ScreenshotLInk</a>");
	  }
	
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test case has been skipped: " +result.getName());
	  }
}
