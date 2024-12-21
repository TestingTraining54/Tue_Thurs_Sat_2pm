package testngTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserCompatibility {

	/*
	 * String browserName="Chrome"; String testsiteurl = "https://google.com";
	 */
	WebDriver driver;
	
	@Parameters({"browser","siteurl"})
	@Test
	public void openBrowser(String browserName,String url) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys("selenium");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
