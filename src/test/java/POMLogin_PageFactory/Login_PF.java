package POMLogin_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PF {
	WebDriver driver;
	@FindBy(name = "user_name")
	WebElement userName;

	@FindBy(name = "user_password")
	WebElement password;

	@FindBy(name = "Login")
	WebElement loginBtn;

	public Login_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String username) {
		userName.sendKeys(username);
	}

	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}

	public void LoginBtn() {
		loginBtn.click();
	}

}
