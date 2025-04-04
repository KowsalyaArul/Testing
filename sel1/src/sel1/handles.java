package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class handles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new EdgeDriver();
		dr.get("https://practice.expandtesting.com/windows");
		dr.manage().window().maximize();
		String m=dr.getWindowHandle();
		dr.findElement(By.xpath("//div[@class='page-layout']/div/div/a")).click();
		//dr.findElement(By.xpath("//div[@class='page-layout']/div/div/a")).click();

		
		int i=1;
		for(String h: dr.getWindowHandles()) {
			dr.switchTo().window(m);
			String t=dr.getTitle();
			System.out.println("Windows "+ i +"Title : "+t);
			i++;
		}

	}

}
