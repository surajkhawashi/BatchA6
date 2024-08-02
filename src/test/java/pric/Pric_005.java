package pric;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.prickBaseClass.BaseClass;

public class Pric_005 extends BaseClass {
	
	@Test
	public void editvisibleTextField() throws InterruptedException
	{
        preCodition();
		
		otpValidation();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Locked Message']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//i[@class='fe fe-edit'])[1]")).click();
		
		Thread.sleep(2000);
		
		WebElement visibleText = driver.findElement(By.xpath("//textarea[@name='visibleMessage']"));
		//visibleText.clear();
		visibleText.sendKeys(Keys.BACK_SPACE);
		visibleText.sendKeys(Keys.BACK_SPACE);
		visibleText.sendKeys(Keys.BACK_SPACE);
		visibleText.sendKeys("lmno");
		
		Thread.sleep(2000);
		driver.findElement(By.id("bigButton")).click();
	}

}
