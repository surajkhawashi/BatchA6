package ExtentsReports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.Listner.SampleReport.class)

public class ExceutesListners {
	@Test
	public void Domino() {
		   
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.get("https://pizzaonline.dominos.co.in/");
         Reporter.log("I am Hungry", true);
        
        
   }
	@Test(timeOut = 1000)
	public void RCB() throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.royalchallengers.com/");
        Reporter.log("RCB Hungry for Cup", true);
        Thread.sleep(2000);
	}
	@Test(dependsOnMethods = "rcb")
	
	public void CSK() {
		 
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.chennaisuperkings.com/");
        Reporter.log("When thalla will retire", true);
	}
		
	}


