package stepdefinitions;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
import pagepkg.pageclass;

	public class runclass {
		WebDriver driver;
		pageclass ob;
		
		@Before
		public void open() {
			driver=new ChromeDriver();
			ob=new pageclass(driver);
		}
		
	@Given("the user is on login page")
	public void the_user_is_on_login_page() {
	    driver.get("https://www.facebook.com/");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	   ob.set_values("123@gmail.com","12345");
	}

	@And("click login button")
	public void click_login_button() {
		ob.login();
	}

	@Then("the user should be directed to home page")
	public void the_user_should_be_directed_to_home_page() {
	    Assert.assertEquals(driver.getCurrentUrl(),"https://facebook.com","verified");
	}
}
