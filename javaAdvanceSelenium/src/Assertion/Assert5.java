
package Assertion;

import org.testng.annotations.Test;

import graphql.Assert;

public class Assert5 {
	//assertnull
	@Test
	public void testcase() {
		//ChromeDriver driver=null;
		Assert.assertNull(10);
	}
}
