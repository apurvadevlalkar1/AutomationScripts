package testng;

import org.testng.annotations.Test;

public class DependsOnMethod {
		
		@Test(dependsOnMethods = "testng.BeforeMethod.logout")
		public void holdings()
		{
			System.out.println("holdings method");
			
		}
		


}
