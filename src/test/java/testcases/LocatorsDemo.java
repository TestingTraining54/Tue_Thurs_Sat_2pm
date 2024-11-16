package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
/*
 * <input type="text" class="inputtext _55r1 _6luy" name="email" 
 * id="email" data-testid="royal_email" 
 * placeholder="Email address or phone number" 
 * autofocus="1" aria-label="Email address or phone number">
 * 
 * 
 * Locator:
 * id:email
 * name:email
 * class name:inputtext _55r1 _6luy
 * xpath://*[@id="email"]
 * css selector:#email
 * linkText:(applicable for only links): Sign Up
 * partialLinkText:Information 
 * tagname: input
 * 
 * u_0_5_9i
 * u_0_5_6R
 * 
 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		String title = driver.getTitle();
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		
		username.sendKeys("testing123");
		password.sendKeys("password1");
		loginBtn.click();
		
		
	}

}
