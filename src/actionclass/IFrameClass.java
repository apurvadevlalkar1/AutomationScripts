package actionclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IFrameClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/drag-and-drop-example");
		
		WebElement Div1 = driver.findElementByXPath("//*[@id='div1']");
	
		WebElement Div2 = driver.findElementByXPath("//*[@id='div2']");
		
		Actions act=new Actions(driver);
		
//		driver.switchTo().parentFrame();
		WebElement text1 = driver.findElementByXPath("//*[@id='drag1']");
		
		act.dragAndDrop(text1,Div2).build().perform();
		
		
		
	}

}
