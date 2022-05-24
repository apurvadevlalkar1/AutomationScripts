package actionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   
	    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	    
	    


	}

}
