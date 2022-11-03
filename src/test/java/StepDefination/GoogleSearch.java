package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	WebDriver driver=null;
	
	@Given("Browser is open")
	public void browser_is_open() {
System.out.println("Inside Setp-Browser is open");
System.setProperty("webdriver.chrome.driver","E:\\CucumberJava\\CucumerJava\\src\\test\\resources\\Drivers\\chromedriver.exe");
   driver=new ChromeDriver();
      driver.manage().window().maximize();

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
System.out.println("Inside Setp-user enters a text in search box");
driver.navigate().to("https://google.com");
driver.findElement(By.name("q")).sendKeys("Automation step by step");
Thread.sleep(2000);

	}

	@And("hits enter")
	public void hits_enter() {
	    System.out.println("Inside Step-hits enter");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    
	}

	@Then("user is navigate to search results")
	public void user_is_navigate_to_search_results() {
	    System.out.println("Inside Step-user is navigate to search results");
	    driver.getPageSource().contains("Online courses");
	    driver.close();
	}

}
