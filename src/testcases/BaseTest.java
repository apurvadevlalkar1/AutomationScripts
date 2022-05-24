package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;

public class BaseTest{
	
	static WebDriver driver;
	LoginPage lp;
	
	@BeforeSuite
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
	}
	
	@BeforeTest
	public void createobject()
	{
		lp=new LoginPage(driver);
		
	}
	
	@AfterSuite()
	public void teardown() throws InterruptedException
	{
		lp.logout();
	}
	

}
