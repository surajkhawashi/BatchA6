package com.crm.prickBaseClass;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
	
 public static	WebDriver driver;
	
	public void preCodition()
	{
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://app.thepric.com/priclogin");
		
		driver.findElement(By.name("tel")).sendKeys("9579748029");
		
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		
	}
	
	public void otpValidation() throws InterruptedException
	{
		Scanner s = new Scanner(System.in);
		Reporter.log("enter first",true);
		driver.findElement(By.xpath("(//input[@class='pincode-input-text'])[1]")).sendKeys(""+s.nextInt());
		
		Reporter.log("enter second",true);
		driver.findElement(By.xpath("(//input[@class='pincode-input-text'])[2]")).sendKeys(""+s.nextInt());
		
		Reporter.log("enter third",true);
		driver.findElement(By.xpath("(//input[@class='pincode-input-text'])[3]")).sendKeys(""+s.nextInt());
		
		Reporter.log("enter fourth",true);
		driver.findElement(By.xpath("(//input[@class='pincode-input-text'])[4]")).sendKeys(""+s.nextInt());
		
		
		driver.findElement(By.xpath("//button[text()='Verify OTP']")).click();
		
		Thread.sleep(2000);
		
		
	}

}
