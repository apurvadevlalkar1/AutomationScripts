package seleniumprograms;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonAutoScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.edge.driver", "G:\\MSEdge Driver\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://automationpractice.com/index.php");
//		
//		driver.findElement(By.xpath("//*[@class='login']")).click();
//		WebElement mail=driver.findElement(By.xpath("//*[@id='email_create']"));
//		mail.sendKeys("apurvadevlalkar@gmail.com");
//		
//		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
//		
//		Thread.sleep(1000);
//		
//		WebElement title=driver.findElement(By.xpath("//*[@id='uniform-id_gen	der2']"));
//		title.click();
//		
//		WebElement firstname=driver.findElement(By.xpath("//*[@id='customer_firstname']"));
//		firstname.sendKeys("Apurva");
//		
//		WebElement Lastname=driver.findElement(By.xpath("//*[@name='customer_lastname']"));
//		Lastname.sendKeys("Devlalkar");
//
//		WebElement password=driver.findElement(By.xpath("//*[@name='passwd']"));
//		password.sendKeys("Apurva");
//		
//		 driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
//		  driver.findElement(By.name("customer_firstname")).sendKeys("Test User");
//		  driver.findElement(By.name("customer_lastname")).sendKeys("Vsoft");
//		  driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
		

//		  WebDriver driver=new ChromeDriver();
		  System.setProperty("webdriver.edge.driver", "G:\\MSEdge Driver\\msedgedriver.exe");
         WebDriver driver=new EdgeDriver();
		  String URL="http://automationpractice.com/index.php";

		  driver.get(URL);
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		  driver.manage().window().maximize();
		  
		  //Click on Sign in
		  driver.findElement(By.linkText("Sign in")).click();
		  
		  //Enter email address
		  driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("apurvadev123@gmail.com");
		  
		  //Click on "Create an account"
		  driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
		  
		  //Select Title
		  driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		  driver.findElement(By.name("customer_firstname")).sendKeys("Test User");
		  driver.findElement(By.name("customer_lastname")).sendKeys("Vsoft");
		  driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
		  
		  // Enter your address
		  driver.findElement(By.id("firstname")).sendKeys("Test User");
		  driver.findElement(By.id("lastname")).sendKeys("Vsoft");
		  driver.findElement(By.id("company")).sendKeys("Vsoft");
		  driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
		  driver.findElement(By.id("city")).sendKeys("XYZ");
		  
		  // Select State
		  WebElement statedropdown=driver.findElement(By.name("id_state"));
		  Select oSelect=new Select(statedropdown);
		  oSelect.selectByValue("4");

		  driver.findElement(By.name("postcode")).sendKeys("51838");
		  
		  // Select Country
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  Select oSelectC=new Select(countrydropDown);
		  oSelectC.selectByVisibleText("United States");
		  
		  //Enter Mobile Number
		  driver.findElement(By.id("phone_mobile")).sendKeys("234567890");
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Office");
		  driver.findElement(By.name("submitAccount")).click();
		  String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();

		// Validate that user has createdif(userText.contains("Vsoft")) {
		   System.out.println("User Verified,Test case Passed");
		  }

}
