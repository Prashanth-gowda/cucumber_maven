package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameter {
	WebDriver driver = null;
	@Given("^login page is opened$")
	public void login_page_is_opened(){
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("^Enters \"([^\"]*)\"and passwords \"([^\"]*)\"$")
	public void enters_and_passwords(String arg1, String arg2) {
	  driver.findElement(By.id("userName")).sendKeys(arg1);
	  driver.findElement(By.id("password")).sendKeys(arg2);
	}

	@When("^Click button$")
	public void click_button() {
		 driver.findElement(By.name("Login")).click();
	}

	@Then("^uwill Finds testmeapp homepage$")
	public void uwill_Finds_testmeapp_homepage(){
		   System.out.println("title of the page is: "+driver.getTitle());
	    	}
}
