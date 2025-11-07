package Com.blaze.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeScreen {

	 WebDriver driver;
	
	public HomeScreen(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(id="nava")
	public static WebElement pro_text;
	
	
}
