package seleniumprograms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleToYouTube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElementByXPath("//input[@class='gLFyf gsfi']");
		search.sendKeys("YouTube");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.sendKeys(search,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		driver.findElementByXPath("//*[@class='LC20lb DKV0Md']").click();
		
		driver.findElementByXPath("//*[@id='search']").sendKeys("kabhi");
		Thread.sleep(2000);
		act.sendKeys(search,Keys.ENTER).build().perform();
		
		driver.findElementByXPath("//*[@id=\"video-title\"]/yt-formatted-string").click();
		
		

	}

}
