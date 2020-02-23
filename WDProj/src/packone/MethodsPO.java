package packone;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsPO {
	public WebDriver driver;
	public void launchApp(String url, String sspath) throws Exception{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(sspath));
		
	}
	
	public void elementPresent(WebElement element){
		boolean a=element.isDisplayed();
		if(a==true)
			System.out.println("Pass");		
		else
			System.out.println("Fail");
	}
	
	public void elementEnabled(WebElement element){
		boolean b=element.isEnabled();
		if(b==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
