package com.test.automation.uiAutomation.Homepage;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;

public class TC003_MouseOver extends TestBase{
	HomePage homepage;
	public static final Logger log=Logger.getLogger(TC003_MouseOver.class.getName());	
	
	@BeforeClass
	public void setUp(){
		init();
		
	}
	
	@Test
	public void mouseOverWomen() throws InterruptedException{
		log.info("Clicking on Women MouseOVer");
		homepage=new HomePage(driver);
		log.info("homepage"+homepage);
		homepage.mouseOver(driver);
		log.info("Finished MouseOver");	
		
	}
	
	@AfterClass
	public void endTest(){
		//driver.close();
		
	}
	

	

}
