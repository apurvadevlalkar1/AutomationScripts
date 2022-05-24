package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/campaign/landing.php?&campaign_id=973072070&extra_1=s%7Cc%7C231327397082%7Ce%7Cfacebook%20english%7C&placement&creative=231327397082&keyword=facebook%20english&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006255091%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-302991057522%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIwqOr_vL_8QIViTArCh1Jwgo3EAAYASAAEgJp6vD_BwE");
		
		driver.manage().window().fullscreen();
		
		WebElement first=driver.findElement(By.name("firstname"));
		first.sendKeys("Apurva");
		
		WebElement last=driver.findElement(By.name("lastname"));
		last.sendKeys("Devlalkar");

		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("apurvadevalkar1998@gmail.com");
		
		WebElement Reenter = driver.findElementByXPath("//*[@name='reg_email_confirmation__']");
		Reenter.sendKeys("apurvadevalkar1998@gmail.com"); 
		
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("apurva@123");
		
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select dropdown1=new Select(day);
		dropdown1.selectByValue("2");
		
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select dropdown2=new Select(month);
		dropdown2.selectByValue("12");
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select dropdown3=new Select(year);
		dropdown3.selectByValue("1998");
		
		driver.findElement(By.xpath("//*[@class='mtm _5wa2 _5dbb']/span/span/label[1]")).click();
		
			
		driver.findElement(By.xpath("//*[@class='_1lch']/button")).click();
	
		
		
		
		
//		driver.close();
		
	}

}
