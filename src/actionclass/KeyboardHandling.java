package actionclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/campaign/landing.php?&campaign_id=973072070&extra_1=s%7Cc%7C231327397082%7Ce%7Cfacebook%20english%7C&placement&creative=231327397082&keyword=facebook%20english&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006255091%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-302991057522%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIwqOr_vL_8QIViTArCh1Jwgo3EAAYASAAEgJp6vD_BwE");
		
		driver.findElementByXPath("//*[@name='firstname']").sendKeys("Apurva");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).sendKeys("devlalkar")
		.sendKeys(Keys.TAB).sendKeys("7689749320")
		.sendKeys(Keys.TAB).sendKeys("apurva").build().perform();
		
		WebElement day = driver.findElementByXPath("//*[@name='birthday_day']");
//		act.sendKeys("2").sendKeys(Keys.TAB).sendKeys("12").sendKeys(Keys.TAB).sendKeys("1998").build().perform();
		
		WebElement gender = driver.findElementByXPath("//input[@value='1']");
		act.click(gender).perform();
		
		WebElement submit=driver.findElementByXPath("//*[@name='websubmit']");
		act.click(submit).perform();


	}

}
