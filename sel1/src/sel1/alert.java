package sel1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://demoqa.com/alerts");
		WebElement element=dr.findElement(By.xpath("//button[@id='alertButton']"));
		element.click();
		try {
			Thread.sleep(1000);
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		Alert a=dr.switchTo().alert();
		String alert_msg =a.getText();
		System.out.println("Alert Message : "+ alert_msg);
		a.accept();

	}

	
}
