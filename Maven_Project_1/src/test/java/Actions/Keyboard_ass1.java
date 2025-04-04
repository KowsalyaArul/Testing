package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		WebElement w1=dr.findElement(By.xpath("//*[@id=\"user-name\"]"));
		dr.manage().window().maximize();
		Actions act=new Actions(dr);
		act
			.keyDown(Keys.SHIFT)
			.sendKeys(w1,"KOW")
			.keyUp(Keys.SHIFT)
			.sendKeys("si")
				.perform();
			

	}

	

	}


