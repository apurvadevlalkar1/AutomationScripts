package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpFaceBook {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@name='pass']")
	private WebElement pass;
	
	@FindBy(xpath="//*[@name='login']")
	private WebElement submit;
	
	public SignUpFaceBook(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signup()
	{
		email.sendKeys("apurvadevlalkar@gmail.com");
		pass.sendKeys("apurva@123");
		submit.click();
		
	}
	
}
