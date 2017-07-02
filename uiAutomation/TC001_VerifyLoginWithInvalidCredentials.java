package com.test.automation.uiAutomation.Homepage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;
import org.apache.log4j.Logger;

import com.test.automation.uiAutomation.testBase.TestBase;

@Test
public class TC001_VerifyLoginWithInvalidCredentials extends TestBase{
	
	
	HomePage homepage;
	public static final Logger log=Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());
			
			
	@BeforeClass
	public void setUp(){
		init();
		
	}
	public void verifyLoginWithInvalidCredentials() throws InterruptedException{
		log.info("+++++++++++ Starting VerifyLoginWithInvalidCredentials Test +++++++++++++++");
		homepage=new HomePage(driver);
		homepage.clickOnSignIn();
		homepage.loginToApplication("test@gmail.com", "passWord");
		Thread.sleep(1000);
		Assert.assertEquals(homepage.getInvalidLoginText(), "Authentication failed.");
		log.info("+++++++++ Finishing VerifyLoginWithInvalidCredentials Test +++++++++++++++");
	
	}
	@AfterClass
	public void endTest(){
		driver.close();
		
	}

}
