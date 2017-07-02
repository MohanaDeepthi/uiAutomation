package com.test.automation.uiAutomation.Homepage;

import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;

public class TC002_VerifyRegistration extends TestBase{
	HomePage homepage;
	public static final Logger log=Logger.getLogger(TC002_VerifyRegistration.class.getName());
	
	
	
	@BeforeClass
	public void setUp(){
		init();
		
	}
	
	@Test
	public void registerLogin() throws InterruptedException{
		
		log.info("+++++++++TC002 verfiy Registration  +++++++++++");
		homepage=new HomePage(driver);
		homepage.clickOnSignIn();
		homepage.registerLink();
		homepage.selectGender("female");
		homepage.enterFirstName("customer");
		homepage.enterLastName("customer");
		homepage.enterPassWord();
		homepage.selectDay("30");
		homepage.selectMonth("6");
		homepage.selectYear("1990");
		//homepage.enterFirstName("addressFirstName");
		//homepage.enterLastName("addressLastName");
		homepage.enterAddress();
		homepage.enterCity();
		homepage.selectState("43");
		homepage.enterZipCode();
		homepage.enterPhNo();
		homepage.clickRegister();
		
		
	}
	
	@AfterClass
	public void endTest(){
		//driver.close();
		
	}
	
	

}
