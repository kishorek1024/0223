package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WD10Jan\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Kishore");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Kumar");
		driver.findElement(By.id("email")).clear();
		
		String a="Kishore";
		int b=a.length();
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Kishore");
		email.clear();
		email.sendKeys("hjdsklfvs");
		
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("djvkdlfv");
		pwd.clear();
	}

}
