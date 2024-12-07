package ReadProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadPropertiesDemo {
	/*
	 * log4j - Add dependency
	 * Place the .properties file related log4j
	 * Logger log=Logger.getLogger(ReadPropertiesDemo.class);
	 * PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
	 */
	
	static WebDriver driver;
	static FileInputStream fis;
	static Logger log=Logger.getLogger(ReadPropertiesDemo.class);
	
	public static void main(String[] args) throws IOException {
		
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		
		fis= new FileInputStream("./src/test/resources/properties/config.properties");
		Properties config = new Properties();
		config.load(fis);
		log.info("Config file has been loaded");
		
		
		  System.out.println(config.getProperty("browser"));//chrome
		  System.out.println(config.getProperty("testsiteurl"));//
		 		
		fis=new FileInputStream("./src/test/resources/properties/or.properties");
		Properties or = new Properties();
		or.load(fis);
		log.info("OR file has been loaded");
		System.out.println(or.getProperty("emailTxtbox_ID"));//chrome
		System.out.println(or.getProperty("passwordTxtbox_NAME"));//
		
		
		if(config.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
			log.info("Chrome Browser has been launched");
		}
		
		else if(config.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
			log.info("Firefox Browser has been launched");
		}
		
		else if(config.getProperty("browser").equals("edge")) {
			driver = new EdgeDriver();
			log.info("Edge Browser has been launched");
		}
		
		driver.manage().window().maximize();
		log.info("Browser has been maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicitWait"))));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(config.getProperty("explicitWait"))));
		
		driver.get(config.getProperty("testsiteurl"));
		log.info("Launched url: " + config.getProperty("testsiteurl"));
		//driver.findElement(By.id("email123"));
		try {
		driver.findElement(By.id(or.getProperty("emailTxtbox_ID"))).sendKeys("testing123@gmail.com");
		log.info("Entered username with keyword as: " + or.getProperty("emailTxtbox_ID") + " with value as testing123@gmail.com");
		
		driver.findElement(By.name(or.getProperty("passwordTxtbox_NAME"))).sendKeys("password123");
		log.info("Entered password with keyword as: " + or.getProperty("passwordTxtbox_NAME") + " with value as password123");
		
		driver.findElement(By.xpath(or.getProperty("loginBtn_XPATH"))).click();
		log.info("Clicked on login button"+ or.getProperty("loginBtn_XPATH"));
		}
		
		catch(Exception e) {
			log.error(e.getMessage());
		}
		
	}

}
