package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCompatibility {
/* 
 * CTRL+SHIFT+O
 */
	static WebDriver driver;
	static String browser="Chrome";
	public static void main(String[] args) {
		

		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}
		
		driver.get("https://google.com");
		
		
		/*
		 * Options o=driver.manage(); Window w = o.window(); w.maximize();
		 */
		
		driver.manage().window().maximize();//method chaining
		
		String str="Selenium";
		String result=str.concat(" with Java").replace(" ", "_");
		System.out.println(result);//Selenium_with_Java
		
		String testsiteurl = driver.getCurrentUrl();
		String title=driver.getTitle();
		
		System.out.println("Browser is: " + browser);
		System.out.println("Current URl is: " + testsiteurl);
		System.out.println("Title is: " + title);
		
		driver.close();//current window
		//driver.quit();//close all windows
		
		
	}

}
