package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CallPO {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		PO1 p=PageFactory.initElements(driver, PO1.class);
		p.uid.sendKeys("fghjkl");
		
		
		/*PO1 p=new PO1();
		driver.findElement(p.uid).sendKeys("ghjlk");
		driver.findElement(p.pwd).sendKeys("sdfghj");*/
		
		

	}

}
