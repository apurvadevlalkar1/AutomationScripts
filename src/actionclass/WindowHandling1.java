package actionclass;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		
		String windowid = driver.getWindowHandle();
		System.out.println("Parent window id:"+windowid);
		
		WebElement username=driver.findElementByXPath("//*[@id='txtUsername']");
		boolean isdisplay=username.isDisplayed();
		System.out.println("Displaying username returns :"+isdisplay);
		username.sendKeys("Admin");
		
	    driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
	    driver.findElementByXPath("//*[@name='Submit']").click();
	    
		
	   Set<String> allwindow = driver.getWindowHandles();
	   
	   int countofwindow = allwindow.size();
	   System.out.println(countofwindow);
	   
	   for(String winid:allwindow)
	   {
		   if(!(windowid.equalsIgnoreCase(winid)))
		   {
			   driver.switchTo().window(winid);
			   
		   }
	   }
		
		
		
		
	}

}
