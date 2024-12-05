package selenium4Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		System.out.println("Initial Tab: " + driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://facebook.com");
		System.out.println("After opening a new Tab: " + driver.getTitle());
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://redbus.com");
		System.out.println("After opening a new window: " + driver.getTitle());
		

		driver.quit();
	}

}
