package actionclass;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
//		java.util.List<WebElement> searchbox = driver.findElementsByXPath("//*[@class='gLFyf gsfi']");
//		int count = searchbox.size();
//		System.out.println(count);
//		for(int i=1;i<=count;i++)
//		{
//			 searchbox.contains("India");
//		}
		
		
		
	
		WebElement searchbox = driver.findElementByXPath("//*[@name='q']");
		
		searchbox.sendKeys("Ind");
		
		java.util.List<WebElement> result = driver.findElements(By.xpath("//*[@class='erkvQe']"));
		
		for(WebElement list:result)
		{
			String str=list.getText();
			if(str.contains("India Post"))
				{
				
			    Thread.sleep(2000);
			    list.click();
		}
		


	}
	}
}
