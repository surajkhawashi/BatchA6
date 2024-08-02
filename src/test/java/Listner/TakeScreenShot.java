package Listner;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.BaseClassDwsAnatation;

@Listeners(com.crm.Listner.Basic.class)

public class TakeScreenShot extends BaseClassDwsAnatation{
	
	@Test
	public void main() {
	    String expected_url="https://demowebshop.tricentis.com";
		preCondition("browser");
		String actual_result = driver.getCurrentUrl();
		assertEquals(expected_url,actual_result);
		Reporter.log("main",true);
		
		}

	@Test
		public void main1() {
			
		    String expected_url="https://demowebshop.tricentis.com/";
			preCondition("browser");
			String actual_result = driver.getCurrentUrl();
			assertEquals(expected_url,actual_result);
			Reporter.log("main1",true);

			
	}
	

}
