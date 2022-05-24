package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase2 {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test");
	}
	
	@Test
	public void login2()
	{
		System.out.println("Login from TestClass 2 class");
		
		Reporter.log("Login2 method");
	}
	
	@Test(priority = 1)
	public void dashBoard2()
	{
		System.out.println("Dashboard2 from Testclass2");
		Reporter.log("dashBoard2 method", true);
	}


}
