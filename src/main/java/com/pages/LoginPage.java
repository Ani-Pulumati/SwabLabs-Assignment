package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

public class LoginPage {

	private WebDriver driver;

	// 1. By locators

	private By UserName = By.xpath("//input[@id='user-name1']");
	private By Password = By.xpath("//input[@id='password']");
	private By Login = By.xpath("//input[@id='login-button']");
	private By ErrorMsg = By.xpath("//button[@class='error-button']");
	

	// 2 Constructors of the page class

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// 3. page actions

	public void InputUserName(String username) {

		driver.findElement(UserName).click();
		driver.findElement(UserName).sendKeys(username);

	}

	public void InputPassword(String username) {

		driver.findElement(Password).click();
		driver.findElement(Password).sendKeys("password");

	}

	public void ClickOnLogin() {

		driver.findElement(Login).click();

	}
	
	public String verifyLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	public String verifyErrorOnLogin(){
		
		return driver.findElement(ErrorMsg).getText();
		
		
	}
	
	
	
	
	
	

}
