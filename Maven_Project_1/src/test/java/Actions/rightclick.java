package Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://practice.expandtesting.com/context-menu");
		dr.manage().window().maximize();
		WebElement w1=dr.findElement(By.xpath("//*[@id='hot-spot']"));
		Actions act=new Actions(dr);
		act.contextClick(w1).perform();
		Alert alert = dr.switchTo().alert();
		String msg = alert.getText();
		System.out.println("Alert Message: "+msg);
		alert.accept();
	}

}
