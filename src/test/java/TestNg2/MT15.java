package TestNg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MT15 {
		@Test(groups = "regression")
		public void MT15Bike() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.bikewale.com/yamaha-bikes/mt-15/");
			Thread.sleep(1000);
			driver.close();
		}

}
