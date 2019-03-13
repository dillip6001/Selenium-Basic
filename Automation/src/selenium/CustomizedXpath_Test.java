package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedXpath_Test {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@class='form-control inputText ui-autocomplete-input']")).sendKeys("Bangalore");
//		driver.navigate().to("https://www.freecrm.com/index.html");
		
		driver.findElement(By.xpath("//input[@class='form-control' and @placeholder='Username']")).sendKeys("Dillip");
		
		Thread.sleep(3000);
		
	    //driver.findElement(By.xpath("//a[contains(text(),'Features')]")).click();//working fine
		
	   // driver.findElement(By.xpath("//a[text()='Features']")).click(); This will also works fine.
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();//working fine.
	    
	    
	    
	    
	    
		
		
		

	}

}
