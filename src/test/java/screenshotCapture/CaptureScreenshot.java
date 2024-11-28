package screenshotCapture;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshot {
	static 	WebDriver driver;
	static String browserName = "firefox";
	public static void takeFullPageScreenshot() throws IOException {
		Date d=new Date();
		String fileName = "Full Page_" +d.toString().replace(" ", "_").replace(":","_") + ".png";
		File screenshot =  ((FirefoxDriver) driver).
				getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshot/"+fileName));
	}
	
	
	public static void takeScreenshot() throws IOException {
		
		Date d=new Date();
		String fileName = d.toString().replace(" ", "_").replace(":","_") + ".png";
		File screenshot =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshot/"+fileName));
	}
	
    public static void takeElementScreenshot(WebElement ele) throws IOException {
		
		Date d=new Date();
		String fileName ="ele_"+d.toString().replace(" ", "_").replace(":","_") + ".png";
		File screenshot = ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshot/"+fileName));
	}

	public static void main(String[] args) throws IOException {
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		//WebElement googleSearchbtn = driver.findElement(By.xpath("(//*[@name='btnK'])[2]"));
		if(browserName.equals("firefox")) {
			takeFullPageScreenshot();
		}
		
		takeScreenshot();
		
		
		//takeElementScreenshot(googleSearchbtn);
		
		driver.get("https://gmail.com");
		
		takeScreenshot();
	}

}
