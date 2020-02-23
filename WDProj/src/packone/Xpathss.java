package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathss {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("html/body/div[2]/div[1]/div[2]/a[1]")).click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement> links1=driver.findElements(By.xpath("//a"));
		System.out.println(links1.size());
		
		List<WebElement> values=driver.findElements(By.xpath("//select[@id='day']/descendant::*"));
		System.out.println(values.size());

	}

}
