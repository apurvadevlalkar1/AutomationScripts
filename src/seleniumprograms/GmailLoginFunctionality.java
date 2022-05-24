package seleniumprograms;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver","G:\\New folder\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='gb_d']")).click();
		//gmailbutton.click();
		WebElement signin=driver.findElement(By.xpath("//*[text()='Sign in']"));
		signin.click();
		
		
      	WebElement Email=driver.findElement(By.xpath("//*[@name='identifier']"));
		Email.sendKeys("apurvadevlalkar@gmail.com");
		
		driver.findElement(By.xpath("//*[@class='VfPpkd-vQzf8d']")).click();
		
//		WebElement createmyself=driver.findElement(By.xpath("//*[@class='VfPpkd-StrnGf-rymPhb-b9t22c']"));
//		createmyself.click();
//		
		

	}

}
