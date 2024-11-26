package gestures;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SequenceOfActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		WebElement email = driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		//Action - Interface
		//Actions - class
		Action a=act.keyDown(email, Keys.SHIFT)
			.sendKeys(email, "bhagya")
			.keyUp(Keys.SHIFT)
			.doubleClick(email).
			contextClick(email).build();
		a.perform();
	}

}
