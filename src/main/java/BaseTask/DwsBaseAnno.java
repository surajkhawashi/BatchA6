package BaseTask;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import DataDriverTesting.JavaUtility;

public class DwsBaseAnno  {

public static WebDriver driver;
	
	
	@BeforeClass
	public void preCondition() throws IOException {
		String browser = JavaUtility.logindata("browser");
		String url = JavaUtility.logindata("url");
	 if (browser.equals("Chrome")) {
		driver = new ChromeDriver();
	}
	 else if (browser.equals("Edge")) {
		driver = new EdgeDriver();
	}
	 else if (browser.equals("Firefox")) {
		driver = new FirefoxDriver();
	}
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		String username = JavaUtility.logindata("username");
		String password = JavaUtility.logindata("password");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(username);		
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.className("ico-logout")).click();
		
	}
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}
}
