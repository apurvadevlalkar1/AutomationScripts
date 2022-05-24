package testng;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestCase3 {
	public void login()
	{
	
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
	
			boolean isdisplay = username.isDisplayed();
	
			System.out.println("displaying username retuns :" + isdisplay);
	
			username.sendKeys("Admin");
	
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	
			driver.findElement(By.xpath("//input[@name='Submit']")).click();
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			boolean ispresent = url.contains("dashboard");
			
			Assert.assertEquals(ispresent, true);
			System.out.println("Testcase Passed");
			
		
	}


}
