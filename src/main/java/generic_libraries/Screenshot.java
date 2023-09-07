package generic_libraries;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public void getPhoto(WebDriver driver,String name) throws Throwable
	{
		Date d = new Date();
		String currentdate = d.toString().replaceAll(":", "-");
		
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(IPathConstant.photoPath+name+currentdate+".png" );
			FileUtils.copyFile(src, des);
	}
	
}
