package sel1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");

		String buttonXpath = "//div[@id='content']/div[1]/form[2]/button";
		Wait<WebDriver> wt = new FluentWait<WebDriver>(dr)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(5))
		        .ignoring(NoSuchElementException.class);

		WebElement button = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXpath)));
		button.click();
		
		
		String textBoxXpath = "//div[@id='content']/div[1]/form[2]/input";
		WebElement textBox = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(textBoxXpath)));
		textBox.sendKeys("Selenium");


	}

}
