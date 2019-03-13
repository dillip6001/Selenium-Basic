package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import utility.BaseClass;



public class Screenshot_Handle extends BaseClass {
	
	   static WebDriver driver;

	public static void main(String[] args) throws IOException  {
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		
		Screenshot_Handle.takescreenshot(driver, "C:\\Users\\DILLIPBEHERA\\Desktop\\SS\\TC_01.jpg");
		driver.quit();
	}
	
	


}
