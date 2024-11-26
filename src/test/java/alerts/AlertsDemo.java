package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Simple
		 * Confirmation
		 * Prompt
		 * 
		 * 
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		String str = "selenium";
		al.sendKeys(str);
		al.accept();
		
		
		
		
	}

}
