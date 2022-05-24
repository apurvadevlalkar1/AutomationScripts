package testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.TakeScreenShot;

public class LoginOfZerodha {
	WebDriver driver;

	@Test(priority=1)
	public void login() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DAA67");
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Velocity@123");

		driver.findElement(By.xpath("//*[@type='submit']")).click();

		
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("992101");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		TakeScreenShot.TakeScreenShotOfApp(driver,"S1");
		
	
		
	}
}
