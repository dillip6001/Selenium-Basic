package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethods_Test {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		
		String st=driver.findElement(By.cssSelector("button.btn")).getTagName();
		System.out.println(st);
		
		Dimension Dm=driver.findElement(By.cssSelector("button.btn")).getSize();
		
		System.out.println(Dm);
		
		String st2=driver.findElement(By.cssSelector("button.btn")).getText();
		System.out.println(st2);
		
		org.openqa.selenium.Point pn=driver.findElement(By.cssSelector("button.btn")).getLocation();
		System.out.println(pn);
		
		
		String st4=driver.findElement(By.cssSelector("button.btn")).getCssValue("font-size");
		System.out.println(st4);
		
		driver.findElement(By.linkText("Careers")).click();
		
		

	}

}
