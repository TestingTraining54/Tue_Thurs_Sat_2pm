package gestures;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_DragAndDropBy {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		WebElement slider = driver.findElement(By.id("slider"));
		WebElement slide = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	
		Dimension dim = slider.getSize();
		int width=dim.getWidth();//100
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(slide, width/2, 0).perform();
		act.dragAndDropBy(slide, -width/4, 0).perform();
	
	}
}
