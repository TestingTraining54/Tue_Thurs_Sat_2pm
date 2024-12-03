package frames_JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToAElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebElement fb = driver.findElement(By.partialLinkText("About us"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fb);
		
		fb.click();
	}

}
