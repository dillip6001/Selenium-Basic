package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Handler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopUP_Test {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","C://geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.cssSelector(".black")).click();
		 Set<String> handle=driver.getWindowHandles();
		 
		     Iterator <String> it =handle.iterator();
		     
		     String parentwindowid=it.next();
		     
		     System.out.println("parent window id: "+parentwindowid);
		     
		     String childwindowid=it.next();
		     
		     System.out.println("child window id:"+childwindowid);
		     
             driver.switchTo().window(childwindowid);
             System.out.println("child window pop up title:"+driver.getTitle());
             
	}

}

// need to re check again Naveen automation lab