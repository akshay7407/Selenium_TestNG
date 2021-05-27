package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class filecreation {

	public static void main(String[] args) throws IOException  {
          File fs =new File("C:\\Users\\lenovo\\Desktop\\java files\\selenium_tutoial1\\tbs.xlsx"); 
          System.out.println(fs.exists());
          FileInputStream fis=new FileInputStream(fs);
  		
  		// .xlsx--- We have create object of XSSFWorkbook
  		// it will load all workbook  ------------ all sheets
  		XSSFWorkbook wb=new XSSFWorkbook(fis);
  		
  		XSSFSheet sheet=wb.getSheetAt(0);
  	
  		int rows=sheet.getLastRowNum();
  		System.out.println(rows);
          
	}

}
