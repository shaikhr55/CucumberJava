package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		WebDriver driver=null;
	    System.out.println("Inside Step-user is on login page");
	    System.setProperty("webdriver.chrome.driver","E:\\CucumberJava\\CucumerJava\\src\\test\\resources\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://example.testproject.io/web/");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password(String username,String password) throws InterruptedException {
		System.out.println("Inside Step-user enter username and password");
		Thread.sleep(2000);
	}

	@When("cliks on login button")
	public void cliks_on_login_button() {
		System.out.println("Inside Step-cliks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   System.out.println("Inside Step-user is navigate to the home page");
	}
	
}
