package pric;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.prickBaseClass.BaseClass;

public class Pric_006 extends BaseClass {
	
	@Test
	public void deleteLockedMessage() throws InterruptedException {
        preCodition();
		
		otpValidation();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Locked Message']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//i[@class='fe fe-trash']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	}

}
