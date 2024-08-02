package BaseTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomDigitalDownLoad {

	public PomDigitalDownLoad(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	private @FindBy(linkText = "Digital downloads")
	WebElement digidownloadlink;
	private @FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	WebElement addtocart1;
	private @FindBy(xpath = "(//input[@value='Add to cart'])[2]")
	WebElement addtocart2;
	private @FindBy(xpath = "(//input[@value='Add to cart'])[3]")
	WebElement addtocart3;
	
	public void digiDownload() {
		digidownloadlink.click(); 
	}
	public void addToCart1() {
		addtocart1.click();
	}
	 
	public void addToCart2() {
		addtocart2.click();
	}
	public void addToCart3() {
		addtocart3.click();
	}

}
