package Registration;

	import org.openqa.selenium.By;
    import org.testng.annotations.Test;
	
	
	
	public class SignUpTest extends DriverSet{
	
		String baseurl="https://bikroy.com/";
		
		@Test
		public void locatorLearning() throws InterruptedException
		
		{
			
			driver.get(baseurl);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[text()='Sign up']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("name")).sendKeys("Samiha Jahan");
			
	
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("samihabubt4@gmail.com");
			
			Thread.sleep(2000);
		  driver.findElement(By.id("password")).sendKeys("11122abc#$");
			
			Thread.sleep(2000);
		  driver.findElement(By.id("password-confirm")).sendKeys("1122abc#$");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Sign up']")).click();
			
			Thread.sleep(1000);
			
			
					


	}

}
