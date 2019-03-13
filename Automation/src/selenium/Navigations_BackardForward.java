package selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations_BackardForward {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	 	driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();
		
	

	}

}

//code is working fine.
