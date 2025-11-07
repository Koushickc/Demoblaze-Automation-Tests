package Com.blaze.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contact {
	
	WebDriver driver;
	
	public contact(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath ="//a[text()='Contact']")
	public static WebElement ContactLink;
	
	@FindBy(id="recipient-email")
	public static WebElement ContactMail;
	
	@FindBy(id="recipient-name")
	public static WebElement ContactName;
	
	@FindBy(id="message-text")
	public static WebElement message;
	
	@FindBy(xpath ="//button[text()='Send message']")
	public static WebElement SendMessage;
	
	
	
	
	public static void ContactMail_Verify()
	{
		String email = ContactMail.getAttribute("value");
		
		if(email.contains("@")&& email.endsWith(".com") ||email.endsWith(".in") || email.endsWith(".org"))
		{
			System.out.println("This is valid mail id");
		}
		else
		{
			System.out.println("Email format is incorrect");
		}
		
        if (email.contains("!") || email.contains("#") || email.contains("$"))
	    {
		System.out.println("due to special characters this is invalid mailid");
	    }
	    else
        {
        	System.out.println("valid mail id");
        }
	}
}

	
	
	
	


