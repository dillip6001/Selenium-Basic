package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_Test {

	

	public static void main(String[] args) throws InterruptedException {
	
		
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		
		int total_frames=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total no of frames is:"+total_frames);
		
		driver.findElement(By.cssSelector("._3ac-")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".dontClosePopup")).click();
		
		Thread.sleep(3000);	
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("._3i6R")).click();
		
		//driver.findElement(By.xpath("//a[@title='Close']")).click();  This will also works fine.
		
		
		
	//code is working fine.
		
		
		
		
		

	}

}
