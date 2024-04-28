package Selenium1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class program1 {

	@Test (priority = 2)
	public void login() {
		Reporter.log("pass",true);
	}
	@Test (priority = 1)
	public void register() {
		Reporter.log("pass-1",true);
	}
	@Test (priority = 3)
	public void logout() {
		Reporter.log("pass-2",true);
}
}
