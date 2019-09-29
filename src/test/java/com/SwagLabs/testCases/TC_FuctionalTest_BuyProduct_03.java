package com.SwagLabs.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.SwagLabs.pageObjects.CheckOutInfo;
import com.SwagLabs.pageObjects.LoginPage;
import com.SwagLabs.pageObjects.ProductPage;
import com.SwagLabs.pageObjects.ShoppingCartPage;

public class TC_FuctionalTest_BuyProduct_03 extends BaseClass {

	@Test
	public void loginTest() throws IOException, InterruptedException {
		logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");

		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickSubmit();
		logger.info("Clicked on login button");

		ProductPage pp = new ProductPage(driver);
		pp.ClickBackPack();
		logger.info("Clicked on login back pack");

		pp.ClickAddtochart();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		logger.info("Clicked on add to cart");

		lp.clickMenuBar();
		logger.info("Clicked on Menu Bar");

		lp.clickAllItems();
		logger.info("Clicked on All Items");

		pp.ClickBoltTshirt();
		logger.info("Clicked on Bolt T-shirt");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		try {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			pp.ClickAddchart();
			logger.info("Clicked on add to cart");
		} catch (Exception e) {
			System.out.print("Element not found");
		}

		pp.ClickBackButton();
		logger.info("Clicked on Back button");

		pp.ClickFleeceJacket();
		logger.info("Clicked on Fleece Jacket");

		pp.Clickchart();
		logger.info("Clicked on add to cart");

		ShoppingCartPage sc = new ShoppingCartPage(driver);
		sc.ClickShoppingCart();
		logger.info("Clicked on Shopping cart");

		pp.ClickRemoveButton();
		logger.info("Clicked on Remove button");

		sc.ClickCheckout();
		logger.info("Clicked on check out");

		CheckOutInfo coi = new CheckOutInfo(driver);
		coi.ClickFname("Ekramul");
		logger.info("Type First name");

		coi.ClickLname("Islam");
		logger.info("Type Last name");

		coi.ClickZcode(11218);
		logger.info("Type Zipe code");

		coi.ClickContinueButton();
		logger.info("Click on continue button");

		coi.ClickFinishedButton();
		logger.info("Click on finished button");

	}

}
