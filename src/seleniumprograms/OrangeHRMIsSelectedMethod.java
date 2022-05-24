package seleniumprograms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMIsSelectedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	    
	    
	    driver.findElementByXPath("//*[@id='menu_admin_viewAdminModule']").click();
	    
	  WebElement checkbox = driver.findElementByXPath("//*[@id='ohrmList_chkSelectRecord_10']");
	  boolean ischecked = checkbox.isSelected();
	   System.out.println("Before Clicked:"+ischecked);
	  checkbox.click();
	  
	  boolean afterclick=checkbox.isSelected();
	  System.out.println("After click returns:"+afterclick);
	    
	    
	 
	    
		

	}

}
