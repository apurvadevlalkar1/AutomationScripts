package testng;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.TakeScreenShot;

public class ITestListener3 extends ITestListener2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case :"+result.getName()+" has been started");
		

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case :"+ result.getName()+" has been Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case :"+ result.getName()+" has been failed");
		try {
			TakeScreenShot.TakeScreenShotOfApp(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case :"+ result.getName()+" has been skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName()+" has been started");
		

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+" has been completed");
	}
	
	
	
	
	
	

}
