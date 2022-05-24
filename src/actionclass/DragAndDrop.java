package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");

		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='panel-body']"));
		driver.switchTo().frame(iframe);
		
		WebElement draggable = driver.findElement(By.xpath("//*[text()='Draggable 1']"));
		
		WebElement droppable = driver.findElement(By.xpath("//*[@id='mydropzone']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable, droppable).perform();
		
		driver.switchTo().parentFrame();	
		
	}

}
