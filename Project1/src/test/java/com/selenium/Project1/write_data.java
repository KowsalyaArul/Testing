package com.selenium.Project1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_data {

	public static void main (String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filename="read_exceldata.xlsx";
		String sheetname="Sheet1";
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(sheetname);
		
		XSSFRow r=sh.getRow(0);
		XSSFCell cell1=r.getCell(1);
		XSSFCell cell2=r.createCell(3);
		cell2.setCellValue("Infosys");
		OutputStream fos = new FileOutputStream(filename);
		wb.write(fos);
		fos.close();
		wb.close();
		
		
		

	}
}
