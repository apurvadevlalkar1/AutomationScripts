package actionclass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchWindow {
	
		public static void main(String[] args) throws InterruptedException {
			
			
			
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();


			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
			String parentid = driver.getWindowHandle();
			
			
			System.out.println("Parent window id is :"+parentid);
			
			driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
			
			
			Set<String> allwindow = driver.getWindowHandles();
			
			int countofwindow = allwindow.size();
			
			System.out.println("Total number of windows are: "+countofwindow);
			
			
			for(String winid:allwindow)
			{
				System.out.println(winid);
				
				if(!(parentid.equalsIgnoreCase(winid)))
				{
					driver.switchTo().window(winid);// switching to child id
					
					driver.findElement(By.xpath("//*[@value='Try OrangeHRM for Free']")).click();
					
					Thread.sleep(2000);
					
					driver.switchTo().window(parentid);// switching to parent id
					
					
					driver.quit();
				}
			}
			
			
			
			
		}

	}

