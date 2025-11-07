package Com.blaze.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Com.blaze.objects.HomeScreen;
import Utilities.Commonclass;

public class Tc1_Home extends Commonclass
{
	
	@Test(priority=0)
	public void title_verification()
	{
		String actual = driver.getTitle();
		String expected = "STORE";
		Assert.assertEquals(actual, expected,"Not Redirected to the correct page");
		Reporter.log("case title verification completed");
	}
	
	@Test(priority=1)
	
	public void logo_link_verification()
	{
		PageFactory.initElements(driver, HomeScreen.class);
		String actual = HomeScreen.pro_text.getText();
		String Expected="PRODUCT STORE";
		Assert.assertEquals(actual, Expected);
		Reporter.log("logo_link done");
	}

}
