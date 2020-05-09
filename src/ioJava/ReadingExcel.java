package ioJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File f = new File("H:\\Selenium\\ExcelCoding\\myExcelFile.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet0 = workbook.getSheetAt(0);

		for (Row row : sheet0) {
			for (Cell cell : row) {
				switch (cell.getCellType()) {

				case STRING: {
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				}
				case NUMERIC: {
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				}
				}
			}
			System.out.println("\n");
		}

		/*
		 * Row row0 = sheet0.getRow(0); Cell cellA = row0.getCell(0);
		 * System.out.println(cellA);
		 */
		fi.close();
	}
}
