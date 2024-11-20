package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {
/*
 * button - tagname(button/input)
 * 
 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		WebElement loginBtn=driver.findElement(By.name("login"));
		//click
		//getText
		System.out.println(loginBtn.getText());
		loginBtn.click();
		

	}

}
