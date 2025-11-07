package Com.blaze.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.blaze.objects.Signin;
import Com.blaze.objects.Signup;
import Utilities.Commonclass;

public class tc3_signin extends Commonclass {
	
	
	private static final boolean False = false;
	String data [][]=
		{
				{"testuser1", "Welcome@2026"},
				{"testuser0", "Welcome@2021"},
				{"testuser3", "Welcome@20233"},
				{"testuser",   "Welcome@2025"}
				
		};
	
	@DataProvider(name = "logindata")
	public String [][]loginprovider()
	{
		return data;
	}
	
	@Test(dataProvider ="logindata", enabled =False)
	public void signin_link(String username, String password)
	{
		 Signin signin = new Signin(driver);
		Signin.loginbuttonlink.click();
		Signin.SignInUsername.sendKeys(username);
		Signin.SignInPassword.sendKeys(password);
		
		String actual_username ="username";
		String expected_username = Signin.SignInUsername.getAttribute("value");
		Assert.assertEquals(actual_username, expected_username,"username is mismatch");
		
		String actual_password="password";
		String expected_password=Signin.SignInPassword.getAttribute("value");
		Assert.assertEquals(actual_password, expected_password,"password is mismatch");
		Signin.SignInLogIn.click();
		}
	@Test
	public void signin()
	{
		PageFactory.initElements(driver, Signin.class);
		Signin.loginbuttonlink.click();
		Signin.SignInUsername.sendKeys(username);
		Signin.SignInPassword.sendKeys(password);
		Signin.SignInLogIn.click();
		
	}
	
	

}
