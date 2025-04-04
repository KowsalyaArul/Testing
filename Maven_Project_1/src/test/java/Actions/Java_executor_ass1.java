package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_executor_ass1 {

    public static void main(String[] args) {
       
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.saucedemo.com/");
        dr.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor) dr;

        WebElement we1 = dr.findElement(By.xpath("//*[@id='user-name']"));
        we1.sendKeys("standard_user");

        WebElement we2 = dr.findElement(By.xpath("//*[@id='password']"));
        we2.sendKeys("secret_sauce");
                      
        WebElement we3 = dr.findElement(By.id("login-button"));
        jse.executeScript("arguments[0].click();", we3);

    }
}
