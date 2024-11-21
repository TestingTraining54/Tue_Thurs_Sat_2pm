package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown2 {

	public static void main(String[] args) {
		//tagName - select
		//option - dropdown values
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		WebElement dropDown = driver.findElement(By.id("searchLanguage"));
		Select s = new Select(dropDown);
		
		/*
		 * List<WebElement> allOptions = s.getOptions();
		 * System.out.println(allOptions.size()); for(WebElement s1: allOptions) {
		 * System.out.println(s1.getText()); }
		 */
		
		List<WebElement> allOptions = driver.findElements(By.tagName("option"));
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getAttribute("value"));
		}

	}

}
