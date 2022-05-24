package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageOrange {
	WebDriver driver;
	
	@Test(priority=1)
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));

		boolean isdisplay = username.isDisplayed();

		System.out.println("displaying username retuns :" + isdisplay);

		username.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Test(priority = 2)
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("(//*[@id='welcome'])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Logout")).click();

	
		
	}
	
	
	
	
	
}
