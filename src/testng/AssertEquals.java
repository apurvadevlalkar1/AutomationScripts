package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().fullscreen();
		
		WebElement username=driver.findElement(By.xpath("//*[@id='txtUsername']"));
		boolean isdisplay=username.isDisplayed();
		System.out.println("Displaying username returns :"+isdisplay);
		username.sendKeys("Admin");
		
	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@name='Submit']")).click();
	    
	    
       driver.findElement(By.xpath("(//*[@id='welcome'])[1]")).click();
       
       String url=driver.getCurrentUrl();
       System.out.println(url);
       boolean ispresent=url.contains("dashboard");
       Assert.assertEquals(ispresent, true);
	}
}
