package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersUsage {
	WebDriver driver;

	@Parameters("browser")
	@Test
	public void browserSelection(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe")	;
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Money Heist");
		
	}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "G:\\New folder\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();	
		}
	}
	
	@Parameters({"environment","version"})
	@Test
	public void buildinfo(String env,String version)
	{
		System.out.println("The environment is:"+env);
		System.out.println("The version name is:"+version);
		
//		driver.get("https://kite."+env+"zerodha.com/");
	}
}
