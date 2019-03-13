package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickingonDropdown_Facebook {

	public static void main(String[] args) {
	
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("9620680009");
		driver.findElement(By.cssSelector("#pass")).sendKeys("jaijagannath");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.findElement(By.cssSelector("#userNavigationLabel")).click();
		
		
		

	}

}
