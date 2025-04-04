package com.selenium.Project1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class studentmark_read extends student_marks {

    public studentmark_read(int physics, int maths, int sid) {
        super();
    }

    public static HashMap<Integer, student_marks> readandcalAverage() throws IOException {
        String filename = "mark.xlsx";
        String sheetname = "Sheet1";
        FileInputStream fis = new FileInputStream(filename);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(sheetname);
        HashMap<Integer, student_marks> stu = new HashMap<>();
        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue;
            int sid = (int) row.getCell(0).getNumericCellValue();
            int maths = (int) row.getCell(1).getNumericCellValue();
            int phy = (int) row.getCell(2).getNumericCellValue();
            student_marks student = new student_marks(phy, maths, sid, "", "");
            stu.put(sid, student);
            System.out.println(sid + " " + maths + " " + phy);
        }
        wb.close();
        fis.close();
        return stu;
    }

    public static HashMap<Integer, student_marks> read() throws IOException {
        String filename = "students.xlsx";
        String sheetname = "Sheet1";
        FileInputStream fis = new FileInputStream(filename);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(sheetname);
        HashMap<Integer, student_marks> stu1 = new HashMap<>();
        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue;
            int sid = (int) row.getCell(0).getNumericCellValue();
            String sname = row.getCell(1).getStringCellValue();
            String sem = row.getCell(2).getStringCellValue();
            student_marks student = new student_marks( 0,0,sid, sname, sem);
            stu1.put(sid, student);
            System.out.println(student);
        }
        wb.close();
        fis.close();
        return stu1;
    }

    public static void writeAverageToStudents(HashMap<Integer, student_marks> marksData) throws IOException {
        String filename = "students.xlsx";
        FileInputStream fis = new FileInputStream(filename);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Sheet1");

        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue;
            int sid = (int) row.getCell(0).getNumericCellValue();
            if (marksData.containsKey(sid)) {
                student_marks student = marksData.get(sid);
                double average = student.getAverage();
                row.createCell(3).setCellValue(average); 
            }
        }

        fis.close();
        FileOutputStream fos = new FileOutputStream(filename);
        wb.write(fos);
        fos.close();
        wb.close();
    }

    public static void main(String[] args) throws IOException {
        HashMap<Integer, student_marks> marksData = studentmark_read.readandcalAverage();
        studentmark_read.read();
        studentmark_read.writeAverageToStudents(marksData);
    }
}
