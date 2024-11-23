package webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]")).getText());
		List<WebElement> allRows = driver.findElements(By.xpath("//table/tbody/tr"));
		int noOfRows=allRows.size();
		
		for(int i=1;i<=noOfRows;i++) {//i=2
			List<WebElement> allCols = driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td"));//cols related to particular row
			int noOfCols = allCols.size();
			for(int j=1;j<=noOfCols;j++) {//j=1
				System.out.print(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText() + " ");
			//Cierra Vega 39 cierra@example.com 10000 Insurance ""
			//Alden Cantrell	
				
			}
			System.out.println();
		}
	}

}
