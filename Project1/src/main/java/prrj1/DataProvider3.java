package prrj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider3 {
	WebDriver dr=new ChromeDriver();
	static int num=1;
	
	String xp_p1="//div[@class='inventory_list']/div[",
			xp_p3="]/div[2]//a/div";
	String full_xp;
	@DataProvider(name="testData")
	public  Object[] getdata() {
		Object[] e_pro = new Object[] {"Sauce Labs Backpack", "Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket",
				"Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"
						};
		return e_pro;
	}
	@BeforeClass
	public void valid() {
			dr.get("https://www.saucedemo.com/");
			dr.findElement(By.id("user-name")).sendKeys("standard_user");
			dr.findElement(By.id("password")).sendKeys("secret_sauce");
			dr.findElement(By.id("login-button")).click();
			}
	@Test(dataProvider="testData")
	public void test_pro(String e_name) {
		full_xp=xp_p1+num+xp_p3;
		String a_name=dr.findElement(By.xpath(full_xp)).getText();
		Assert.assertEquals(a_name, e_name);
		num++;
	};
}
