package com.prac.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.prac.utils.ExcelUtils;

public class Test {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/tsepak/Desktop/howtodoinjava_demo.xlsx");
        FileInputStream fis = new FileInputStream(file);
        ExcelUtils excel = new ExcelUtils();
        XSSFWorkbook book = excel.getWorkBook(fis);
        XSSFSheet sheet = excel.createSheet(book, "Hari4");
        System.out.println(sheet.getSheetName());
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
        data.put("2", new Object[] {1, "Amit", "Shukla"});
        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
        data.put("4", new Object[] {3, "John", "Adwards"});
        data.put("5", new Object[] {4, "Brian", "Schultz"});

        Set<String> keyset = data.keySet();
        int rowNum = sheet.getLastRowNum();
        for (String key : keyset) {
            Row row = excel.createRow(sheet, rowNum);
            rowNum++;
            Object[] objArr = data.get(key);
            for (Object obj : objArr) {
                Cell cell = excel.createcell(row);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
        }


        /*
         * ArrayList<Row> rows = excel.getRows(excel.getSheet(excel.getWorkBook(fis), 0)); for (Row row :
         * rows) { System.out.println(excel.getCells(row)); }
         */

        FileOutputStream fileOut = new FileOutputStream("/home/tsepak/Desktop/howtodoinjava_demo.xlsx");
        book.write(fileOut);
        fileOut.close();

    }

}
