package com.SwagLabs.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver ldriver;

	public ProductPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(partialLinkText = "Sauce Labs Backpack")
	@CacheLookup
	WebElement SauceLabsBackpack;

	@FindBy(xpath = "//*[@id='inventory_item_container']/div/div/div/button")
	@CacheLookup
	WebElement AddtoCart;

	@FindBy(xpath = "//*[@id='inventory_item_container']/div/div/div/button")
	@CacheLookup
	WebElement AddCart;

	@FindBy(xpath = "//*[@id='inventory_item_container']/div/div/div/button")
	@CacheLookup
	WebElement Cart;

	@FindBy(xpath = "//*[@id='inventory_item_container']/div/button")
	@CacheLookup
	WebElement Backbutton;

	@FindBy(linkText = "Sauce Labs Bike Light")
	@CacheLookup
	WebElement BikeLight;

	@FindBy(linkText = "Sauce Labs Bolt T-Shirt")
	@CacheLookup
	WebElement BoltTshirt;

	@FindBy(linkText = "Sauce Labs Fleece Jacket")
	@CacheLookup
	WebElement FleeceJacket;

	@FindBy(linkText = "Sauce Labs Onesie")
	@CacheLookup
	WebElement LabsOnesie;

	@FindBy(xpath = "//*[@id='cart_contents_container']/div/div[1]/div[3]/div[2]/div[2]/button")
	@CacheLookup
	WebElement RemoveButton;

	public void ClickBackPack() {
		SauceLabsBackpack.click();
	}

	public void ClickAddtochart() {
		AddtoCart.click();
	}

	public void ClickAddchart() {
		AddCart.click();
	}

	public void Clickchart() {
		Cart.click();
	}

	public void ClickBackButton() {
		Backbutton.click();
	}

	public void ClickBikeLight() {
		BikeLight.click();
	}

	public void ClickBoltTshirt() {
		BoltTshirt.click();
	}

	public void ClickFleeceJacket() {
		FleeceJacket.click();
	}

	public void ClickLabsOnesie() {
		LabsOnesie.click();
	}

	public void ClickRemoveButton() {
		RemoveButton.click();
	}

}
