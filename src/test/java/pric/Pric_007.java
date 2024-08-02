package pric;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.prickBaseClass.BaseClass;

public class Pric_007 extends BaseClass {
	
	@Test
	
	public void verifyLockedMessageList() throws InterruptedException
	{
        preCodition();
		
		otpValidation();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Locked Message']")).click();
		Thread.sleep(2000);
		
		WebElement verify = driver.findElement(By.id("contained-modal-title-vcenter"));
		
		assertTrue(verify.isDisplayed(),"User is able to see Locked Messages");
	}

}
