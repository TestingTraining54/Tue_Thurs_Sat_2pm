package sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*Dynamic way 
		 * 1. Implicit wait - driver - presence - NosuchElementException
		 * 2. Explicit wait - specific element - all the exceptions
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//max time
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("java@way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		/*try {
			Thread.sleep(5000);//7000
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//static way - Java
		*/
		driver.findElement(By.name("Passwd")).sendKeys("testing123");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='VfPpkd-vQzf8d'][text()='Next']"))).click();
		//driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d'][text()='Next']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span")).getText());
	}

}
