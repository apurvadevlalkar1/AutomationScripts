package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages.LoginFaceBook;

public class BaseTest2 {
	static WebDriver driver;
	LoginFaceBook lp;
	
	@BeforeSuite
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php");
		
	}
	
	@BeforeTest()
	public void createObject()
	{
		lp=new LoginFaceBook(driver);
	}


}
