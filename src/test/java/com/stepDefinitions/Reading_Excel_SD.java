package com.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class Reading_Excel_SD {
    @Given("^I am reading excel file \"([^\"]*)\"$")
    public void iAmReadingExcelFile(String ExcelFileName) throws IOException {
        String path = System.getProperty("user.dir");
        String testDataFilename = path + "/src/test/java/com/Test_Data"+ExcelFileName;

        Workbook workbook = WorkbookFactory.create(new File(testDataFilename));
        Sheet sheet = workbook.getSheetAt(0);
//    for (Row row: sheet);
//
//        for (Cell cell: row);
//
//    System.out.println(new CellValue(String.valueOf(cell)));
            }

        }
