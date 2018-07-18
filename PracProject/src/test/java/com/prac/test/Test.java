package com.prac.test;

import java.io.File;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;

import com.prac.utils.ExcelUtils;

public class Test {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\ryeruva\\git-repo-proc\\pracone\\pracproject.xlsx");
        ExcelUtils worbook = new ExcelUtils();;
        ArrayList<Row> rows = worbook.getRows(worbook.getSheet(worbook.getWorkBook(file), 0));
        for (Row row : rows) {
            System.out.println(worbook.getCells(row));
            System.out.println(worbook.getCells(row));
        }
    }

}
