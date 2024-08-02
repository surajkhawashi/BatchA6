package Basic2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shoes {
	@Test
	public void Shoes()throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/shoes");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void Nike() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.nike.com/");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void Addidas() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/adidas-shoes");
		Thread.sleep(1000);
		driver.close();
	}
	
	@Test
	public void Puma() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.puma.com/in/en/mens");
		Thread.sleep(1000);
		driver.close();
	}
	
	@Test
	public void canverse() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.converse.in/mens/");
		Thread.sleep(1000);
		driver.close();
		
}
	public void UsPolo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://uspoloassn.in/?");
		Thread.sleep(1000);
		driver.close();
		
	}
	
}
