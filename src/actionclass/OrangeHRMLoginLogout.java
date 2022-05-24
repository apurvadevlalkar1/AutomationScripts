package actionclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginLogout {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().fullscreen();
		
		WebElement username=driver.findElementByXPath("//*[@id='txtUsername']");
		boolean isdisplay=username.isDisplayed();
		System.out.println("Displaying username returns :"+isdisplay);
		username.sendKeys("Admin");
		
	    driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
	    driver.findElementByXPath("//*[@name='Submit']").click();
	    
	    
       driver.findElementByXPath("(//*[@id='welcome'])[1]").click();
       
       Thread.sleep(2000);
       driver.findElementByPartialLinkText("Logout").click();
 
	}

}
