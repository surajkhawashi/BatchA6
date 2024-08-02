package DataDriverTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
	    driver.findElement(By.id("//input[@id='First Name']")).sendKeys("Suraj");
	
     	driver.findElement(By.id("//input[@id='Last Name']")).sendKeys("khawashi");
	
	    driver.findElement(By.id("//input[@id='Male']")).sendKeys("Male");
	
		driver.findElement(By.id("//input[@id='Phone Number']")).sendKeys("9373244621");		
		
	}
}

	
		