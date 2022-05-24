package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@BeforeSuite()
	public void m9()
	{
		System.out.println("Before Suite will be executed");
		Reporter.log("TestCase1");
	}
	
	@BeforeClass()
	public void m7()
	{
		System.out.println("Before Class will be executed");
	}
	
	@BeforeTest()
	public void m3()
	{
		System.out.println("BeforeTest case");
	}
	@BeforeMethod()
	public void m5()
	{
		System.out.println("Before Method will be executed");
	}
	
		
		@Test(invocationCount = 5)
		public void m1()
		{
			System.out.println("It will execute 5 times");
		}
		
		
		@Test(enabled=false)
		public void m2()
		{
			System.out.println("Enabled");
			
		}
		
		
		
		@AfterMethod()
		public void m6()
		{
			System.out.println("After Method will be executed");
		}
		@AfterTest()
		public void m4()
		{
			System.out.println("AfterTest case");
		}
		
		
		
		@AfterClass()
		public void m8()
		{
			System.out.println("After Class will be executed");
		}
		
		@AfterSuite()
		public void m10()
		{
			System.out.println("After Suite will be executed");
		}
		
		
		
		

}

