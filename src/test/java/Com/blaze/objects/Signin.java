package Com.blaze.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signin {
	
	WebDriver driver;
	
	public Signin(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(id="login2")
	public static WebElement loginbuttonlink;
	
	@FindBy(id="loginusername")
	public static WebElement SignInUsername;
	
	@FindBy (id="loginpassword")
	public static WebElement SignInPassword;
	
	@FindBy (xpath="//button[text()='Log in']")
	public static WebElement SignInLogIn;

	
	
	

}
