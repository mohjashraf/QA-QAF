package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {
	
	public WebDriver driver;
	
	public void AmazonPages(WebDriver driver) {
	
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
	
	
	}
	
	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
	
	WebElement signinBtn;
	
	public void getSignin() {
		
		signinBtn.click();
	
	}
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	
	WebElement createAccountBtn;
		
	public void getCreateAccBtn() {	
		
		createAccountBtn.click();
	
	}
	
	@FindBy(xpath="//input[@id='ap_customer_name']")
	
	WebElement nameBx;
	
	public void getNameBx(String name) {
	
	nameBx.sendKeys(name);
	
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	
	WebElement emailBx;
	
	public void getemailBx(String email) {
	
	emailBx.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	
	WebElement passwordBx;
	
	public void getpasswordBx(String password) {
	passwordBx.sendKeys(password);
	
	}
	
	@FindBy(xpath="//input[@id='ap_password_check']")
	
	WebElement passwordcheckBx;
	
	public void getpasswordcheckBx(String repass) {
	
	passwordcheckBx.sendKeys(repass);
	}
	
	@FindBy(xpath="//input[@id='continue']")
	
	WebElement continueBtn;
	
	public void getcontinueBtn() {
	
	continueBtn.click();
	}
}
