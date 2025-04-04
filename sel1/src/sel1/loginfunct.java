package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfunct {
	static WebDriver dr=new ChromeDriver();
	public void valid() {
		dr.get("https://www.saucedemo.com/");
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		String s=dr.findElement(By.xpath("//span[@class='title']")).getText();
		if(s.equals("Products")) {
			System.out.println("Valid Login Credentials : Test Case - Pass");
		}
		else {
			System.out.println("Valid Login Credentials : Test Case - Fail");
		}
		if(s.equals("Product")) {
			System.out.println("Valid Login Credentials : Test Case - Pass");
		}
		else {
			System.out.println("Valid Login Credentials : Test Case - Fail");
		}
		
	}
	public void invalid() {
		dr.get("https://www.saucedemo.com/");
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secretsauce");
		dr.findElement(By.id("login-button")).click();
		String s=dr.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
		if(s.contains("Epic")) {
			System.out.println("InValid Login Credentials : Test Case - Pass");
		}
		else {
			System.out.println("InValid Login Credentials : Test Case - Fail");
		}
		if(s.equals("Pro")) {
			System.out.println("InValid Login Credentials : Test Case - Pass");
		}
		else {
			System.out.println("InValid Login Credentials : Test Case - Fail");
		}
	}
	public static void main(String[] args) {
	
		
		loginfunct ll=new loginfunct();
		ll.valid();
		ll.invalid();
		}

}
