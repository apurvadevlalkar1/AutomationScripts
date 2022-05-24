package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeAutomationForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		Thread.sleep(5000);
		
		WebElement firstname=driver.findElement(By.xpath("//*[@name='firstname']"));
		firstname.sendKeys("Apurva");
		
		WebElement Lastname=driver.findElement(By.xpath("//*[@name='lastname']"));
		Lastname.sendKeys("Devlalkar");
		

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement gender=driver.findElement(By.xpath("//*[@name='sex'][2]"));
		gender.click();
		
		WebElement exp=driver.findElement(By.xpath("//*[@name='exp'][3]"));
		exp.click();
		
		WebElement date=driver.findElement(By.xpath("//*[@id='datepicker']"));
		date.sendKeys("02-12-1998");
		
		WebElement profession=driver.findElement(By.xpath("//*[@name='profession']"));
		profession.click();
		
		WebElement tool=driver.findElement(By.xpath("//*[@id='tool-2']"));
		tool.click();
		
		WebElement continents=driver.findElement(By.xpath("//*[@class='input-xlarge']"));
		Select sel=new Select(continents);
		sel.selectByVisibleText("Africa");
		
		WebElement seleniumcommands=driver.findElement(By.xpath("//*[@id='selenium_commands']"));
		Select sel1=new Select(seleniumcommands);
		sel1.selectByVisibleText("Wait Commands");
		
		
		
		driver.findElement(By.xpath("//*[@id='photo']")).sendKeys("C:\\Users\\user\\OneDrive\\Desktop/Selenium Framework.png");
//		 choosefile.sendKeys("Desktop/Selenium Framework.png");
		
//		js.executeScript("arguments[0].ScrollIntoView();",gender);
		
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		
		
		
		
		

	}

}
