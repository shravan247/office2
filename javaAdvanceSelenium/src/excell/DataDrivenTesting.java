package excell;
//this is user when we have n no of value to execute in login
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

	@DataProvider (name="exceldata")
	//create object type 2D data
	public Object[][] data() {
		
		Object[][] d=new Object[2][2];
		//store the value for 2*2 object type data
		d[0][0]="username1";
		d[0][1]="password1";
		d[1][0]="username2";
		d[1][1]="password2";
		//return the data
		return d;

	}
	@Test (dataProvider = "exceldata")
	//diff class fetch the dat from prev class by declaring 2 string variable
	public void m1(String user, String passw) {
		System.out.println(user);
		System.out.println(passw);
	}
}
