package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class Scrooling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		username.sendKeys("Admin");
		
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,800)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(10,200)");
		
		driver.findElementByXPath("//*[@id=\"resultTable\"]/tbody/tr[17]/td[2]").click();
		
//		js.executeScript("arguments[0].scrollIntoView().click();",checkbox);
//		
//		System.out.println("finding checkbox");
		
		
//		js.executeScript("argument[0].click();", checkbox);
//		System.out.println("searching checkbox");
		

	}

}
