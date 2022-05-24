package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://github.com");
		driver.manage().window().fullscreen();
		driver.findElement(By.name("user_email")).sendKeys("apurvadevalkar1998@gmail.com");
		
		driver.findElement(By.linkText("Sign up for GitHub")).click();
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("apurvadevalkar1998@gmail.com");
		
		driver.findElement(By.linkText("Continue")).click();
//		driver.close();
		
		
		

	}

}
