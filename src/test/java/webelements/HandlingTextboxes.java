package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextboxes {

	public static void main(String[] args) {
		// Textbox - type/clear - tagname - input
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("testing123");
		username.clear();

	}

}
