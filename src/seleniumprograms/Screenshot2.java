package seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.switchTo().alert().accept();
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\user\\OneDrive\\Desktop\\Screenshot");
		FileHandler.copy(source, destination);

	}
	

}
