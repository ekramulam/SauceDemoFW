package com.SwagLabs.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.SwagLabs.pageObjects.LoginPage;
import com.SwagLabs.pageObjects.ProductPage;

public class TC_LoginTest_01 extends BaseClass {

	@Test
	public void loginTest() throws IOException {

		logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");

		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickSubmit();
		logger.info("Clicked on login button");

		lp.clickMenuBar();
		logger.info("Clicked on Menu Bar");

		lp.clickLogout();
		logger.info("Click on sing out button");

		if (driver.getTitle().equals("Swag Labs")) {
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}

	}

}
