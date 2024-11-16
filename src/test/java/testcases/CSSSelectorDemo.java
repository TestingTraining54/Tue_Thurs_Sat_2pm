package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("testing123");
		driver.findElement(By.cssSelector("input#email"));
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy"));
		driver.findElement(By.cssSelector("input#email[id='email']"));
		driver.findElement(By.cssSelector("a[title*=' uploading and non-users notice.']"));
		driver.findElement(By.cssSelector("a[title^='Visit']"));
		driver.findElement(By.cssSelector("a[title$='notice.']"));

	}

}
