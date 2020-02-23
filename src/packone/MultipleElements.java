package packone;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleElements {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int i;		
		for(i=0; i<links.size(); i++){
			//System.out.println(links.get(i).getText() + "-" + links.get(i).getAttribute("href"));
			String value=links.get(i).getText();
			if(value.startsWith("P")==true)
				System.out.println(value);
		}
		
   		FluentWait<WebDriver> f=new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);
   		
		
		//FileInputStream
		
		
		
		
		
		
		
		
		
		
		/*System.out.println(links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());*/
		
		
		
		

	}

}
