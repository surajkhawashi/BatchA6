package pric;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.prickBaseClass.BaseClass;

public class Pric_view extends BaseClass {
	
	@Test
	
	public void view() throws InterruptedException
	{ 
		    preCodition();
			
			otpValidation();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[text()='Locked Message']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//i[@class='fe fe-eye']")).click();
	}

}
