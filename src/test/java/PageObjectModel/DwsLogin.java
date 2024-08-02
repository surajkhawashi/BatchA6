package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DwsLogin {
	@Test
	public void main() throws InterruptedException {
		
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 driver.get("https://demowebshop.tricentis.com/login");
	 
	 Pom.DwsLogin ref = new Pom.DwsLogin(driver);
	 
	 ref.Login_link();
	 Thread .sleep(2000);
	 
	 ref.username("admin01@gmail.com");
	 
	 ref.Password("admin01");
	 
	 ref.Login_button();
	 Thread .sleep(2000);
	 
	 driver.close();

	}
	

}
