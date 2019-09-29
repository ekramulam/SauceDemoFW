package com.SwagLabs.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "user-name")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(id = "password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//input[@value='LOGIN']")
	@CacheLookup
	WebElement Login;

	@FindBy(xpath = "//*[@id='menu_button_container']/div/div[3]/div/button")
	@CacheLookup
	WebElement MenuBar;

	@FindBy(partialLinkText = "All Items")
	@CacheLookup
	WebElement AllItems;

	@FindBy(id = "logout_sidebar_link")
	@CacheLookup
	WebElement lnkLogout;

	public void setUserName(String uname) {
		txtUserName.clear();
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit() {
		Login.click();
	}

	public void clickMenuBar() {
		MenuBar.click();
	}

	public void clickAllItems() {
		AllItems.click();
	}

	public void clickLogout() {
		lnkLogout.click();
	}

}
