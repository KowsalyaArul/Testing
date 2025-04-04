package sel1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");
		WebDriverWait wt=new WebDriverWait(dr,Duration.ofMillis(2000));
		WebElement ele=wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']/div[1]/form[1]/button")));
		ele.click();	
		
		
		WebDriverWait wt1=new WebDriverWait(dr,Duration.ofMillis(4000));
		WebElement ele1=wt1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']/div[1]/form[1]/button")));
		ele1.click();
		
		
		WebDriverWait wt2=new WebDriverWait(dr,Duration.ofMillis(4000));
		WebElement ele2 = wt2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
		/*boolean isVisible = ele2.isDisplayed();
		System.out.println("Checkbox is visible: " + isVisible);*/
		ele2.click();
		//dr.quit();
		

	}

}
