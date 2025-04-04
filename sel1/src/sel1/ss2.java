package sel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.flipkart.com");
		WebDriver dr1=new EdgeDriver();
		dr1.get("https://www.flipkart.com");
	    WebDriver dr2=new FirefoxDriver();
		dr2.get("https://www.flipkart.com");

	}

}
