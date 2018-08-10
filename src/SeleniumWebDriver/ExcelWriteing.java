package SeleniumWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.CreateCell;

public class ExcelWriteing {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\tm\\Desktop\\Selenium.xlsx");

		// Get the data from the ExcelFile
		FileInputStream fis = new FileInputStream(f);

		// Handling Workbook Below 2003 Microsoft Version
		// HSSFWorkbook book1 = new HSSFWorkbook(fis);

		// Handling Workbook After 2003 Microsoft Version
		XSSFWorkbook book = new XSSFWorkbook(fis);

		// Handle Worksheet
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		sheet.getRow(0).createCell(3).setCellValue("S1");
		sheet.getRow(1).createCell(3).setCellValue("S2");
		sheet.getRow(2).createCell(3).setCellValue("S3");
		sheet.createRow(5).createCell(0).setCellValue("25-May-1994");

		
		FileOutputStream out=new FileOutputStream(f);
		book.write(out);
		book.close();out.close();
		System.out.println();
	}

}
