package testng;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Before class method");
		}
		
		@AfterClass
		public void afterClass()
		{
			System.out.println("After class method");
		}
		
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before method");
		}
		
		
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("After method");
		
		}
		
		@Test(priority=1)
		public void test()
		{
			System.out.println("Test method");
		}
		
		@Test(priority = 3)
		public void admin()
		{
			System.out.println("Test case 3 from Test case class");
			Reporter.log("admin method", true);
		}
		

	}

