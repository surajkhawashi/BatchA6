package pric;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.prickBaseClass.BaseClass;

public class Pric_002 extends BaseClass{
	
	@Test
	public void createLockedMessage() throws InterruptedException
	{
		preCodition();
		
		otpValidation();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Locked Message']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class='btn btn-gradient-primary'])[3]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='price']")).sendKeys("12");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@name='visibleMessage']")).sendKeys("xyz");
		w
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@name='premiumContent']")).sendKeys("abc");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("bigButton")).click();
		
		
	}
	

}
