package Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;

public class DataExcel {

	public static Object[][] readExcel(String filepath, String sheetname) throws Exception {
		
		FileInputStream file = new FileInputStream(new File(filepath));
		
		XSSFWorkbook ExcelWorkbook= new XSSFWorkbook(file);
		XSSFSheet sheet = ExcelWorkbook.getSheet(sheetname);
		
		System.out.println(sheetname);
		
		XSSFRow row;
		int rows = sheet.getPhysicalNumberOfRows();
		int columns= sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object cellValue[][] = new Object[rows][columns];
		
		for (int r = 0; r < rows; r++) {
		row = sheet.getRow(r);
			if (row == null){ 
				break; 
			}else{ 
				for (int c = 0; c < columns; c++) {
		    		DataFormatter dataFormatter = new DataFormatter();
		    		cellValue[r][c] = dataFormatter.formatCellValue(sheet.getRow(r).getCell(c));
			   	 } 
		     }
		}
		
		ExcelWorkbook.close();
		return cellValue;
		
	}
	
}