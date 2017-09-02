package com.test.automation.UIAutomation.HomePage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.UIAutomation.TestBase.TestBase;

public class TC002_VerifyLoginWithValidCredentials extends TestBase
{
	@BeforeTest
	public void setup()
	{
		init();
	}
	
	@Test
	public void verifyLoginWithValidCredentials()
	{	
		
	}
	
	@AfterTest
	public void tearDown()
	{
		closeBrowser();
		
	}
}
