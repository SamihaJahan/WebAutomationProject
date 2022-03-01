package Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSet {
	
	 WebDriver driver=null;
	
		@BeforeSuite
		public void setup()
		{
			
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();
		}
		
		@AfterSuite
		public void Down()
		
		{
			driver.quit();
		}
		
		
	}
