package com.selenium.Project1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_excel {
	int lastrownum,lastcellnum;

	public static String excel_read() throws IOException {
		// TODO Auto-generated method stub
		String filename="read_exceldata.xlsx";
		String sheetname="Sheet1";
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(sheetname);
		
		XSSFRow r=sh.getRow(0);
		XSSFCell cell=r.getCell(1);
		String s=cell.getStringCellValue();
		System.out.println(s);
		return s;
		
		

	}
	public static String excel_read1() throws IOException {
		// TODO Auto-generated method stub
		String filename="student.xlsx";
		String sheetname="Sheet1";
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(sheetname);
		
		XSSFRow r=sh.getRow(0);
		XSSFCell cell=r.getCell(1);
		String s=cell.getStringCellValue();
		System.out.println(s);
		return s;
		
		

	}
	public static void main(String[] args) throws IOException{
		read_excel.excel_read();
		excel_read1();
	}

}
