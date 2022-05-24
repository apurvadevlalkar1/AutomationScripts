package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages.SignUpFaceBook;

public class BaseTestFaceBook {
	static WebDriver driver;
	SignUpFaceBook lp;
	
	@BeforeSuite
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afcg19_qtBCuUD4M8MV0wnL2qbqRM3bK9lH2T-6_A3A42Gnl6-vVVDI6kwfxaVnAdgaYXjf82AURfFRce8BH45Jr7LzCidmyziWBxoAZD65sOg&smuh=64625&lh=Ac-pET69byYFyATxBXQ");
		
	}
	
	@BeforeTest
	public void createObject()
	{
		lp=new SignUpFaceBook(driver);
		
	}
	

}
