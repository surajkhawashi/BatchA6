package pric;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.prickBaseClass.BaseClass;

public class Pric_004 extends BaseClass {
	
	@Test
	public void editAmountTextField() throws InterruptedException
	{
        preCodition();
		
		otpValidation();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Locked Message']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//i[@class='fe fe-edit'])[1]")).click();
		
		Thread.sleep(2000);
		
		WebElement price = driver.findElement(By.xpath("//input[@name='price']"));
		
		price.sendKeys(Keys.BACK_SPACE);
		price.sendKeys(Keys.BACK_SPACE);
		price.sendKeys("15");
		
		Thread.sleep(2000);
		driver.findElement(By.id("bigButton")).click();
	}

}
