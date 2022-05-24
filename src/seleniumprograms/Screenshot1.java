package seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
//		 TakesScreenshot screenshot = (TakesScreenshot)driver;
//		 File source = screenshot.getScreenshotAs(OutputType.FILE);
//		 File Destination=new File("C:\\Users\\user\\OneDrive\\Desktop\\Screenshot\\screenshot1.png");
//		 
//		 FileHandler.copy(source, Destination);
//		 System.out.println("Screenshot captured");
		
		TakesScreenShotMethod.screenshot(driver,"Screenshot2");
		
		System.out.println("Screenshot will be captured");

	}

}
