package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		/*
		 * links - a(tagname)
		 */

		WebElement link = driver.findElement(By.linkText("Create new account"));
		System.out.println(link.getText());
		link.click();
	}

}
