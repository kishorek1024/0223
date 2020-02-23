package gridd;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_Sample {

	public static void main(String[] args) throws Exception{
		
		
		URL u=new URL("http://localhost:5555/wd/hub");
		
		DesiredCapabilities s=new DesiredCapabilities().firefox();
		
		RemoteWebDriver r=new RemoteWebDriver(u, s);
		
		WebDriver driver=r;
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		
		//RemoteWebDriver rr=new RemoteWebDriver(new URL(""), new DesiredCapabilities().firefox());
		

	}

}
