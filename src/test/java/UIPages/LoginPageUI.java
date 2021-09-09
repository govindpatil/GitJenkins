package UIPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageUI {

	WebDriver driver;

	public LoginPageUI(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement loginText;
	
	
	@FindBy(xpath="//input[@type='email']")
	static WebElement username;
	

	
	public void loginInto()
	{
		loginText.click();
		username.sendKeys("govindpatil80@gmail.com");
	
	}
}
