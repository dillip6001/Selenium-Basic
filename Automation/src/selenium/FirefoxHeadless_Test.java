package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadless_Test {

	public static void main(String[] args) {
		
		FirefoxBinary fb=new FirefoxBinary();
		
		fb.addCommandLineOptions("--headless");
		
		System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		FirefoxOptions fo=new FirefoxOptions();
		
		fo.setBinary(fb);
		
		WebDriver driver=new FirefoxDriver(fo);
		
		driver.get("https://paytm.com/");
		
		 String title=driver.getTitle();
		 
		 System.out.println("The title of paytm website is  :"+title);
		
		
	}

}
