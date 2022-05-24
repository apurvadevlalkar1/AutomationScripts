package seleniumprograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class TicMarkSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.github.com");
		driver.manage().window().maximize();
		
		
		

	}

}
