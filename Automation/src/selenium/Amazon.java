package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("men shoes");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.className("a-spacing-top-mini")).click();
		
		Select dropdown = new Select(driver.findElement(By.className("a-spacing-top-mini")));
		dropdown.selectByVisibleText("Price: Low to High");
		Thread.sleep(10000);
		java.util.List<WebElement> checkbox = driver.findElements(By.name("s-ref-checkbox-10440599031"));
        ((WebElement) checkbox.get(0)).click();
        ((JavascriptExecutor) driver).executeScript("scroll(0,900);");
        Thread.sleep(10000);
        java.util.List<WebElement> checkbox2 = driver.findElements(By.name("s-ref-checkbox-Kraasa"));
        ((WebElement) checkbox2.get(0)).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a.nav-a:nth-child(5)")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a.nav-sprite")).click();
        driver.findElement(By.cssSelector("#nav-link-wishlist > span:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#nav-flyout-wishlist > div:nth-child(2) > a:nth-child(1) > span:nth-child(1)")).click();
        Thread.sleep(5000);     
        driver.quit();
     
  
	}

	}


