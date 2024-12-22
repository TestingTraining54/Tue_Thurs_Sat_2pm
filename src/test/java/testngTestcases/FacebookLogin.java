package testngTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class FacebookLogin {
	
	WebDriver driver;
	
	@Parameters({"browser","siteurl"})
	@BeforeMethod
	public void setUP(String browserName,String siteurl) {
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(siteurl);
	}
	
	@Test(dataProvider = "data")
	public void doFbLogin(String username,String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
	}
	
	
	  @AfterMethod
	  public void tearDown()
	  { 
		  driver.close(); 
	  }
	 
	
	@DataProvider(name="data")
	public Object[][] getData(){
		
		ExcelReader excel = new ExcelReader("./src/test/resources/excelData/fbData.xlsx");
		String sheetName="FbLogin";
		int noOfRows=excel.getRowCount(sheetName);//4
		int noOfCols=excel.getColumnCount(sheetName);//2
		System.out.println("No. of Rows: " + noOfRows);//4
		System.out.println("No. of Cols: " + noOfCols );//2
		
		Object[][] data = new Object[noOfRows-1][noOfCols];
		
		for(int row=2;row<=noOfRows;row++) {//row=4 4<=4
			for(int col=0;col<noOfCols;col++) {//col=0;0<2
				data[row-2][col] = excel.getCellData(sheetName,col,row);
				//data[2][1] = excel.getCellData(sheetName,1,4);
			}
		}
		
		
		/*
		 * data[0][0] = excel.getCellData(sheetName,0,2); 
		 * data[0][1] = excel.getCellData(sheetName,1,2);
		 * 
		 * data[1][0] = excel.getCellData(sheetName,0,3); 
		 * data[1][1] = excel.getCellData(sheetName,1,3);
		 * 
		 * data[2][0] = excel.getCellData(sheetName,0,4); 
		 * data[2][1] = excel.getCellData(sheetName,1,4);
		 */
		
		return data;
	}
}
