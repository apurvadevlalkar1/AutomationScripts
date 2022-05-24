package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		WebElement drag1 = driver.findElement(By.xpath("//*[text()='Draggable 1']"));
		
		WebElement drop = driver.findElement(By.xpath("//*[@id='mydropzone']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag1, drop).build().perform();

	}

}
