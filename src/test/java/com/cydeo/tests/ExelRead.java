package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExelRead {

    @Test
    public void read_from_exel_file() throws IOException {
        String path="SampleData.xlsx";

        FileInputStream fileInputStream =new FileInputStream(path);

        XSSFWorkbook xssfWorkbook =new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet=xssfWorkbook.getSheet("Employees");

        for (int i = 1; i < 5; i++) {
            System.out.println(xssfSheet.getRow(i).getCell(0));
        }


    }
}
