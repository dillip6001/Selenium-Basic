package selenium;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebooklogin_logout {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("9620680009");
		driver.findElement(By.cssSelector("#pass")).sendKeys("jaijagannath");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		Thread.sleep(10000);
		
		driver.switchTo().alert().notifyAll();
			
		WebDriverWait wait=new WebDriverWait(driver,100);
		
		WebElement accountSettings=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account Settimgs")));
				
	    accountSettings.click();//this will click on setting link to open menu.
	    
	    WebElement logOut=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
	     logOut.click();// this will click on logout link.
	    
	    driver.close();
	    
	}
}
		
		
		




