package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCalender {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement departure = driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']/label/span[@class='lbl_input appendBottom10']"));
		wait.until(ExpectedConditions.elementToBeClickable(departure));
		departure.click();
		WebElement dateSelect=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[3]/div[4]/div[7]/div/p[1]"));
		
	
		WebElement dateVerify = driver.findElement(By.xpath("//p[@data-cy='departureDate']/span[1]"));
		if(dateVerify.getText().equals("24")) {
			System.out.println("Successfully selected the prefered date");
		}
		else {
			System.out.println("Failure");
		}
	}

}
