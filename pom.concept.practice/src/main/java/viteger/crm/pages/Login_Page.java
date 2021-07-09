package viteger.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {
	
	
	@FindBy(name="user_name")
	WebElement user_name;
	
	
	@FindBy(name="user_password")
	WebElement user_passwrod;
	
	
	@FindBy(id="submitButton")
	WebElement submitButton;
	
	
   Login_Page(WebDriver driver)
}
