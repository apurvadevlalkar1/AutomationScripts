package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethod {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().fullscreen();
		WebElement element=driver.findElementByXPath("//*[@id='alert']");
		
		Thread.sleep(5000);
	element.click();
		
		WebElement disabled = driver.findElementByXPath("//*[@id='enable-button']");
		boolean isenabled=disabled.isEnabled();
		System.out.println("Before Operation:"+isenabled);
		driver.findElement(By.xpath("//*[@id='disable']")).click();
		Thread.sleep(12000);
		
		boolean afteroperation=disabled.isEnabled();
		System.out.println("After Operation :"+afteroperation);
		
		
		
		
		 

	}

}

