package sel1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_sel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		dr.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		
		dr.close();
		dr.quit();

	}

}
