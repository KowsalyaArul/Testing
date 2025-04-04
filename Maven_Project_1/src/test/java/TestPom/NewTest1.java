package TestPom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom.pages.login_page;
import Pom.pages.product_page;
import Utilities.common_methods;

public class NewTest1 extends common_methods {
	login_page lp;
	product_page pp;
	String[][] testData;
	@BeforeMethod
	public void bm() {
		launch_chrome("https://www.saucedemo.com/");
		lp=new login_page(dr);
		pp=new product_page(dr);
	}
	@AfterMethod
	public void am() {
		dr.close();
	}

    @Test(dataProvider = "testdata")
    public void test1(String username, String password) {
        lp.enter_uname(username);
        lp.enter_pwd(password);
        lp.click_login();
                
        String atitle = pp.get_title();
        Assert.assertEquals("Products", atitle);
    }

	@Test(dataProvider = "testdata")
    public void test(String username, String password) {
        lp.enter_uname(username);
        lp.enter_pwd(password);
        lp.click_login();
        String atitle = pp.get_title();
        Assert.assertEquals("Product", atitle);
    }

	@DataProvider(name = "testdata")
    public Object[][] getdata() {
        return testData;
    }

		
	
	@BeforeClass
	public void excel_read() throws IOException {
        String filename = "read_user_data.xlsx";
        String sheetname = "Sheet1";
        FileInputStream fis = new FileInputStream(filename);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet(sheetname);
        int row = sh.getPhysicalNumberOfRows();
        int col = sh.getRow(0).getPhysicalNumberOfCells();
        testData = new String[row - 1][col];
        for (int r = 1; r < row; r++) { 
           XSSFRow row1 = sh.getRow(r);
            for (int c = 0; c < col; c++) { 
                XSSFCell cell = row1.getCell(c);
                testData[r - 1][c] = cell.getStringCellValue();
            }
        }

        wb.close();
    }
}


