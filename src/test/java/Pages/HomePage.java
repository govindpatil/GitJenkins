package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import UIPages.HomePageUI;
import UIPages.LoginPageUI;

public class HomePage {
	static WebDriver driver;

	public static Properties prop;

	
	@BeforeTest
	public static void browserSetup()

	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RamRaksha\\Downloads\\chromedriver921\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}

	@Test
	public static void homeSearch() {
		System.out.println("Bhavani");
		HomePageUI homeui = PageFactory.initElements(driver, HomePageUI.class);
		homeui.clickOnLoginText();

	}

	@Test
	public static void loginIntoAmazon() {
		LoginPageUI logiui = PageFactory.initElements(driver, LoginPageUI.class);
		logiui.loginInto();
	}

}