package sel1;

import org.testng.annotations.Test;
import org.testng.annotations.Factory;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testng3 {
	WebDriver dr;
     private String browser;
	public testng3(String browser) {
		this.browser=browser;
	}
	
  @Test
  public void test() {
	  switch(browser) {
	  case "Chrome":
		  System.out.println("Running the browser : "+browser);
		  dr=new ChromeDriver();
		   break;
	  case "Edge":
		  System.out.println("Running the browser : "+browser);
		  dr=new EdgeDriver();
		  dr.get("https://www.saucedemo.com/");
			
		  break;
	  case "Firefox":
		  System.out.println("Running the browser : "+browser);
		  dr=new FirefoxDriver();
		  dr.get("https://www.saucedemo.com/");
			
		  break;
	  }
  }
  
  @Factory
	public static Object[] factoryMethod() {
		Object []bew= {
				new testng3("Chrome"),
				new testng3("Edge"),
				new testng3("Firefox")
		};
		return bew;
  
  }
  
  @AfterMethod
  public void afterMethod() {
	  dr.get("https://www.saucedemo.com/");
	  dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
  }

  

}
