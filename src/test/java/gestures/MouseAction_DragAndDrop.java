package gestures;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_DragAndDrop {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(source, destination).perform();
		
		String actualText=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
		if(actualText.equals("Dropped!")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Failed");
		}
	
	}
}
