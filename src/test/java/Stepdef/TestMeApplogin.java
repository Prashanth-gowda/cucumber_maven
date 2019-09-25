package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMeApplogin {
	WebDriver driver = null;
	@Given("^The login page is opened$")
	public void the_login_page_is_opened() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^user enters Lalitha as username$")
	public void user_enters_Lalitha_as_username()  {
	    driver.findElement(By.name("userName")).sendKeys("Lalitha");
	}

	@When("^user enters password  as Password(\\d+)$")
	public void user_enters_password_as_Password(int arg1) {
	  driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@Then("^user will Finds a testmeapp homepage$")
	public void user_will_Finds_a_testmeapp_homepage() {
	   driver.findElement(By.name("Login")).click();
	   System.out.println("title of the page is: "+driver.getTitle());
	}
}
