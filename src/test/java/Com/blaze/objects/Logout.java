package Com.blaze.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Logout {
WebDriver driver;
	
	public Logout(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(id="logout2")
	public static WebElement LogoutLink;
	

}
