package TestCaseLayer;
//package StepDefinition;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class GoogleSearch {
//	WebDriver driver = null;
//
//	@Given("Browser is open")
//	public void browser_is_open() throws InterruptedException {
//		System.out.println("Browser is open");
//		System.setProperty("webDriver.chrome.driver",
//				"C:/Users/Admin//3D Objects/Practice File/NewBDDProject/src/test/resources/driver/chromedriver.exe");
//		driver = new ChromeDriver();
//		Thread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on gooogle search page")
//	public void user_is_on_gooogle_search_page() {
//		System.out.println("user is on Google search page");
//	}
//
//	@When("User is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("User enter text in search box");
//	}
//
//	@And("hit enter")
//	public void hit_enter() {
//		System.out.println("User hit on enter button");
//	}
//
//	@Then("user is nevigated to searched result")
//	public void user_is_nevigated_to_searched_result() {
//		System.out.println("User is nevigated oon result page");
//	}
//
//}
