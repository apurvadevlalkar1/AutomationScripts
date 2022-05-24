package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To launch the browser
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement date = driver.findElement(By.xpath("//*[@id='datepicker']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",date);
		
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
				
		String title=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		
		while(true)
		{
		
		if(!(title.equalsIgnoreCase("July 2020")))
		{
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	
		
		WebElement date1 = driver.findElement(By.xpath("(//*[@class='ui-state-default'])[19]"));
		date1.click();
	
	
		}

		
	}

}
