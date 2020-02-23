package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	public WebDriver driver;
	
	public void launchApp(String url){
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();		}
	public void closeApp(){
		driver.close();	}
	
	
	public void elementAvailable(String loc, boolean exp){
		boolean element=driver.findElement(By.id(loc)).isDisplayed();
		if(element==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");	}
	
	

	public void elementsCount(String loc, int expnumber){
		List<WebElement> elements=driver.findElements(By.tagName(loc));
		if(elements.size()==expnumber)
			System.out.println("Pass " + " Expected Elements are " + expnumber + "-" + " Actual are " + elements.size());
		else
			System.out.println("Fail " + " Expected Elements are " + expnumber + "-" + " Actual are " + elements.size());
	}
	
}
