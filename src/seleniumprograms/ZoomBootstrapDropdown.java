package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomBootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://zoom.us/signup");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='select-0']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(@ id,'select-item-select-0-4')]")).click();
		
		driver.findElementByXPath("//*[@id='select-1']").click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(@id,'select-item-select-1-2')]")).click();
		
		
		driver.findElementByXPath(" //*[@id='select-2']").click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@id,'select-item-select-2-104')]")).click();
		
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@class='zm-button__slot']").click();
		
         driver.findElementByXPath("//*[@id='email']").sendKeys("apurva@gmail.com");
		
		driver.findElementByXPath("//*[@id='signup-button']").click();
		
		
		
		
		

	}

}
