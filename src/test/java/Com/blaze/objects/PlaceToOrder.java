package Com.blaze.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceToOrder {
	WebDriver driver;
	
	public PlaceToOrder(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(xpath = "/html/body/div[6]/div/div[2]/button")
	public static WebElement Placeorder;
	
	@FindBy(id="name")
	public static WebElement Name;
	
	@FindBy(id="country")
	public static WebElement Country;
	
	@FindBy(id="city")
	public static WebElement City;
	
	@FindBy(id="card")
	public static WebElement Card;
	
	@FindBy(id="month")
	public static WebElement Month;
	
	@FindBy(id="year")
	public static WebElement Year;
	
	@FindBy (xpath="//button[text()='Purchase']")
	public static WebElement purchase;
	
	@FindBy(xpath ="//button[text()='OK']")
	public static WebElement OkayButton;
	
	
	

}
