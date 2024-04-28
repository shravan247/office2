package practice;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class listenerBase implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Teststart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testsuccess");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testfail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testskip");

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Testtimoutfail");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onstart");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onfinish");

	}

}
