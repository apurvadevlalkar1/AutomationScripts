package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apurva");
//		driver.findElement(By.xpath("//input[@type='text']")).click();
//		driver.findElement(By.xpath("//*[contains(text()='https://mail.google.com/mail/&ogbl']")).click();
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.partialLinkText("Create an")).click();
		
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Apurva");
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Devlalkar");
		driver.findElement(By.xpath("//*[@id='lastName']")).clear();
		driver.findElement(By.xpath("//*[@id='Username']")).click();
		driver.findElement(By.xpath("//*[@name='Passwd']")).sendKeys("Apurva");
		driver.findElement(By.xpath("//*[@name='ConfirmPasswd']")).sendKeys("Apurva");
		
		driver.findElement(By.linkText("button")).click();
		
		
		

	}

	
}
