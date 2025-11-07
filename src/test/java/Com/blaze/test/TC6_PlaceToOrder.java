package Com.blaze.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.blaze.objects.PlaceToOrder;
import Utilities.Commonclass;

public class TC6_PlaceToOrder extends Commonclass {
	@Test
	public void placeorder()
	{
		PageFactory.initElements(driver, PlaceToOrder.class);
		driver.navigate().refresh();
		PlaceToOrder.Placeorder.click();
		PlaceToOrder.Name.sendKeys(Name);
		PlaceToOrder.Country.sendKeys(Country);
		PlaceToOrder.City.sendKeys(City);
		PlaceToOrder.Card.sendKeys(Card);
		PlaceToOrder.Month.sendKeys(Month);
		PlaceToOrder.Year.sendKeys(Year);
		PlaceToOrder.purchase.click();
		PlaceToOrder.OkayButton.click();
		
		
		
	}

}

