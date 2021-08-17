package main.java.Utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelWorksheet {
    public List<HashMap> readExcel(String filePath, String fileName, String sheetName) throws IOException {
        HashMap<String, String> CellValuCol = new HashMap<String, String>();
        List<HashMap> arrayList=new LinkedList<>();
        //Create an object of File class to open xlsx file

        File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook reesbyworkbook = null;

        //Find the file extension by splitting file name in substring  and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

            //If it is xlsx file then create object of XSSFWorkbook class

            reesbyworkbook = new XSSFWorkbook(inputStream);

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of HSSFWorkbook class

            reesbyworkbook = new HSSFWorkbook(inputStream);

        }

        //Read sheet inside the workbook by its name

        Sheet reesbySheet = reesbyworkbook.getSheet(sheetName);

        //Find number of rows in excel file

        int rowCount = reesbySheet.getLastRowNum()-reesbySheet.getFirstRowNum();

        //Create a loop over all the rows of excel file to read it

        for (int i = 1; i < rowCount+1; i++) {

            Row row = reesbySheet.getRow(i);
            int colSize = row.getLastCellNum();
            int j = 0;

                    CellValuCol.put("Module", row.getCell(j).getStringCellValue());
                    CellValuCol.put("api", row.getCell(j+1 ).getStringCellValue());
                    CellValuCol.put("type", row.getCell(j+2 ).getStringCellValue());
                arrayList.add(new HashMap(CellValuCol));


        }

        return arrayList;
    }

}
