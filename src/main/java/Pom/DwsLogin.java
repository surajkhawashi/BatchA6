package Pom;

import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DwsLogin {

	public DwsLogin(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}
	private @FindBy(className = "ico-login")
	WebElement login_link;
	
	private @FindBy(id = "Email")
	WebElement username;
	
	private @FindBy(name = "Password")
	WebElement Password;
		
  private @FindBy(xpath = "//input[@value='Log in']")
	WebElement login_button;
  
  public void username (String user) {
	  username.sendKeys(user);
  }
  public void Password(String pass) {
	  Password.sendKeys(pass);
  }
 
  public void Login_button() {
	  login_button.click();
  }
  public void Login_link() {
	  login_link.click();
  }
 
}
