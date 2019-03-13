package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_Test {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		Actions action=new Actions(driver);
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement element=driver.findElement(By.id("draggable"));
		WebElement element1=driver.findElement(By.id("droppable"));
		
		
		action.contextClick(element);// right click
		
		Thread.sleep(5000);
		
		action.dragAndDrop(element,element1).perform();
		
		// action.clickAndHold(element).moveToElement(element1).build().perform(); //another way of doing working fine.
		
		Thread.sleep(5000);
		
		//String currentWindow = driver.getWindowHandle();
		
		//driver.switchTo().window(currentWindow);
		
		//WebElement Element2= driver.findElement(By.xpath("/html/body/div[1]/nav/div/ul/li[4]/a"));
		
		//action.doubleClick(Element2);
		
		driver.get("https://jqueryui.com/resizable/");
		
		Thread.sleep(5000);
		
		WebElement ReSize=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		
		Thread.sleep(3000);
		
		action.clickAndHold(ReSize).moveByOffset(100,50).build().perform();
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		

	}

}
