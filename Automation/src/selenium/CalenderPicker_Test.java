package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderPicker_Test {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		
		Thread.sleep(3000);
		
		WebElement date=driver.findElement(By.id("txtJourneyDate"));
		 
		String dateval="31/01/2019";
		
		DP(driver,date,dateval );
		
	}
	
	public static void DP(WebDriver driver, WebElement element,String dateval ){
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
		
		
	}
	
	
	
	

}
