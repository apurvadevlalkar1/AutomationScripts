package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@name='alert']").click();
		String alerttext=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();//Alert Pop up with Ok and cancel button.
		System.out.println(alerttext);
		
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//input[@name='confirmation']").click();
		String close=driver.switchTo().alert().getText();
		System.out.println(close);
		driver.switchTo().alert().dismiss();//cancel button will be pressed
		
		Thread.sleep(2000);
	    WebElement msg = driver.findElementByXPath("//*[@name='prompt']");
	    msg.click();
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@name='upload']").sendKeys("F:\\Photos\\Camera\\IMG_20200101_233724.jpg");
		driver.switchTo().alert().accept();
		
		
//		Thread.sleep(2000);
//	    driver.findElementByXPath("//button[@id='sub-menu']").click();
//		Select sel=new Select(buttonhover);
//		sel.selectByVisibleText("Google");
		
		Actions action = new Actions(driver);
		 
		// Find element using locator and store into WebElement
		WebElement element = driver.findElement(By.id("double-click"));
		 
		// Perform Double click operation using action (object) on element.
		action.doubleClick(element).perform();
		
		
		
		
		
	}

}
