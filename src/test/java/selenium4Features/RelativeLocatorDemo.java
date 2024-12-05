package selenium4Features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorDemo {
/*
 * toRightOf
 * toLeftOf
 * near
 * above
 * below
 * 
 * 
 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//max time
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.findElement(By.xpath("//a[contains(text(),'Practice Form')]")).click();
		WebElement nameLabel=driver.findElement(By.xpath("//label[text()='Name:']"));
		
		WebElement nameTxtField=driver.findElement(RelativeLocator.with(By.id("name")).toRightOf(nameLabel));
		nameTxtField.sendKeys("bhagya");
		WebElement emailTxtField = driver.findElement(RelativeLocator.with(By.tagName("input")).below(nameTxtField));
		emailTxtField.sendKeys("Testing@1234");
	}

}
