package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageclass {
    WebDriver driver;
    By Inc=By.linkText("Log in");
    By uname = By.name("Email");
    By pwd = By.name("Password");
    By lin = By.xpath("//input[@value='Log in']");
    By lout = By.xpath("//a[@href='/logout']");
    public pageclass(WebDriver driver) {
    	this.driver= driver;
    }
   public void clicklink() {
	   driver.findElement(Inc).click();
   }
   public void typename(String username) {
	   driver.findElement(uname).sendKeys("prashanth.gowda@gmail.com");
   }
   public void typepassword(String password) {
	   driver.findElement(pwd).sendKeys("prash13586");
   }
   public void clickonloginlyn() {
	   driver.findElement(lin).click();
   }
   public void logout() {
	   driver.findElement(lout).click();
   }
}
