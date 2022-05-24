package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/campaign/landing.php?&campaign_id=973072070&extra_1=s%7Cc%7C231327397082%7Ce%7Cfacebook%20english%7C&placement&creative=231327397082&keyword=facebook%20english&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006255091%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-302991057522%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIwqOr_vL_8QIViTArCh1Jwgo3EAAYASAAEgJp6vD_BwE");
		driver.manage().window().maximize();
		
		WebElement first=driver.findElement(By.name("firstname"));
		first.sendKeys("Apurva");
		
		WebElement last=driver.findElement(By.name("lastname"));
		last.sendKeys("Devlalkar");

		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("apurvadevalkar1998@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("apurvadevalkar1998@gmail.com");
		
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("apurva");
		
		WebElement day = driver.findElementByXPath("//*[@id='day']");
		Select sel=new Select(day);
		sel.selectByIndex(1);
		
		WebElement month=driver.findElementByXPath("//*[@id='month']");
		Select sel1=new Select(month);
		sel1.selectByValue("12");
		
		WebElement year=driver.findElementByXPath("//*[@id='year']");
		Select sel2=new Select(year);
		sel2.selectByVisibleText("2012");
		
		WebElement gender=driver.findElement(By.xpath("(//*[@type='radio'])[1]"));
		gender.click();
		
//		Thread.sleep(2000);
		driver.findElementByXPath("//*[@name='websubmit']").click();
		

	}

}
