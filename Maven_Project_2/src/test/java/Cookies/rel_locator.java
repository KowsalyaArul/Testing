package Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

import utilities.common_methods;

public class rel_locator extends common_methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch_chrome("https://www.saucedemo.com/");
		By email = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		dr.findElement(email).sendKeys("standard_user");
		By password = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
		dr.findElement(password).sendKeys("secret_sauce");

	}

}
