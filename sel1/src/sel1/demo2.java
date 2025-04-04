package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		/*dr.findElement(By.className("ico-register")).click();
		dr.findElement(By.name("Gender")).click();
		dr.findElement(By.name("FirstName")).sendKeys("vv");
		dr.findElement(By.name("LastName")).sendKeys("m");
		dr.findElement(By.name("Email")).sendKeys("v3m@gmail.com"); 
		dr.findElement(By.name("Password")).sendKeys("123456");
		dr.findElement(By.name("ConfirmPassword")).sendKeys("123456");	
		dr.findElement(By.id("register-button")).click();
		dr.findElement(By.xpath("//span[@class='ico-register']")).getText();*/
		
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.name("Email")).sendKeys("v3m@gmail.com");
		dr.findElement(By.name("Password")).sendKeys("123456");
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		                                                                                                                                                                                                                               
		/*dr.findElement(By.id("pollanswers-3")).click();
		dr.findElement(By.xpath("//input[@class='button-2 vote-poll-button']")).click();*/
		
        dr.findElement(By.xpath("//div[@class='block block-category-navigation'] /div//a[@href='/books']")).click();
        
        WebElement w1=dr.findElement(By.name("products-orderby"));
        Select s1=new Select(w1);
        s1.selectByContainsVisibleText("Name: A");
        
	}

}
