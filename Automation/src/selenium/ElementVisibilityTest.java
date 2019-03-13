package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		
		//1.isDisplayed() method:applicable for all elements
		boolean b1=driver.findElement(By.cssSelector(".logo_img")).isDisplayed();
		System.out.println(b1);
		
		//2.isEnabled() method
		driver.findElement(By.cssSelector("a.carousel-control-next:nth-child(3) > span:nth-child(1)")).click();
		boolean b2=driver.findElement(By.cssSelector("#mainSlider > div:nth-child(1) > div:nth-child(2) > img:nth-child(1)")).isEnabled();
		System.out.println(b2);
		boolean b3=driver.findElement(By.cssSelector(".main-frs > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1) > img:nth-child(1)")).isEnabled();
		System.out.println(b3);
		
		//isSelected() method : only applicable for check box,radio button, drop down

	}

}
