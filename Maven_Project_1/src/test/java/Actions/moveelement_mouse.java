package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveelement_mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.myntra.com/");
		dr.manage().window().maximize();
		
		WebElement w1=dr.findElement(By.xpath("//div[@class='desktop-userIconsContainer']"));
		Actions act=new Actions(dr);
		act.moveToElement(w1).perform();

	}

}
