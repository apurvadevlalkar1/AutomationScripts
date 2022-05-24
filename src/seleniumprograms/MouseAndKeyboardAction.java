package seleniumprograms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseAndKeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/campaign/landing.php?&campaign_id=973072070&extra_1=s%7Cc%7C231327397082%7Ce%7Cfacebook%20english%7C&placement&creative=231327397082&keyword=facebook%20english&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006255091%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-302991057522%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIwqOr_vL_8QIViTArCh1Jwgo3EAAYASAAEgJp6vD_BwE");
		driver.manage().window().fullscreen();
		
		Actions act=new Actions(driver);
		driver.findElementByXPath("//*[@name='firstname']").sendKeys("Apurva");
		act.sendKeys(Keys.TAB).sendKeys("Devlalkar")
		.sendKeys(Keys.TAB).sendKeys("9767080870")
		.sendKeys(Keys.TAB).sendKeys("Apurva")
		.click().build().perform();
		
		WebElement day = driver.findElementByXPath("//select[@name='birthday_day']");
		Select sec=new Select(day);
		sec.selectByIndex(2);
		act.sendKeys(Keys.TAB).sendKeys("Dec")
		.sendKeys(Keys.TAB).sendKeys("1998")
		.build().perform();
		
		WebElement gender = driver.findElementByXPath("//input[@value='1']");
		gender.click();
		
		act.click(gender).perform();
		driver.findElementByXPath("//*[@name='websubmit']").click();
		
		

	}

}
