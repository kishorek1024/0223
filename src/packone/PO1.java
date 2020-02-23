package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO1 {
	
	// First Way
	/*By uid=By.id("email");
	By pwd=By.id("pass");*/
	
	@FindBy(id="email") WebElement uid;
	@FindBy(id="pass") WebElement pwd;
	@FindBy(xpath="//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a") WebElement fp;
	

}
