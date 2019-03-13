package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UntrustedCertificate_Test {

	
	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cacert.org/");
		
	DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		driver.findElement(By.cssSelector("div.relatedLinks:nth-child(1) > a:nth-child(2)")).click();
		
		
	

	}

}

//very good example working fine.
