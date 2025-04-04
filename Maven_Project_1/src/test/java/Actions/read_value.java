package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class read_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://practice.expandtesting.com/large");
		dr.manage().window().maximize();
		String w1=dr.findElement(By.xpath("//*[@id=\"large-table\"]/tbody/tr[20]/td[10]")).getText();
		System.out.println(w1);
		

	}

}
