package practice;

import org.testng.annotations.Test;

public class dependsOnGroup {

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("smoke");
	}

	@Test(groups = "smoke")
	public void test2() {
		System.out.println(3/0);
	}

	@Test(groups = "sanity")
	public void test3() {
		System.out.println("sanity");
	}

	@Test(groups = "sanity")
	public void test4() {
		System.out.println("sanity");
	}

	@Test(groups = "regression")
	public void test5() {
		System.out.println("regression");
	}

	@Test(groups = "regression")
	public void test6() {
		System.out.println("regression");
	}
	
	/*
	 * @Test (dependsOnGroups = {"smoke", "sanity", "regression"}, alwaysRun = true)
	 * public void test0() { System.out.println("Main"); }
	 */

}
