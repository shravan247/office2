package practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class pomListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("OnTeststart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("OnTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("OnTestFail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("OnTestSkip");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Onstart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("OnFinish");

	}

}
