package com.test.automation.uiAutomation.Homepage;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import com.test.automation.uiAutomation.testBase.TestBase;

import org.apache.log4j.Logger;


public class HomePage{
	
	WebDriver driver;
	
	public static final Logger log=Logger.getLogger(HomePage.class.getClass());
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement loginEmailAddress;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement submitBtn;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;
	
	@FindBy(id="email_create")
	WebElement  signUpLink;
	
	@FindBy(id="SubmitCreate")
	WebElement submitButton;
	
	@FindBy(id="uniform-id_gender1")
	WebElement maleGender;
	
	@FindBy(id="id_gender2")
	WebElement femaleGender;
	
	@FindBy(xpath=".//*[@id='customer_firstname']")
	WebElement cusFirstName;
	
	@FindBy(id="customer_lastname")
	WebElement cusLastName;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement emailId;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement passWord;
	
	@FindBy(xpath=".//*[@id='days']")
	WebElement days;
	
	@FindBy(xpath=".//*[@id='months']")
	WebElement months;
	
	@FindBy(xpath = ".//*[@id='years']")
	WebElement years;
	
	@FindBy(xpath=".//*[@id='firstname']")
	WebElement firstName;
	
	@FindBy(xpath=".//*[@id='lastname']")
	WebElement lastName;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement stAddress;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement state;
	
	@FindBy(xpath=".//*[@id='postcode']")
	WebElement postCode;
	
	@FindBy(xpath=".//*[@id='id_country']")
	WebElement country;
	
	@FindBy(xpath=".//*[@id='phone_mobile']")
	WebElement phoneMobile;
	
	@FindBy(xpath=".//*[@id='submitAccount']")
	WebElement register;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement women;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a")
	WebElement tops;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a")
	WebElement tShirts;
	
	public HomePage(WebDriver driver){
		
		//If we dont initialize we will get null pointer exception
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignIn(){
		signIn.click();
		log.info("Clicked on sign in and object is "+signIn.toString());
		
	}
	public void loginToApplication(String emailAddress,String passWord ){
		
		
		loginEmailAddress.sendKeys(emailAddress);
		log.info("entered email address "+emailAddress+" and object is "+loginEmailAddress.toString());
		password.sendKeys(passWord);
		log.info("Entered Password "+passWord+" and object is "+password.toString());
		submitBtn.click();
		log.info("clicked on submit button and object is "+submitBtn.toString());
		
		
	}
	
	public String getInvalidLoginText(){
		return authenticationFailed.getText();
	}
	
	
	public void registerLink(){
		
		int ranNum=(int)(Math.random()*2000);
		
		signUpLink.sendKeys("test"+ranNum+"@gmail.com");
		log.info("Entered the email id");
		submitButton.click();
		log.info("Clicked on Create an Account button");
		
	}

	public void selectGender(String genderStatus){
		if(genderStatus.equalsIgnoreCase("male")){
			maleGender.click();
						
		}
		else{
			femaleGender.click();
		}
		
	} 
	
	public void enterFirstName(String type){
		if(type.equalsIgnoreCase("customer")){
			cusFirstName.sendKeys("Test FirstName");
			
		}
		/*else if(type.equalsIgnoreCase("addressFirstName")){
			firstName.sendKeys("Test FirstName");
			
		}*/
		
	}
	
	
	public void enterLastName(String type){
		if(type.equalsIgnoreCase("customer")){
			cusLastName.sendKeys("Test LastName");
			
		}
		/*else if(type.equalsIgnoreCase("addressLastName")){
			lastName.sendKeys("Test LastName");
			
		}*/
		
	}
	
	public void enterPassWord(){
		passWord.sendKeys("1234_abcd");
		
	}
	
	public void selectDay(String dayVal){
		Select dayObj= new Select(days);
		dayObj.selectByValue(dayVal);
		
	}
	
	public void selectMonth(String monVal){
		Select mnthObj=new Select(months);
		mnthObj.selectByValue(monVal);
	}
	
	public void selectYear(String yrVal){
		Select yrObj=new Select(years);
		yrObj.selectByValue(yrVal);
	}
	
	public void enterAddress(){
		stAddress.sendKeys("1286 hidden rdg");
	}
	public void enterCity(){
		city.sendKeys("Irving");
	}
	
	public void selectState(String stValue){
		Select stObj=new Select(state);
		stObj.selectByValue(stValue);
	}
	
	public void enterZipCode(){
		postCode.sendKeys("75038");
	}
	
	public void enterPhNo(){
		phoneMobile.sendKeys("8945612374");
	}
	
	public void clickRegister(){
		
		register.click();
		
	}
	
	
	public void mouseOver(WebDriver driver) throws InterruptedException{
	    //log.info(driver); 
		log.info("Mouse over");
	     
		
		 //WebElement women = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a"));
		log.info(driver); 
		Actions actions=new Actions(driver); 
		
		actions.moveToElement(women).clickAndHold();
		Thread.sleep(1000);
		women.click();
	
		/*Thread.sleep(1000);
		//tShirts.click();
		Actions act = new Actions(driver);
		act.moveToElement(tShirts); 
		act.click().build().perform();*/
	
		
	}
}
