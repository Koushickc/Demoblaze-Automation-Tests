package Com.blaze.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.blaze.objects.Phones;
import Utilities.Commonclass;

public class Tc4_AddToCartVerification extends Commonclass {
	
	@Test
	public void phones_link() throws InterruptedException
	{
		PageFactory.initElements(driver, Phones.class);
		
		driver.navigate().refresh();
		Phones.phonesLink.click();
		Phones.PreviousLinkButton.click();
		Phones.NokiaLink.click();
		Phones.AddChart.click();
		Thread.sleep(1500);
		Alert message = driver.switchTo().alert();
		message.accept();
		Phones.cart.click();
		
		
		
		
		
		
	}

}
