package Cookies;

import org.openqa.selenium.Cookie;

import utilities.common_methods;

public class cookies1 extends common_methods {
	public static void addCookies(String cname,String cvalue) {
		Cookie c=new Cookie(cname,cvalue);
		dr.manage().addCookie(c);
	}
	public static void display_Cookie() {
		for(Cookie c: dr.manage().getCookies()){
			System.out.println("name : " + c.getName() + "Value : "+ c.getValue() );
		}
	}
	public static void delete_cookies(String cname) {
		dr.manage().deleteCookieNamed(cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch_chrome("https://www.flipkart.com");
		addCookies("UserSession","12345");
		addCookies("Place","Bangalore");
		addCookies("Page","Products Page");
		display_Cookie();
		delete_cookies("Place");
		
		if(dr.manage().getCookieNamed("Place")==null) {
			System.out.println("TestCookie successfully deleted.");
		}
		else {
			System.out.println("Not deleted");
		}

	}

}
