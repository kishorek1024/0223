package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BO {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WD10Jan\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Kishore");
		driver.findElement(By.id("pass")).sendKeys("abcdefgh");
		driver.findElement(By.id("day")).sendKeys("24");
		driver.findElement(By.id("month")).sendKeys("Apr");
		System.out.println(driver.getTitle());

	}

}
