package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BooleanDatatyeMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	driver.manage().window().fullscreen();
	WebElement username=driver.findElement(By.xpath("//*[@name='txtUsername']"));
	boolean isdisplay = username.isDisplayed();
	System.out.println("Displaying username returns: "+isdisplay);
	

	}

}
