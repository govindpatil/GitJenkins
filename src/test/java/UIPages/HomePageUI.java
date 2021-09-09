package UIPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.HomePage;

public class HomePageUI {
	static WebDriver driver;
	HomePage hp;
	
	
	 public HomePageUI(WebDriver driver) {
	
		this.driver=driver;
	}

	@FindBy(linkText="Mobiles")
	static WebElement singInText;
	
	
	public static void clickOnLoginText()
	{
		
		
		System.out.println("Single text");
//		singInText.click();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
	}}
	
	

