package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CratingDependencies {
	@Test(priority = 1,timeOut = 1000)
	public void CreateAccount() throws InterruptedException {
		
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.get("https://www.redbus.in/");
         Thread.sleep(2000);
         Reporter.log("Account is Created",true);
   }
   @Test(priority = 0,dependsOnMethods = "CreateAccount")
	public void DeleteAccount() {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.redbus.in/");
        Reporter.log("Account is Deleted",true);
		
	}

}
