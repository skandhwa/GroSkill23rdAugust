package StepDefinition5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition5 {

	System.out.println("Hello");
	
	@Before("@test1")
	public void onlyBeforeTest1()
	{
		System.out.println("I will execute before test1");
	}
	
	@After("@test1")
	public void onlyAfterTest1()
	{
		System.out.println("I will execute after test1");
	}
	
	
	
	
	@Before
	public void setUp()
	{
		System.out.println("My set up code");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Tear Down code");
	}
	
	
	
	@Given("User logins to the facebook application")
	public void user_logins_to_the_facebook_application() {
	    
	}

	@Given("user enters the {string} in the username field")
	public void user_enters_the_in_the_username_field(String string) {
	   
	}

	@Given("user enters the {string} in the password field")
	public void user_enters_the_in_the_password_field(String string) {
	   
	}

	@When("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
	   
	}

	@Then("user will be navigated to homepage of application")
	public void user_will_be_navigated_to_homepage_of_application() {
	   
	}

	@Given("user enters the username in the username field")
	public void user_enters_the_username_in_the_username_field() {
	    
	}

	@Given("user enters the password in the password field")
	public void user_enters_the_password_in_the_password_field() {
	    
	}

	@When("user will get an error on the login page of application")
	public void user_will_get_an_error_on_the_login_page_of_application() {
	  
	}
	
	@Then("user will validate the page title")
	public void user_will_validate_the_page_title() {
	    
	}

	@Then("User will click on Friend icon")
	public void user_will_click_on_friend_icon() {
	    
	}

	@Then("user will validate that he landed on the correct page")
	public void user_will_validate_that_he_landed_on_the_correct_page() {
	   
	}
	
	
	
	@Given("user opens the demo site of the application")
	public void user_opens_the_demo_site_of_the_application() {
	   
		System.out.println("Webpage opened");
		
		
	}

	@Given("user enters the below details")
	public void user_enters_the_below_details(io.cucumber.datatable.DataTable userCredentials) throws InterruptedException {
	    
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<List<String>> data=userCredentials.asLists(String.class);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(data.get(1).get(0));
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(data.get(1).get(1));
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys(data.get(1).get(2));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data.get(1).get(3));
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(data.get(1).get(4));
		
	}
	
	@Then("user is going to raise defects")
	public void user_is_going_to_raise_defects() {
	   
	}
	
	
	

	
	

}
