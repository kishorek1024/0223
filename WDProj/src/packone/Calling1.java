package packone;

import org.openqa.selenium.support.PageFactory;

public class Calling1 {

	public static void main(String[] args) {
		
		MethodsPO m=new MethodsPO();
		
		
		PO1 p=PageFactory.initElements(m.driver, PO1.class);
		m.elementPresent(p.uid);
		m.elementEnabled(p.pwd);
		
		

	}

}
