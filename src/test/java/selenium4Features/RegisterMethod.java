package selenium4Features;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try{
			((HasAuthentication) driver).register(UsernameAndPassword.of("admin","admin"));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		

	}

}
