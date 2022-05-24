package actionclass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
	
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent window");
		
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Set<String> child = driver.getWindowHandles();
		
		int count=child.size();
		System.out.println("Total no of windows are:"+count);
		
		for(String winid:child)
		{
			System.out.println(winid);
			if(!(parent.equalsIgnoreCase(winid)))
			{
				driver.switchTo().window(winid);// switching to child id
				
				driver.findElement(By.xpath("//*[@value='Try OrangeHRM for Free']")).click();
				
				Thread.sleep(2000);
				
				driver.switchTo().window(parent);// switching to parent id
				
				
				driver.quit();
				
				
			}
		}
		
		
		
		
		
		
	}
}
