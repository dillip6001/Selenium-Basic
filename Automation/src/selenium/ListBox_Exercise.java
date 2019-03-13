package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Exercise {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
        WebDriver driver=new HtmlUnitDriver();
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.manage().timeouts().pageLoadTimeout(80,TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("manzoor");
		driver.findElement(By.name("password")).sendKeys("manzoor");
		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
        List <WebElement> elementCount = dropDown.getOptions();
        int itemSize = elementCount.size();
        System.out.println(itemSize);
		 
		
		
		
		
	}

}
