package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoftAssert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DV1510");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Reset@123");
		
		driver.findElement(By.xpath("//*[@class='button-orange wide']")).click();
		
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("959594");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		SoftAssert1 sa = new SoftAssert1();
		
         String url = driver.getCurrentUrl();
		
		boolean iscorrect = url.contains("dashboard");
		
		
//		sa.assertTrue(iscorrect);
//		
//		sa.assertAll();


	}

}
