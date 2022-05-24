package testcases;

import org.testng.annotations.Test;

public class SignUpTest extends BaseTestFaceBook {
	
	@Test(priority = 1)
	public void login()
	{
		lp.signup();
		
	}


}
