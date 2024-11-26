package gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("driver");
//arrow down - 3 times > Enter button
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN)
			.pause(Duration.ofSeconds(2))
		   .sendKeys(Keys.ARROW_DOWN)
		   .pause(Duration.ofSeconds(2))
		   .sendKeys(Keys.ARROW_DOWN)
		   .pause(Duration.ofSeconds(2))
		   .sendKeys(Keys.ENTER).build().perform();
		
		
	}

}
