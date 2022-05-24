package seleniumprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangeWebDriver {
	
	static WebDriver driver;
	static String browser="chrome";
	static String browser1="firefox";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	if(browser.equals("chrome"))
	{
		    System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
	}
	else if(browser1.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","G:\\New folder\\geckodriver.exe");
		driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
	}
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
//	WebElement login=driver.findElement(By.xpath("//*[@id='btnLogin']"));
//	login.click();
	
	}

}
