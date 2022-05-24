package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
		driver.manage().window().fullscreen();
	WebElement button=driver.findElement(By.name("Gmail"));
//	button.sendKeys("apurvadevalkar1998@gmail.com");
	
	
	button.click();

	
		
		
		

	}

}
