package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartHandlingUsingExplicitWait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='kJjFO0 _3DIhEh'])[2]")));
		driver.findElement(By.xpath("(//*[@class='kJjFO0 _3DIhEh'])[2]"));
		
		
		
		
	}

	
}
