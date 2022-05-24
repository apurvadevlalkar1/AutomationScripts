package testng;

import org.testng.annotations.Test;

public class GroupingOfTestCases {
	@Test(groups = "Sanity")
	public void navToApp()
	{
		System.out.println("Navigation to app");
		
	}
	
	@Test(groups = "Sanity")
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
