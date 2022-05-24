package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupsOfTestCases {
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Opening the browser");
	}
	
	
	@Test(groups = "Sanity")
	public void navToApp()
	{
		System.out.println("Navigation to app");
		
	}
	
	@Test(groups = {"Sanity", "Regression", "Functional"})
	public void login()
	{
		System.out.println("login to app");
		
	}
	
	@Test(groups = "Regression")
	public void dashboard()
	{
		System.out.println("Dashboard");
		
	}
	@Test(groups = "Functional")
	public void profile()
	{
		System.out.println("Profile");
		
	}
	
	@Test(groups = "Sanity")
	public void buy()
	{
		System.out.println("Buying of shares");
		
	}
	
	@Test(groups = "Sanity")
	public void logout()
	{
		System.out.println("Logout from app");
		
	}


}
