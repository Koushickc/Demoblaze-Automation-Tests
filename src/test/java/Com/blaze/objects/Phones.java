package Com.blaze.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Phones {
	
	 WebDriver driver;
		
		public Phones(WebDriver driver)
		{
			this.driver = driver;
		}
		@FindBy(xpath ="/html/body/div[5]/div/div[1]/div/a[2]")
		public static WebElement phonesLink;
		
		@FindBy(xpath ="//*[@id=\"prev2\"]")
		public static WebElement PreviousLinkButton;
		
		@FindBy(xpath ="/html/body/div[5]/div/div[1]/div/a[2]")
		public static WebElement phonesLink1;
		
		@FindBy(xpath ="//a[text()='Nokia lumia 1520']")
		public static WebElement NokiaLink;
		
		@FindBy(xpath ="//a[text()='Add to cart']")
	    public static WebElement AddChart;
		
		@FindBy(id="cartur")
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
		
		@FindBy(css = "#page-wrapper button")
		public static WebElement placeorder;
		
		@FindBy(id="name")
		public static WebElement Name;
		
		@FindBy(id="country")
		public static WebElement country;
		
		@FindBy(id="city")
		public static WebElement city;
		
		@FindBy(id="card")
		public static WebElement card;
		
		@FindBy(id="month")
		public static WebElement month;
		
		@FindBy(id="year")
		public static WebElement year;
		
		@FindBy (xpath="//button[text()='Purchase']")
		public static WebElement purchase;
		
		
		
		
		
	
		

		
		
		
		
		
}