package packone;

import java.io.FileOutputStream;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framess {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		List<WebElement> frames=driver.findElements(By.tagName("frame"));
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\DELL\\Desktop\\WD10Jan\\111.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("Result", 0);
		
		int i; int j;
		
		for(i=0; i<frames.size(); i++){
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			for(j=0; j<links.size(); j++){
				Label l=new Label(0,j,links.get(j).getText());
				ws.addCell(l);
			}
			driver.switchTo().parentFrame();
			System.out.println("-------------------------------------------");
		}
		
		wwb.write();wwb.close();
		
		/*
		// Create Webelement for Frame
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		
		// Switch focus to frame and click on  Link
		driver.switchTo().frame(f1).findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
		
		driver.switchTo().parentFrame();
		// Create Webelement for Frame2
		WebElement f2=driver.findElement(By.name("packageFrame"));
		
		driver.switchTo().frame(f2).findElement(By.xpath("/html/body/div/ul[1]/li[2]/a/i")).click();*/
		
		
		//driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();

	}

}
