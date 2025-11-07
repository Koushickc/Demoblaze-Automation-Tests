package Com.blaze.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteCart {

	WebDriver driver;
	
	public DeleteCart(WebDriver driver)
	{
		this.driver = driver;
	}
	 @FindBy(xpath="/html/body/nav/div/div/ul/li[4]/a")
	public static WebElement cart;
	 
	 @FindBy(xpath="//a[text()='Delete']")
	 public static WebElement delete;
	 
	 @FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[1]/a")
	 public static WebElement home;
	 
	 @FindBy(xpath ="/html/body/div[5]/div/div[1]/div/a[2]")
	 public static WebElement phonesLink2;
		
	@FindBy(xpath ="//a[text()='Nokia lumia 1520']")
	public static WebElement NokiaLink1;
	
	@FindBy(xpath ="//a[text()='Add to cart']")
    public static WebElement AddChart1;
	
	@FindBy(id="cartur")
	public static WebElement cart1;
	 
	 
	

}
