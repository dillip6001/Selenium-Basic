package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWaits_Test {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// Implicitly wait- is always applied globally & available for all elements.
		//1. dynamic in nature
		//2.it can be changed anywhere & any time in the code.
		//3. we should never use implicit wait & explicit wait together
		//  --- selenium WD will wait for the element first beacuse of IMPLICIT WAIT & then EXPLICIT WAIT
		//   will be applied , hence tool sync wait will be increased for each element.
		
		driver.get("https://www.facebook.com/");
		
		WebElement Firstname=driver.findElement(By.name("firstname"));
		WebElement  Lastname=driver.findElement(By.name("lastname"));
		WebElement  MobileNum=driver.findElement(By.name("reg_email__"));
		WebElement  password=driver.findElement(By.name("reg_passwd__"));
		
	    sendKeys(driver,Firstname,10,"Dillip");
	    sendKeys(driver,Lastname,10,"Behera");
	    sendKeys(driver,MobileNum,10,"9872345671");
	    sendKeys(driver,password,10,"test123");
	    
	    WebElement forgotaccount=driver.findElement(By.linkText("Forgotten account?"));
	    
	    ClickOn(driver,forgotaccount,5);
		
	}
	
	//Explicit wait
	  //1.no explicit keyword or method
	  //2.available with webDriverWait with some expected condition.
	  //3.specific to element.
	  //4.dynamic in nature -means if the element found within the time period the rest time value will be ignored.
	
	public static void sendKeys(WebDriver driver, WebElement element , int timeout, String value){
		
		new WebDriverWait (driver,timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
public static void  ClickOn(WebDriver driver, WebElement element , int timeout){
		
		new WebDriverWait (driver,timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	
	

}
