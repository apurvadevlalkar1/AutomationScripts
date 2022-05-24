package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
				
				username.sendKeys("Admin");
				
				
				WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
				password.sendKeys("admin123");
				
				
				driver.findElement(By.xpath("//input[@name='Submit']")).click();
				
				
				WebElement admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
				admin.click();
				
				Actions act=new Actions(driver);
				WebElement managementhover = driver.findElementByXPath("//*[@class='arrow']");
				
				WebElement userbutton = driver.findElementByXPath("//*[@id='menu_admin_viewSystemUsers']");
				
				act.moveToElement(admin).moveToElement(managementhover).build().perform();
				act.moveToElement(managementhover).moveToElement(userbutton).build().perform();
				
				
		
	
	}

}
