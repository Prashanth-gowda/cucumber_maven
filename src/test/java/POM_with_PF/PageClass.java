package POM_with_PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageClass {
	WebDriver driver;
	@FindBy(how=How.LINK_TEXT,using = "Log in") WebElement login;
	@FindBy(how=How.ID,using = "Email") WebElement username;
	@FindBy(how=How.NAME, using="Password") WebElement password;
	@FindBy(how=How.XPATH, using = "//a[@href='/login']") WebElement log;
	@FindBy(how=How.XPATH, using = "//a[@href='/logout']") WebElement logout;
	
 public PageClass(WebDriver driver) {
	 this.driver=driver;
 }
 public void LoginMethod(String arg1,String arg2) {
	 login.click();
	 username.sendKeys(arg1);
	 password.sendKeys(arg2);
	 log.click();
	 logout.click();
 }
}
