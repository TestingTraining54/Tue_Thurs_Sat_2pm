package gestures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_MouseOver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.carwale.com/");
		WebElement newCar = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(newCar).perform();
		
		driver.findElement(By.xpath("//div[text()='Find New Cars']")).click();
		
		if(driver.getCurrentUrl().contains("/new-cars/")) {
			System.out.println("New Cars Page has been displayed");
		}
		else {
			System.out.println("Failed");
		}

	}

}
