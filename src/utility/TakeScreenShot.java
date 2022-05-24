package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {
	
	public static void TakeScreenShotOfApp(WebDriver driver,String filename) throws IOException {
		
TakesScreenshot screenshot=(TakesScreenshot)driver;
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File Destination=new File(System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png");
		
		FileHandler.copy(source, Destination);
		
		
		
	}

}
