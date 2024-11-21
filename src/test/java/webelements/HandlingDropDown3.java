package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		WebElement dropDown = driver.findElement(By.id("searchLanguage"));
		Select s = new Select(dropDown);
		
		
		
		List<WebElement> allOptions = dropDown.findElements(By.tagName("option"));
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getAttribute("value"));
		}

	}

}
