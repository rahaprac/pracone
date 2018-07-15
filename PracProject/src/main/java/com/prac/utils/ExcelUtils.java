package com.prac.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {



    public XSSFWorkbook getWorkBook(File excelPath) {
        try {
            FileInputStream fis = new FileInputStream(excelPath);
            return new XSSFWorkbook(fis);
        } catch (FileNotFoundException e) {
            System.out.println("Please enter valid file path");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File is not excel type");
            e.printStackTrace();
        }
        return null;
    }

    public XSSFSheet getSheet(XSSFWorkbook book, String name) {
        return book.getSheet(name);
    }

    public XSSFSheet getSheet(XSSFWorkbook book, int index) {
        return book.getSheetAt(index);
    }

    public ArrayList<Row> getRows(XSSFSheet sheet) {
        ArrayList<Row> rowList = new ArrayList<Row>();
        Iterator<Row> ite = sheet.rowIterator();
        while (ite.hasNext()) {
            rowList.add(ite.next());
        }
        return rowList;
    }

    public ArrayList<Cell> getCells(Row row) {
        ArrayList<Cell> cellList = new ArrayList<Cell>();
        Iterator<Cell> ite = row.cellIterator();
        while (ite.hasNext()) {
            cellList.add(ite.next());
        }
        return cellList;
    }



}
