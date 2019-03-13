package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	
public static void takescreenshot(WebDriver webdriver,String fileWithPath) throws IOException{
	TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile=new File(fileWithPath);
	 FileUtils.copyFile(SrcFile, DestFile);
	
}

}
