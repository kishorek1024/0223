package gridd;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_BS {

	public static void main(String[] args) throws Exception{
		
		URL u=new URL("https://anusha173:8hpzZQzEVuWj4RVtJmy5@hub-cloud.browserstack.com/wd/hub");
		
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability("os", "WINDOWS");
		d.setCapability("os_version", "7");
		d.setCapability("browser", "Firefox");
		d.setCapability("browser_version", "50");
		d.setCapability("browserstack.debug", true);
		
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		
		WebDriver driver=r;
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("Kishore");
		driver.quit();
		

	}

}
