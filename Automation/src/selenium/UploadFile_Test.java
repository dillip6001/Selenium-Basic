package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile_Test {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.cssSelector("span.uprcse")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\DILLIPBEHERA\\Desktop\\PAs - Copy.docx");
		

	}

}

//code is working fine.