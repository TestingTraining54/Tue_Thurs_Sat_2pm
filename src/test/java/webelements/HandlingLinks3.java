package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		WebElement block = driver.findElement(By.xpath("//nav[@class='other-projects']"));
		List<WebElement> allLinks = block.findElements(By.tagName("a"));
		System.out.println(allLinks.size());//13
		
		for(WebElement a: allLinks) {
			//System.out.println(a.getText());
			String linkText=a.getText();
			if(linkText.contains("Commons")) {
				a.click();
				break;
			}
		}
	
	}

}
