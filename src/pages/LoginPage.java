package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//*[@id='welcome']")
	private WebElement welcome;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutlink;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginToApp()
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		submitbutton.click();
	}
	public void logout() throws InterruptedException
	{
		welcome.click();
		Thread.sleep(2000);
		logoutlink.click();
	}
	
	
}
