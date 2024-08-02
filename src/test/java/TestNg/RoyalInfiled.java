package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoyalInfiled {
	@Test(groups = "smoke")
	public void RoyalBike() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bikewale.com/royalenfield-bikes/hunter-350/images/");
		Thread.sleep(1000);
		driver.close();
	}

}
