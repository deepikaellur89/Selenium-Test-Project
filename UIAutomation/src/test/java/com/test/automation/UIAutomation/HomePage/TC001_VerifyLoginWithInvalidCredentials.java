package com.test.automation.UIAutomation.HomePage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.test.automation.UIAutomation.TestBase.TestBase;
import com.test.automation.UIAutomation.UIActions.HomePage;

public class TC001_VerifyLoginWithInvalidCredentials extends TestBase 
{	
	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());
	
	@BeforeTest
	public void setup()
	{
		init();
	}
	
	@Test
	public void verifyLoginWithInvalidCredentials()
	{	
		log.info("Starting -- TC001_VerifyLoginWithInvalidCredentials -- test");
		HomePage hpage = new HomePage(driver);
		hpage.loginToApplication("test@gmail.com","password123");
		Assert.assertEquals("Authentication failed.",hpage.getInvalidLoginText());
		log.info("Ending -- TC001_VerifyLoginWithInvalidCredentials -- test");
	}
	
	@AfterTest
	public void tearDown()
	{
		closeBrowser();
		
	}
}
