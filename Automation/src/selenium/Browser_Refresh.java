package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Refresh {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		Thread.sleep(3000);
	    driver.navigate().refresh();
		// 1. There are also other methods available.
	    //a)Driver.getCurrentURL();
	    //b)Using  sendKeys (Keys.F5) on any text page on the webpage.
	           
	         
	    

	}

}
