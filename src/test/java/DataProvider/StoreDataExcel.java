package DataProvider;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StoreDataExcel {
	
	@DataProvider(name="data")
	public Object[][] sender() throws IOException  {
		Object[][] obj = new Object[2][2];
		FileInputStream fis = new FileInputStream("C:\\WpsExcel\\DwsLogin.xlsx");
		 
				
		
		return obj;
	} 
	
	@Test(dataProvider = "data")
	
	public void reciver(String data1,String data2) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(data1);		
		driver.findElement(By.id("Password")).sendKeys(data2);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.close();
	}

}
