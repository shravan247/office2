package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterrPage {
	//step2:constructor
		public RegisterrPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
@FindBy(id="gender-male")
private WebElement gender;
@FindBy(id="FirstName")
private WebElement firstname;
@FindBy(id="LastName")
private WebElement lastname;
@FindBy(id="Email")
private WebElement email;
@FindBy(id="Password")
private WebElement password;
@FindBy(id="ConfirmPassword")
private WebElement confirmpassword;
@FindBy(id="register-button")
private WebElement reegisterbutton;
public WebElement getGender() {
	return gender;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getConfirmpassword() {
	return confirmpassword;
}
public WebElement getReegisterbutton() {
	return reegisterbutton;
}
}
