package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;


public class TC_001_AccountRegistrationTest extends BaseClass {
	
	@Test(groups= {"Regression", "Master"})
	public void test_account_Registration() throws InterruptedException
	{
		
		logger.info("***Starting TC_001");
		try
		{
		HomePage hp=new HomePage(driver);
		
		hp.clickMyaccount();
		logger.info("Clicked My Account");
		
		hp.clickResgister();
		logger.info("My Register");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstName(randomeString().toUpperCase());
		logger.info("Provided First Name");
		
		regpage.setLastName(randomeString().toUpperCase());
		logger.info("Provided Last Name");
		
		//regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		logger.info("Provided Email");
		
		//regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		logger.info("Provided Password");
		//regpage.setConfirmPassword(password);
		
		WebElement inputField = driver.findElement(By.name("password"));
        inputField.sendKeys(Keys.TAB);	
        logger.info("Tab to next field");
        
        Thread.sleep(300);
	    WebElement inputField3 = driver.findElement(By.partialLinkText("Privacy"));
	    inputField3.sendKeys(Keys.TAB);
	    logger.info("Tab to next field");
	    
	    Thread.sleep(300);	
	    WebElement elementOpen = driver.findElement(By.name("agree")); 
	    elementOpen.click();
	    logger.info("Clicked agreed");
	    
	    Thread.sleep(300);
		WebElement inputField4 = driver.findElement(By.name("agree"));
		inputField4.sendKeys(Keys.TAB);
		logger.info("Tab to next field");
		
		Thread.sleep(300);
		WebElement inputField5 = driver.findElement(By.xpath("//*[@id=\'form-register\']/div/button"));
		inputField5.sendKeys(Keys.ENTER);
		logger.info("Clicked Register");
		
	
		
		String confmsg=regpage.getConfirmationMsg();
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
		Assert.fail();
		}


	}
	
}


