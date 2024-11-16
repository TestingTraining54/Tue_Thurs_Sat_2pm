package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		/*
		 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
		 * "testingselenium123");
		 * driver.findElement(By.xpath("//input[@id='pass'][@name='pass']")).sendKeys(
		 * "selenium");
		 * driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
		 */
		driver.findElement(By.xpath("//input[@name='pass']/preceding::input[1]")).sendKeys("testing123");//username or email
		driver.findElement(By.xpath("(//div[@class='_6lux'])[2]")).sendKeys("selenium");
		driver.findElement(By.xpath("//a[contains(@title,'and non-users notice.')]"));
		driver.findElement(By.xpath("//a[text()='Meta Pay']"));
		driver.findElement(By.xpath("//h2[contains(text(),'connect and share with the people in your life')]"));
		

	}

}
