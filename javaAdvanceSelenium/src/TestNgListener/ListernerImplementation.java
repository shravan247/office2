package TestNgListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListernerImplementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("test execution failed", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("test case started", true);

	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("test case finish", true);

	}

}
