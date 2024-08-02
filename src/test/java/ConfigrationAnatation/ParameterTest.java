package ConfigrationAnatation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import BaseClass.BaseClassDwsAnatation;

	public class ParameterTest extends BaseClassDwsAnatation {
			@Test
			public void testCase() throws InterruptedException {
				String givenurl = "https://demowebshop.tricentis.com/news/rss/1";
				Actions act=new Actions(driver);
				act.keyDown(Keys.PAGE_DOWN).build().perform();
				act.keyDown(Keys.PAGE_DOWN).build().perform();
				act.keyDown(Keys.PAGE_DOWN).build().perform();
				
				List<WebElement> fu = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
				for (WebElement web : fu) {
					String currenturl = driver.getCurrentUrl();
					if (givenurl.equals(currenturl)) {
						driver.navigate().back();
					}
					web.click();
					Thread.sleep(2000);
				}
			}
	}

