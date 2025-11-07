package Com.blaze.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signup {

	 WebDriver driver;
		
		public Signup(WebDriver driver)
		{
			this.driver = driver;
		}
		
		@FindBy(xpath="//a[text()='Sign up']")
		public static WebElement signup;
		
		@FindBy(id="sign-username")
		public static WebElement username;
		
		@FindBy (id="sign-password")
		public static WebElement password;
		
		@FindBy (xpath="//button[text()='Sign up']")
		public static WebElement Signupbutton;
		
		@FindBy(xpath ="/html/body/div[2]/div/div/div[3]/button[1]")
		public static WebElement close;
		
}
