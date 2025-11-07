package Com.blaze.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.blaze.objects.contact;
import Utilities.Commonclass;

public class Tc7_contact extends Commonclass {
	
	@Test
	public void contact_link()
	{
		PageFactory.initElements(driver, contact.class);
		driver.navigate().refresh();
		contact.ContactLink.click();
		contact.ContactMail.sendKeys(mail);
		contact.ContactMail_Verify();
		contact.ContactName.sendKeys("Koushick");
		contact.message.sendKeys("Hi");
		contact.SendMessage.click();
		
		
		
		
		
	}

}
