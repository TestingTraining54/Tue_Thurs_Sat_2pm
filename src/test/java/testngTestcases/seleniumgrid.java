package testngTestcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class seleniumgrid {

	/*
	 * String browserName="Chrome"; String testsiteurl = "https://google.com";
	 */
	WebDriver driver;
	public Capabilities cap;
	
	@Parameters({"browser","siteurl"})
	@Test
	public void openBrowser(String browserName,String url) throws MalformedURLException {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			cap=new ChromeOptions();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			cap=new FirefoxOptions();
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			cap=new EdgeOptions();
		}
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		System.out.println("Browser -- " + browserName + "URL: " +url);
		driver.findElement(By.name("q")).sendKeys("selenium");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
