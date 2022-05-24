package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	
	@Parameters("browser")
	@Test
	public void HRM(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe")	;
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Money Heist");
			
		}
	}
	
	@Parameters("browser1")
	@Test
	public void FaceBook(String browsername)
	{
			if(browsername.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "G:\\New folder\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				
				driver.get("https://google.com/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Money Heist");
//				driver.findElement(By.xpath("//*[@name='btnI']")).click();
//				driver.findElement(By.xpath("")).sendKeys("HIII");
			}
		
	}
	
		

}
