package Com.blaze.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.blaze.objects.DeleteCart;
import Com.blaze.objects.Logout;
import Utilities.Commonclass;

public class Tc8_logout extends Commonclass {
	@Test
	public void logout() throws InterruptedException
	{
		PageFactory.initElements(driver, Logout.class);
		driver.navigate().refresh();
		Thread.sleep(2000);
		Logout.LogoutLink.click();
		Thread.sleep(2000);
		Alert message2 = driver.switchTo().alert();
		message2.accept();
		
	}
	

}
