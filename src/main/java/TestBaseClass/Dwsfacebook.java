package TestBaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Dwsfacebook {
	
	public WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeClass
	public void preCondition(String browser,String url) {
	 if (browser.equals("Chrome")) {
		driver = new ChromeDriver();
	}
	 if (browser.equals("Edge")) {
		driver = new EdgeDriver();
	}
	 if (browser.equals("Firefox")) {
		driver = new FirefoxDriver();
	}
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		Properties prop = new Properties();
	     FileInputStream fis = new FileInputStream("C:\\Users\\skhaw\\eclipse-workspace\\com.crm.advancedSeleniumA6\\ConfigureFile\\LogInFunction.Properties");
	     prop.load(fis);
	     String email = prop.getProperty("email");
	     String password = prop.getProperty("Password");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);		
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.className("ico-logout")).click();
	}
	
	@AfterClass
	public void pastCondition() {
		driver.quit();
	
}

}

	
	


