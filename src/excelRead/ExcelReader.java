package excelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = System.getProperty("user.dir")+"//TestData.xlsx";
		
		File src=new File(path);
		FileInputStream input=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(input);
		
		XSSFSheet sh1=wb.getSheet("Sheet1");
		
//		String value=sh1.getRow(row).getCell(column).getStringValue();
//		
		
		

	}

}
