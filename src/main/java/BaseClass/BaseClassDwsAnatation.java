package BaseClass;

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
import org.testng.annotations.Parameters;

	public class BaseClassDwsAnatation {
		public static WebDriver driver;
		
	
	
		public void preCondition(String browser) {
			
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
			driver.get("https://demowebshop.tricentis.com/");
		}
		
		
		public void login() {
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("skhawashi2002@gmail.com");		
			driver.findElement(By.id("Password")).sendKeys("suraj@123");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		
		
		public void logout() {
			driver.findElement(By.className("ico-logout")).click();
		}
		
		
		public void pastCondition() {
			driver.quit();
		
	}

}
