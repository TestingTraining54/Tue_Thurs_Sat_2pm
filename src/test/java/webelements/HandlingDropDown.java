package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		//tagName - select
		//option - dropdown values
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		WebElement dropDown = driver.findElement(By.id("searchLanguage"));
		Select s = new Select(dropDown);
		
		//s.selectByIndex(4);
		//s.selectByValue("nan");
		s.selectByVisibleText("Deutsch");
		

	}

}
