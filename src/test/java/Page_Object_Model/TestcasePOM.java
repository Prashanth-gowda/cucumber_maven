package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcasePOM {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   pageclass PObject = new pageclass(driver);
		   driver.get("http://demowebshop.tricentis.com/");
		   driver.manage().window().maximize();
		   PObject.clicklink();
		   String username = null;
		   PObject.typename(username);
		   String password = null;
		   PObject.typepassword(password);
		   PObject.clickonloginlyn();
		   PObject.logout();
		   System.out.println("the title of the page is: "+driver.getTitle());
		   
     }
}
