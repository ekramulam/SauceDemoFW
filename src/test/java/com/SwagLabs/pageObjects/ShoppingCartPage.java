package com.SwagLabs.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	WebDriver ldriver;

	public ShoppingCartPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id='shopping_cart_container']/a/span")
	@CacheLookup
	WebElement ShoppingCart;

	@FindBy(id = "shopping_cart_container")
	@CacheLookup
	WebElement AddtoCart;

	@FindBy(className = "btn_secondary btn_inventory")
	@CacheLookup
	WebElement RemoveButton;

	@FindBy(xpath = "//*[@id='cart_contents_container']/div/div[2]/a[1]")
	@CacheLookup
	WebElement ContinueShopping;

	@FindBy(xpath = "//*[@id='cart_contents_container']/div/div[2]/a[2]")
	@CacheLookup
	WebElement CheckoutButton;

	public void ClickShoppingCart() {
		ShoppingCart.click();
	}

	public void ClickAddtochart() {
		AddtoCart.click();
	}

	public void ClickRemoveButton() {
		RemoveButton.click();
	}

	public void ClickContinueShoppingButton() {
		ContinueShopping.click();
	}

	public void ClickCheckout() {
		CheckoutButton.click();
	}

}
