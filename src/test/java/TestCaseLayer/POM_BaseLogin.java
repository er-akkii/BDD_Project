//package TestCaseLayer;
////package RunnerLayer;
////
////import java.time.Duration;
////
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import Pages.LoginPage;
////import io.cucumber.java.en.Given;
////import io.cucumber.java.en.Then;
////import io.cucumber.java.en.When;
////
////public class POM_BaseLogin {
////	WebDriver driver = null;
////	LoginPage loginObj;
////
////	@Given("user is on login page")
////	public void user_is_on_login_page() throws InterruptedException {
////
////		System.out.println("User is on login page");
////		System.setProperty("webDriver.chrome.driver",
////				"C:/Users/Admin//3D Objects/Practice File/NewBDDProject/src/test/resources/driver/chromedriver.exe");
////		driver = new ChromeDriver();
////		Thread.sleep(3000);
////		driver.get("http://localhost:8888/");
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
////		driver.manage().window().maximize();
////	}
////
////	@When("User enters vailid (.*) and (.*)")
////	public void user_enters_vailid_user_name_and_password(String userName, String password) {
////
////		System.out.println("User enterns valid user name and password");
////
////		loginObj = new LoginPage(driver);
////		loginObj.enterUserName(userName);
////		loginObj.enterUserName(password);
//////		driver.findElement(By.xpath("..........")).sendKeys(userName);
//////		driver.findElement(By.xpath("..........")).sendKeys(password);
////	}
////
////	@When("click on login button")
////	public void click_on_login_button() {
////
////		System.out.println("User click on login button");
////		loginObj.loginBtn();
////	}
////
////	@Then("user is nevigated on home page")
////	public void user_is_nevigated_on_home_page() {
////		System.out.println("User is on Home page");
////	}
////
////}
