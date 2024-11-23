package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		WebElement block1=driver.findElement(By.xpath("(//div[@class='display'])[1]"));
		List<WebElement> allSports=block1.findElements(By.name("sports"));
		for(int i=0;i<allSports.size();i++) {
			WebElement ele = allSports.get(i);
			System.out.println(ele.getAttribute("value"));
			ele.click();
		}
		
		WebElement block2=driver.findElement(By.xpath("(//div[@class='display'])[2]"));
		List<WebElement> allSports1=block2.findElements(By.name("sports"));
		for(int i=0;i<allSports1.size();i++) {
			WebElement ele = allSports1.get(i);
			if(!ele.isSelected()) {
				ele.click();
			}
			System.out.println(ele.getAttribute("value"));
		}
	}

}
