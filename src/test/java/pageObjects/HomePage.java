package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//Constuctor
	public HomePage(WebDriver driver)
	{
		super(driver);//Not initiated but inherits parent class constructor
	}
	
	//Elements
	@FindBy(linkText="My Account")
	WebElement lnkMyaccount;
	
		
	@FindBy(linkText="Register")
	WebElement lnkRegister;
	
	@FindBy(linkText="Login")
	WebElement linkLogin;
	
	
	
	
	//Action Methods
	public void clickMyaccount()
	{
		lnkMyaccount.click();
	}
	
	public void clickResgister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		linkLogin.click();
	}
	

}
