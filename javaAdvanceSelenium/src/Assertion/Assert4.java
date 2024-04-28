package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.Assert;

public class Assert4 {
	//Asset true
@Test
public void testcase() {
ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	boolean radio =driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isSelected();
	Assert.assertTrue(radio);
	
}
}
