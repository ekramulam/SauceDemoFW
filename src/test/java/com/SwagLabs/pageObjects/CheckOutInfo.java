package com.SwagLabs.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInfo {

	WebDriver ldriver;

	public CheckOutInfo(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "first-name")
	@CacheLookup
	WebElement fname;

	@FindBy(id = "last-name")
	@CacheLookup
	WebElement lname;

	@FindBy(id = "postal-code")
	@CacheLookup
	WebElement zcode;

	@FindBy(xpath = "//*[@id='checkout_info_container']/div/form/div[2]/input")
	@CacheLookup
	WebElement ContinueButton;

	@FindBy(linkText = "FINISH")
	@CacheLookup
	WebElement FinishedButton;

	public void ClickFname(String Fname) {
		fname.clear();
		fname.sendKeys("Ekramul");
	}

	public void ClickLname(String Lname) {
		lname.clear();
		lname.sendKeys("Islam");
	}

	public void ClickZcode(int Zcode) {
		zcode.clear();
		zcode.sendKeys("11218");
	}

	public void ClickContinueButton() {
		ContinueButton.click();
	}

	public void ClickFinishedButton() {
		FinishedButton.click();
	}

}