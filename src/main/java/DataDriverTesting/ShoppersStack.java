package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String semail = JavaUtility.logindata("semail");
		String spassword = JavaUtility.logindata("spassword");
		
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("C:\\Users\\skhaw\\eclipse-workspace\\com.crm.advancedSeleniumA6\\ConfigureFile\\LogInFunction.Properties");
//		prop.load(fis);
//		String semail = prop.getProperty("semail");
//		System.out.println(semail);
//		String spassword = prop.getProperty("spassword");
//		System.out.println(spassword);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.id("Email")).sendKeys(semail);
		Thread.sleep(1000);
		
		driver.findElement(By.id("Password")).sendKeys(spassword);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		Thread.sleep(1000);
	}
}
