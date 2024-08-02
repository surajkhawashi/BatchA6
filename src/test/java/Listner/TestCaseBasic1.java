package Listner;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Listner.Basic;
import com.crm.prickBaseClass.BaseClass;

import BaseClass.BaseClassDWS;
@Listeners(com.crm.Listner.Basic.class)

public class TestCaseBasic1 extends Basic {
	@Test
	public void main() throws IOException{
	String expected_result = "https://demowebshop.tricentis.com/";
	
	String actual_result = driver.getCurrentUrl();
	assertEquals(expected_result, actual_result);
	
	}
	@Test
	public void main1() throws IOException{
		String expected_result = "https://demowebshop.tricentis.com";
		String actual_result = driver.getCurrentUrl();
		assertEquals(expected_result, actual_result);
		

   }
}
	
