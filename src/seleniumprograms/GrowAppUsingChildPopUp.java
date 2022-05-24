package seleniumprograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class GrowAppUsingChildPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://groww.in");
		driver.manage().window().fullscreen();
		
		driver.findElementByXPath("//*[@class='absolute-center']//span[1]").click();
		driver.findElementByXPath("//*[@id='login_email1']").sendKeys("apurvadevlalkar@gmail.com");
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@class='lils382ContinueBtn']//div//div//div//span//span").click();
	
	}

}
