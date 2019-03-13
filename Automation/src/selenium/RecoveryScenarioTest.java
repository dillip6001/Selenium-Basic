package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RecoveryScenarioTest {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		
		try {
	        driver.get ("https://ksrtc8.in/oprs-web/");
	}  catch (Exception e) {
	System.out.println(e.getMessage());
	}


	}

}
