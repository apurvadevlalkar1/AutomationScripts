package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParallelTesting2 {
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test(priority=1)
	public void Chrome(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"G:\\FirefoxDriver\\geckodriver.exe");

			 driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));

		boolean isdisplay = username.isDisplayed();

		System.out.println("displaying username retuns :" + isdisplay);

		username.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		
	}

}
