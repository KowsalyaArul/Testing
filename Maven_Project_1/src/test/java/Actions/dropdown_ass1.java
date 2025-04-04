package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_ass1 {

    public static void main(String[] args) {
      
 
        WebDriver dr = new ChromeDriver();
        dr.get("https://jqueryui.com/selectmenu");
        dr.manage().window().maximize();

        WebElement w1 = dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
        dr.switchTo().frame(w1);

        WebElement w2 = dr.findElement(By.xpath("//*[@id='speed-button']"));
       w2.click();

        Select s1=new Select(w2);
        s1.selectByContainsVisibleText("Slow");
        
 }
}
