package POMLogin_PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RunnerOf_PF {

	WebDriver driver = null;
	Login_PF loginObj; 

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {

		System.out.println("User is on login page");
		System.setProperty("webDriver.chrome.driver",
				"C:/Users/Admin/3D Objects/Practice File/NewBDDProject/src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		System.out.println("user entering name");
	}

	@When("^User enters vailid (.*) and (.*)$")
	public void user_enters_vailid_user_name_and_password(String userName, String password) {

		System.out.println("User enterns valid user name and password");
		loginObj = new Login_PF(driver);

		loginObj.enterUserName(userName);
		loginObj.enterPassword(password);
//		driver.findElement(By.xpath("..........")).sendKeys(userName);
//		driver.findElement(By.xpath("..........")).sendKeys(password);
	}

	@And("click on login button")
	public void click_on_login_button() {

		System.out.println("User click on login button");
		loginObj = new Login_PF(driver);
		loginObj.LoginBtn();
	}

	@Then("user is nevigated on home page")
	public void user_is_nevigated_on_home_page() {
		System.out.println("User is on Home page");

		driver.close();
	}

}
