package com.selenium.Project1;

import java.io.FileInputStream;
import java.io.IOException;
 
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class read_data {
	int lastrow,lastcell;
		// TODO Auto-generated method stub
		public static String excel_read() throws IOException {
		String filename = "sample.xlsx";
		String sheetname = "Sheet1";
		FileInputStream f1 =new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet sh = wb.getSheet(sheetname);
		XSSFRow r= sh.getRow(0);
		XSSFCell c = r.getCell(0);
		String s = c.getStringCellValue();
		return s;
		}
		public static void main(String[] args) throws IOException {
		System.out.println(read_excel.excel_read()); 
	}
}