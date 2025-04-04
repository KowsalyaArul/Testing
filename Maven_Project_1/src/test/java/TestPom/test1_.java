package TestPom;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pom.pages.login1_page;

import Pom.pages.product1_page;
import Pom.pages.product_page;
import Utilities.TestListener;
import Utilities.common_methods;

@Listeners(TestListener.class)
public class test1_ extends common_methods {
    login1_page lp;
    product1_page pp;

    @BeforeMethod
    public void bm() {
        launch_chrome("https://www.saucedemo.com/");
        lp = new login1_page(dr);
        pp = new product1_page(dr);
    }

    @Test(dataProvider = "testdata")
    public void test1(String username, String password) throws IOException {
        lp.enter_uname(username);
        lp.enter_pwd(password);
        lp.click_login();
        String atitle = pp.get_title();
        Assert.assertEquals("Products", atitle);
        lp.takeScreenshot();
    }

    @Test(dataProvider = "testdata")
    public void test(String username, String password) throws IOException {
        lp.enter_uname(username);
        lp.enter_pwd(password);
        lp.click_login();
        String atitle = pp.get_title();
       
        Assert.assertEquals("Product", atitle); 
        
    }

    @DataProvider(name = "testdata")
    public Object[][] getdata() {
        return new Object[][] {
            {"standard_user", "secret_sauce"},
           
        };
    }
}
