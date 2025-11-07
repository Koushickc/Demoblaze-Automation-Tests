package Com.blaze.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.blaze.objects.DeleteCart;
import Com.blaze.objects.contact;
import Utilities.Commonclass;

public class Tc5_deleteChart extends Commonclass {
	
	@Test
	public void cart() throws InterruptedException
	{
		PageFactory.initElements(driver, DeleteCart.class);
		driver.navigate().refresh();
		DeleteCart.cart.click();
		DeleteCart.delete.click();
		DeleteCart.home.click();
		DeleteCart.phonesLink2.click();
		DeleteCart.NokiaLink1.click();
		DeleteCart.AddChart1.click();
		Thread.sleep(1500);
		Alert message1 = driver.switchTo().alert();
		message1.accept();
		DeleteCart.cart1.click();
		
		
		
		
	    
	}

}
