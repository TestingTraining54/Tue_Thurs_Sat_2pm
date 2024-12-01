package windowsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyundai {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyundaiusa.com/us/en");
		driver.findElement(By.xpath("//input[@placeholder='Enter ZIP Code']")).sendKeys("50032");
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

	}

}
