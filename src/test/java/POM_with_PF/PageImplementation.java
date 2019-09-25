package POM_with_PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageImplementation {
	
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 PageClass  pc = PageFactory.initElements(driver, PageClass.class);
		 pc.LoginMethod("prashanth.gowda@gmail.com","prash13586");
		 Thread.sleep(5000);
		 driver.close();
		 
	}
	

}
