package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 60);
		
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		WebElement text=driver.findElement(By.xpath("//*[@id='populate-text']"));
		text.click();
		wait.until(ExpectedConditions.visibilityOf(text));
		
		
		
	}

}
