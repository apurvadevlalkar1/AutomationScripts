package seleniumprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMDemo {

	public static void main(String[] args) throws InterruptedException{
	
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();


			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
			
	WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			
			username.sendKeys("Admin");
			
			
			WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("admin123");
			
			
			driver.findElement(By.xpath("//input[@name='Submit']")).click();
			
			
			driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		// to handle all the checkboxes using find element	
	    java.util.List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
		
		for(WebElement check :checkboxes)
		{
			check.click();
			
		}
		
	}

}
