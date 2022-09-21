package Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Readanexcel {

	public static void main(String[] args) throws IOException{
		String value =Readanexcel(0, 0);
		
		System.out.println(value);
	
		
	}

	public static  String Readanexcel(int a, int b)throws IOException {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\GOKUL\\eclipse-workspace\\Demoproject22\\src\\main\\resources\\excel.xlsx"));

	   XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		XSSFRow sh = sheet.getRow(a);
		XSSFCell cell = sh.getCell(b);

		switch (cell.getCellType()) {
		case NUMERIC:

		// System.out.print(cell.getNumericCellValue()+ "\t\t");
		double num = cell.getNumericCellValue();
		String value = Double.toString(num);
		return value;
		case STRING:
		return cell.getStringCellValue();
		}
		return null;
		}
	
	}


