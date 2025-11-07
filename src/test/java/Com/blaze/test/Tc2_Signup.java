package Com.blaze.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Com.blaze.objects.Signup;
import Utilities.Commonclass;

public class Tc2_Signup extends Commonclass
{
	@Test
	public void signup_link() throws InterruptedException
	{
		PageFactory.initElements(driver, Signup.class);
		Signup.signup.click();
		Signup.username.sendKeys(username);
		Signup.password.sendKeys(password);
		String actual_username ="Kondal";
		String expected_username = Signup.username.getAttribute("value");
		Assert.assertEquals(actual_username, expected_username,"username is mismatch");
		Reporter.log("User name verified");
		
		String actual_password ="Welcome@2025";
		String expected_password = Signup.password.getAttribute("value");
		Assert.assertEquals(actual_password, expected_password,"password is mismatch");
		Reporter.log("password verified");
		Signup.Signupbutton.click();
		Thread.sleep(1500);
		Alert warning = driver.switchTo().alert();
		warning.accept();
		Signup.close.click();
	
		
	}
	
	

}
