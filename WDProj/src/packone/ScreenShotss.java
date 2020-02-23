package packone;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ScreenShotss {

	public static void main(String[] args) throws Exception{
		
		/*MethodsPO m=new MethodsPO();
		m.launchApp("http://facebook.com", "C:\\Users\\DELL\\Desktop\\WD10Jan\\fbook.png");
		m.launchApp("http://yahoomail.com", "C:\\Users\\DELL\\Desktop\\WD10Jan\\yahoo.png");*/
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("month")).sendKeys("Apr");
		
		/*List<WebElement> values=driver.findElements(By.xpath("//select[@id='month']/descendant::*"));
		System.out.println(values.size());
		
		WebElement monthh=driver.findElement(By.id("month"));
		List<WebElement> v=monthh.findElements(By.tagName("option"));
		System.out.println(v.size());
		
		Select m=new Select(monthh);
		m.selectByIndex(5);*/
		
		
		driver.findElement(By.xpath("//select[@id='month']/descendant::*[5]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
