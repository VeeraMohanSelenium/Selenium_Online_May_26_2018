package SeleniumWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	public static void main(String[] args) throws Exception {
		// Get the Excel File path
		File f = new File("C:\\Users\\tm\\Desktop\\Selenium.xlsx");

		// Get the data from the ExcelFile
		FileInputStream fis = new FileInputStream(f);

		// Handling Workbook Below 2003 Microsoft Version
		// HSSFWorkbook book1 = new HSSFWorkbook(fis);

		// Handling Workbook After 2003 Microsoft Version
		XSSFWorkbook book = new XSSFWorkbook(fis);

		// Handle Worksheet
		XSSFSheet sheet = book.getSheet("Sheet1");
		// sheet = book.getSheetAt(0);

		String Test = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(Test);

		String d = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(d);
		String data = sheet.getRow(2).getCell(2).getStringCellValue();
		System.out.println(data);

		// Find the Rowcount
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);

		// Find the cellcount

		int cellcount = sheet.getRow(1).getLastCellNum();
		System.out.println(cellcount);

		for (int i = 0; i <= rowcount; i++) {

			cellcount = sheet.getRow(i).getLastCellNum();
			for (int j = 0; j < cellcount; j++) {

				String Data = sheet.getRow(i).getCell(j).getStringCellValue();

				System.out.println("All data from the Excel::    " + Data);

			}

		}

	}

}
