package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YahooLogin {
	WebDriver driver=null;
	@Given("user is on main page")
	public void user_is_on_main_page() {
		System.out.println("Inside Step-user is on main page");
		System.setProperty("webdriver.chrome.driver","E:\\CucumberJava\\CucumerJava\\src\\test\\resources\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://in.search.yahoo.com/?fr2=inr");
	}

	@When("user click on login")
	public void user_click_on_login() {
		driver.findElement(By.xpath("//*[@class='text'][1]")).click();
	}

	@And("user click on create an account")
	public void user_click_on_create_an_account() throws InterruptedException {
		System.out.println("Inside Step-user click on create an account");
		driver.findElement(By.xpath("//*[@id='createacc']")).click();
		Thread.sleep(2000);
	}

	@And("enter details")
	public void enter_details() {
		System.out.println("Inside Step-enter details");
		driver.findElement(By.xpath("//*[@type='text'][1]")).click();
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Riyaj");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Shaikh");
		driver.findElement(By.xpath("//*[@name='userId']")).sendKeys("riyaj92");
		driver.findElement(By.xpath("//*[@id='usernamereg-password']")).sendKeys("Admin@9y9yh");
		driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("1990");
		driver.findElement(By.xpath("//*[@type='submit'][1]")).click();
	}

	@Then("account successfully created")
	public void account_successfully_created() {
		
		System.out.println("Inside Step-account successfully created");
		driver.findElement(By.xpath("//*[@type='submit'][1]")).click();
	}

}
