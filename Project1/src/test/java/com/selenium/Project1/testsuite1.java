
package com.selenium.Project1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class testsuite1 {
 
	@Test
	public void test1()
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		
		LocalDateTime loc = LocalDateTime.now();
		DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS");
		String format = loc.format(form);
		System.out.println("In test1 - After Formatting: "+format);
	}
}
 
