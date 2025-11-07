package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Commonclass {
	public String url ="";
	
	public String username ="Kondal";
	public String password = "Welcome@2025";
	public String Name ="Koushick";
	public String Country ="India";
	public String City="Coimbatore";
	public String Card="1234567";
	public String Month = "October";
	public String Year ="1991";
	public String mail = "Koushick.kondal91@gmail.com";
	 

	public static WebDriver driver;
   
    
    @BeforeSuite
    public void launch() throws IOException {
           
        driver = new ChromeDriver();
        // Setup driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoblaze.com/");
    }

   

    @AfterSuite
    public void terminate() {
        if (driver != null) {
            driver.quit();
        }
    }
        
      public void captureFailure(ITestResult result) throws IOException
      {
    	  if(ITestResult.FAILURE == result.getStatus()) {
    		  takeScreenshot(result.getName());
    	  }
      }



	public void takeScreenshot(String testName)throws IOException {
    TakesScreenshot screenshot =((TakesScreenshot)driver);
    
    File src = screenshot.getScreenshotAs(OutputType.FILE);
    File srcpath = new File ("."+"//Screenshots1//"+testName +".png");
    
    FileHandler.copy(src, srcpath);
		
	}
	
    
}
    
