package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//driver.navigate().refresh();
		
		// Create Webelement for Companies
		//WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		
		// Import Actions Class
		Actions Actions_Obj=new Actions(driver);
		
		WebElement email=driver.findElement(By.id("email"));
		
		Actions_Obj.contextClick(email).build().perform();
		
		int i;
		for(i=1; i<9; i++){
		Actions_Obj.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		//System.out.println(a);
		}
		Actions_Obj.sendKeys(Keys.ENTER).build().perform();
		
		Actions_Obj.dragAndDrop(email, email).build().perform();
		
		Actions_Obj.clickAndHold(email).build().perform();
		Thread.sleep(3000);
		Actions_Obj.release().build().perform();
		/*WebElement login=driver.findElement(By.id("login"));
		Actions_Obj.doubleClick(login).build().perform();
		*/
		
		
		/*Actions_Obj.sendKeys(Keys.F5).build().perform();
		Actions_Obj.sendKeys(Keys.CONTROL+"t").build().perform();*/
		
		
		/*// Move cursor to companies
		Actions_Obj.moveToElement(companies).build().perform();
		
		// Click on About Companies link
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a")).click();*/

	}

}
