package ExtentReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginFunctionwithCorrectCredential {
	@Test
	
	public void CorrectCredential() throws InterruptedException {
		//create spark Reporter
				ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/SampleReport.html");
				//Configure the spark Reporter
				spark.config().setDocumentTitle("SampleReport");
				
				spark.config().setReportName("Suraj");
				
				spark.config().setTheme(Theme.DARK);
				
				//create the extent report
				
				ExtentReports report = new ExtentReports();
				
				report.setSystemInfo("Os", "Window-11");
				
				//attack the spark reporter to the extent report
				
				report.attachReporter(spark);
				ExtentTest test  = report.createTest("CorrectCredential");
				
	         	WebDriver driver = new ChromeDriver();
	         	
	        	driver.manage().window().maximize();
	        	
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		        driver.get("https://demowebshop.tricentis.com/");
	         	Thread.sleep(20000);
	         	
	        	driver.findElement(By.className("ico-login")).click();
		        Thread.sleep(20000);
		        
	        	driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
	         	driver.findElement(By.id("Password")).sendKeys("admin01");
	        	Thread.sleep(20000);
	        
	            driver.findElement(By.xpath("//input[@value='Log in']")).click();
	            
	              WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
	              if (poll.isDisplayed()) {
	            	  test.log(Status.PASS,"Community poll is Displayed");
	            	  report.flush();
					
				}
	              else {
	            	  test.log(Status.FAIL,"Community poll is not Displayed");
	            	  report.flush();
					
				}
	        	 
	        	 
	}

}
