package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertandPopUP_1 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.cssSelector("button.btn")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();

		

	}

}

//code is working fine 

