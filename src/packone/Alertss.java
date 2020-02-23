package packone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertss {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		// Click on Signin Button
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		// Switch focus to Alert and read data from alert
		/*System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		WebElement email=driver.findElement(By.id("email"));*/
		
		Thread.sleep(5000);
	    Alert a=driver.switchTo().alert();
	    System.out.println(a.getText());
	    a.dismiss();

	}

}
