package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class BeforeMethod {
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("BeforeTest");
		Assert.fail();
	}
	
	
	@Test(priority=1,dependsOnMethods="login")
	public void dashboard()
	{
		System.out.println("dashboard Method");
		Reporter.log("dashboard Method will be running",true);
	}
	
	@Test(priority=2,dependsOnMethods="dashboard")
	public void admin()
	{
		System.out.println("admin Method");
		Reporter.log("admin Method will be running",true);
	}
	
	@Test(dependsOnMethods = {"dashboard","admin","login"} )// multiple dependent on the test case.
	public void logout()
	{
		System.out.println("Logout");
		
		
	}
	@Test()
	public void testcase2()
	{
		String actual="login";
		Assert.assertEquals(actual, true, "If fail then ");
		Assert.assertEquals("login", true,"If fail");
		System.out.println("Testcase 2 will be executed");
	}


}
