package Task;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseTask.DwsBaseListeners;
import BaseTask.PomGiftCards;

public class GiftCards extends DwsBaseListeners {

	@Test
	public void giftCards() {
		
		String expectedresult = "https://demowebshop.tricentis.com/";
		String actualresult = driver.getCurrentUrl();
		assertEquals(expectedresult, actualresult);
		PomGiftCards ref=new PomGiftCards(driver);
		ref.giftCardsLink();
		ref.giftCardAdd();
		ref.recipientName2("suru");
		ref.recipientEmail2("suru123@gmail.com");
		
		ref.yourName2("suraj");
		ref.yourEmail2("skhawashi2002@gmail.com");
		ref.messagee2("Hiiiiii");
		ref.quantity2("2");
		ref.addToCartBu2();
		ref.shopCart();
		WebElement giftcard = driver.findElement(By.xpath("(//a[text()='$25 Virtual Gift Card'])[2]"));
		assertTrue(giftcard.isDisplayed());
	}

}
