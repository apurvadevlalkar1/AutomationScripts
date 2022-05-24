package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FailedTestcases {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
			"G:\\Selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

//Child browser popup
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	WebElement username = driver.findElement(By.xpath("//input[@id='txtUseame']"));
	
			boolean isdisplay = username.isDisplayed();
	
			System.out.println("displaying username retuns :" + isdisplay);
	
			username.sendKeys("Admin");
	
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	
			driver.findElement(By.xpath("//input[@name='Submit']")).click();
			
			
			driver.findElement(By.xpath("(//*[@id='welcome'])[1]")).click();
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@Test
	public void testCase2()
	{
	System.out.println("Testcase2 ");	
		
		
	}
	
	@Test
	public void testCase3()
	{
	System.out.println("Testcase3 ");	
		
		
	}


}
