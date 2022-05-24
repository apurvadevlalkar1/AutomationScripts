package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WaitsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);


		driver.get("https://groww.in/");
		
		WebElement search = driver.findElement(By.xpath("//*[@name ='q']"));
		search.sendKeys("Ind");
		
		Actions act=new Actions(driver);
		act.sendKeys(search,Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//*[text()='Sbi.co.in']")).click();
		
		
		

	}

}
