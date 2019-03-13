package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHTMLUnitDriver_Test {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		//WebDriver driver=new FirefoxDriver();

		WebDriver driver=new HtmlUnitDriver();
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		
		System.out.println("The title of page is :"+driver.getTitle());
		

	}

}

// code is working fine 

//Html unit driver is not available from 3.x onwards , you need to download & add the JAR file.
// the download site is https://github.com/SeleniumHQ/htmlunit-driver/releases
