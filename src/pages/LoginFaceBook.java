package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginFaceBook {
	
	WebDriver driver;
	@FindBy(xpath="//*[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//*[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//*[@name='reg_email__']")
	private WebElement email;
	
	@FindBy(xpath="//*[@name='reg_email_confirmation__']")
	private WebElement confirm;
	
	@FindBy(xpath="//*[@name='reg_passwd__']")
	private WebElement password;
	
	@FindBy(xpath="//*[@name='birthday_day']")
	private WebElement day;
	
	@FindBy(xpath="//*[@name='birthday_month']")
	private WebElement month;
	
	@FindBy(xpath="//*[@name='birthday_year']")
	private WebElement year;
	
	@FindBy(xpath="//*[text()='Female']")
	private WebElement gender;
	
	
	
	@FindBy(xpath="//*[text()='Sign Up']")
	private WebElement submitbutton;
	
	public LoginFaceBook(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApp()
	{

		firstname.sendKeys("Apurva");

		lastname.sendKeys("Devlalkar");
		email.sendKeys("apurvadevlalkar@gmail.com");
		confirm.sendKeys("apurvadevlalkar@gmail.com");
		password.sendKeys("apurva@123");
		
		
		Select sec=new Select(day);
		sec.selectByIndex(1);
		
		Select sec1=new Select(month);

		sec1.selectByValue("12");
		Select sec2=new Select(year);
		sec2.selectByValue("1998");
		
		gender.click();
		
		
		
		submitbutton.click();
		
	}
	

}
