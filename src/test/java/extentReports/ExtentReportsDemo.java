package extentReports;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo {
	 ExtentSparkReporter htmlReports;//create html report
	 ExtentReports report;//create a testcase and add some configuration
	 ExtentTest test;//status of the testcase - pass/fail/skipped
	
	
	@BeforeTest
	public void setReport() {
		htmlReports = new ExtentSparkReporter("./reports/index.html");
		htmlReports.config().setEncoding("utf-8");
		htmlReports.config().setDocumentTitle("Automation testing");
		htmlReports.config().setReportName("selenium extent report");
		htmlReports.config().setTheme(Theme.STANDARD);
		
		report=new ExtentReports();
		report.attachReporter(htmlReports);
		report.setSystemInfo("Automation Tester", "abc");
		report.setSystemInfo("company", "citibank");
		report.setSystemInfo("build no.","1234");
		
	}	
	
	@Test
	public void doLogin() {
		test=report.createTest("login Test");
		test.info("enter username");
		test.info("enter password");
		test.info("click on login button");
		//test.pass("testcase passed");
		
	}
	
	@Test
	public void doUserReg() {
		test=report.createTest("Registration");
		test.info("enter firstname");
		test.info("enter lastname");
		test.info("enter address");
		test.info("click on register button");
		//test.fail("Fail the testcase");
		Assert.fail("Intentionally failing");
	}
	
	@Test
	public void doSkip() {
		test=report.createTest("Skip testcase");
		//test.skip("skip the testcase");
		throw new SkipException("intentionally skip");
	}
	
	@AfterMethod
	public void getStatus(ITestResult result) {
		Markup m;
		String testCaseMethod=result.getName();
		if(result.getStatus()==ITestResult.SUCCESS) {
			m=MarkupHelper.createLabel("testcase passed: " + testCaseMethod, ExtentColor.GREEN);
			test.pass(m);
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			m=MarkupHelper.createLabel("testcase failed: " + testCaseMethod, ExtentColor.RED);
			test.fail(m);
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			m=MarkupHelper.createLabel("testcase skipped: " + testCaseMethod, ExtentColor.AMBER);
			test.skip(m);
		}
		
	}
	
	@AfterTest
	public void tearDown() {
		report.flush();
	}
		
		
	
}
