package BaseTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomGiftCards {

	public PomGiftCards(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private @FindBy(linkText = "Gift Cards")
	WebElement giftcard;
	private @FindBy(linkText = "$25 Virtual Gift Card")
	WebElement giftcardadd;
	private @FindBy(id = "giftcard_2_RecipientName")
	WebElement rname2;
	private @FindBy(id = "giftcard_2_RecipientEmail")
	WebElement remail2;
	private @FindBy(id = "giftcard_2_SenderName")
	WebElement yname2;
	private @FindBy(id = "giftcard_2_SenderEmail")
	WebElement yemail2;
	private @FindBy(id = "giftcard_2_Message")
	WebElement message2;
	private @FindBy(xpath = "//input[@class='qty-input']")
	WebElement quan2;
	private @FindBy(id = "add-to-cart-button-2")
	WebElement addbutton2;
	private @FindBy(className = "cart-label")
	WebElement shopcart;
	
	
	public void giftCardsLink() {
		giftcard.click();
	}
	public void giftCardAdd() {
		giftcardadd.click();
	}
	public void recipientName2(String rename) {
		rname2.sendKeys(rename);
	}
	public void recipientEmail2(String reemail) {
		remail2.sendKeys(reemail);
	}
	public void yourName2(String sname) {
		yname2.clear();
		yname2.sendKeys(sname);
	}
	public void yourEmail2(String semail) {
		yemail2.clear();
		yemail2.sendKeys(semail);
	}
	public void messagee2(String msg) {
		message2.sendKeys(msg);
	}
	public void quantity2(String qu) {
		quan2.clear();
		quan2.sendKeys(qu);
	}
	public void addToCartBu2()
	{
		addbutton2.click();
	}
	public void shopCart() {
		shopcart.click();
	}
	
}

