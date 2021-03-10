package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import tekstack.StoreNameMandatoryCheck.base.BaseUI;

public class ShopifyStartFreeTrialTest extends BaseUI {

	//Testing Shopify FreeTrial Screen in Chrome Browser
	@Test
	public void testOne() {
		logger = report.createTest("Store Name Mandatory Check \"Chrome\"");
		invokeBrowser("chrome");
		openURL("websiteURL");
		elementClick("startFreeTrialBtn_Xpath");
		enterText("emailTextbox_Xpath", prop.getProperty("email"));
		enterText("passwordTextbox_Xpath", prop.getProperty("password"));
		elementClick("createYourStoreBtn_Xpath");
		findError("//span[@class='error']");

	}

	//Testing Shopify FreeTrial Screen in Mozila Browser
	@Test
	public void testTwo() {
		logger = report.createTest("Store Name Mandatory Check \"Mozila\" ");
		invokeBrowser("Mozila");
		openURL("websiteURL");
		elementClick("startFreeTrialBtn_Id");
		enterText("emailTextbox_Id", prop.getProperty("email"));
		enterText("passwordTextbox_Id", prop.getProperty("password"));
		elementClick("createYourStoreBtn_Xpath");
		findError("//span[@class='error']");
		
	}

	//flushing extent report to html file
	@AfterTest
	public void endReport() {
		report.flush();
		

	}
	

}
