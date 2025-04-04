package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assert_true {
    WebDriver dr;

    @BeforeMethod
    public void setUp() {
        dr = new ChromeDriver();
        dr.get("https://jqueryui.com/checkboxradio/");
        dr.manage().window().maximize();
    }

    @Test
    public void verifyTitle() {
        String s1 = dr.getTitle();
        Assert.assertTrue(s1.contains("Checkbox"), "The title does not match");
    }

    
}
