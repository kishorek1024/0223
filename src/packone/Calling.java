package packone;

import org.openqa.selenium.By;

public class Calling {

	public static void main(String[] args) {
		
		Methods m=new Methods();
		m.launchApp("http://facebook.com");
		m.driver.findElement(By.id("email")).sendKeys("Kishore");
		
		
		/*m.elementAvailable("email", true);
		m.elementAvailable("pass", false);
		m.elementAvailable("day", true);
		m.elementAvailable("month", false);
		m.elementsCount("a", 50);
		m.elementsCount("img", 5);
		m.elementsCount("select", 3);
		m.closeApp();
		m.launchApp("http://yahoomail.com");
		m.elementsCount("img", 5);*/
		m.closeApp();
		

	}

}
