package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://jqueryui.com/");
		//dr.findElement(By.xpath("//div[@id='sidebar']//aside[@class='widget']//ul//li//a[@href='https://jqueryui.com/checkboxradio/']")).click();
		dr.findElement(By.xpath("//*[text()='Checkboxradio']")).click();
		
		
		
		WebElement w1=dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dr.switchTo().frame(w1);
		dr.findElement(By.xpath("//div[@class='widget']/fieldset[1]/label[@for='radio-1']/span[1]")).click();
		
		

	}

}
