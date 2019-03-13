package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_test {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("men shoes");
		driver.findElement(By.className("nav-input")).click();
		
	     Select dropdown = new Select(driver.findElement(By.className("a-spacing-top-mini")));
	    
	    dropdown.selectByVisibleText("Price: Low to High"); 
		
		/* Select dropdown1 = new Select(driver.findElement(By.id("sort")));
		
		   dropdown1.selectByIndex(4); 
	    
	     Select dropdown2= new Select(driver.findElement(By.id("sort")));
		
		 dropdown2.selectByValue("review-rank"); code will work for above 2 other options */
	    
	    
		
		
		

	}

}
