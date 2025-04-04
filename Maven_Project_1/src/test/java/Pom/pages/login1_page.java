package Pom.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1_page {
    WebDriver dr;
    @FindBy(xpath="//input[@name='user-name']")
    WebElement unamexp;
    @FindBy(xpath="//input[@name='password']")
    WebElement pwdxp;
    @FindBy(xpath="//input[@name='login-button']")
    WebElement btn;

    public login1_page(WebDriver dr) {
        this.dr = dr;
        PageFactory.initElements(dr, this);
    }

    public void enter_uname(String un) {
        unamexp.sendKeys(un);
    }

    public void enter_pwd(String pwd) {
        pwdxp.sendKeys(pwd);
    }

    public void click_login() {
        btn.click();
    }
    
    public void takeScreenshot() throws IOException {
    	TakesScreenshot ss=((TakesScreenshot) dr);
		File srcf=ss.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\kowsalya.arulmathu\\Pictures\\2.png");
		FileUtils.copyFile(srcf, destfile);
	}
    
}
