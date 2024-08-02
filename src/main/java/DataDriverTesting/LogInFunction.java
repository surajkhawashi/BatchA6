package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInFunction {
	public static void main(String[] args) throws InterruptedException, IOException {
//		String email = JavaUtility.logindata("email");
//		String Password = JavaUtility.logindata("Password");
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\skhaw\\eclipse-workspace\\com.crm.advancedSeleniumA6\\ConfigureFile\\LogInFunction.Properties");
		prop.load(fis);
		String email = prop.getProperty("email");	
		System.out.println(email);
		String Password = prop.getProperty("Password");
		System.out.println(Password);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

}
