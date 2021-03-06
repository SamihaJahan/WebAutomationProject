package TestCasePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.Test;

public class TC001_locatorLearning extends BaseDriver {
	
	String baseurl="https://rahulshettyacademy.com/locatorspractice/";
	
	@Test
	public void locatorLearning() throws InterruptedException
	
	{
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("inputUsername")).sendKeys("Samiha");
		driver.findElement(By.name("inputPassword")).sendKeys("samiha123");
		

		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//Formula:    tagname.value (if class is given)
		//			  tagname#value (if id is given)

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		
		
		
		
	}
	
	
}
