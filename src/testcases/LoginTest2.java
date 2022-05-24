package testcases;

import org.testng.annotations.Test;

public class LoginTest2 extends BaseTest2{
	
	@Test(priority=1)
	public void login()
	{
		lp.loginToApp();
	}

}
