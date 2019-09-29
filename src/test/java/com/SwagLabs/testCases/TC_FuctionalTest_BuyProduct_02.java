package com.SwagLabs.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.SwagLabs.pageObjects.CheckOutInfo;
import com.SwagLabs.pageObjects.LoginPage;
import com.SwagLabs.pageObjects.ProductPage;
import com.SwagLabs.pageObjects.ShoppingCartPage;

public class TC_FuctionalTest_BuyProduct_02 extends BaseClass {

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
		logger.info("Clicked on add to cart");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		ShoppingCartPage sc = new ShoppingCartPage(driver);
		sc.ClickShoppingCart();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		logger.info("Clicked on Shopping cart");

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
