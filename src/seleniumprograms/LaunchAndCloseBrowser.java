package seleniumprograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAndCloseBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.get("https://github.com/SeleniumHQ/selenium");
		driver.manage().window().fullscreen();
		
		driver.navigate().to("https://aaplesarkar.mahaonline.gov.in/en/Login/Login");
		
		driver.get("https://google.com");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
//		driver.close();
		driver.quit();
		
		
	
	}

}
