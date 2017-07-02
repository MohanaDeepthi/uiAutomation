package com.test.automation.uiAutomation.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.log4j.Logger;

public class TestBase {

	
	public static final Logger log=Logger.getLogger(TestBase.class.getClass());
	public WebDriver driver;
	
	
	String url="http://automationpractice.com/index.php";
	String browser="firefox";
	
	public void init(){
		selectBrowser(browser);
		getUrl(url);
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}
	
	public void selectBrowser(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "E://geckodriver.exe");
			driver=new FirefoxDriver();
			log.info("Creating object of "+browser);
			log.info(driver);
		}	
	}
	
	
	public void getUrl(String url){
		log.info("Navigating to "+url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
}
