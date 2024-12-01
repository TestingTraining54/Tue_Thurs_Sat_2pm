package windowsHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		
		driver.findElement(By.linkText("Meta Pay")).click();
		driver.findElement(By.linkText("Meta Quest")).click();
		Set<String> allWindows = driver.getWindowHandles();
		
		
		Iterator<String> it = allWindows.iterator();
		String parentWindowID = it.next();//facebook.com
		String childWindow1 = it.next();//child1
		String childWindow2 = it.next();//child2
		
		
		driver.switchTo().window(childWindow2);
		System.out.println("Second tab: " + driver.getTitle());
		driver.findElement(By.linkText("Check availability")).click();
		/*
		 * while(it.hasNext()) { //System.out.println(it.next());
		 * driver.switchTo().window(it.next()); System.out.println(driver.getTitle());
		 * 
		 * }
		 */
	}
}
		
		
		
		/*for(String a:allWindows) {
			System.out.println(a);
			/*
			 * if(!a.equals(parentWindow)) { driver.switchTo().window(a);
			 * driver.findElement(By.linkText("Check availability")).click(); }
			 */
		
		
	
