package dataDrivenFramework;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel1 {
	XSSFWorkbook sheet;
	XSSFSheet excel;

	public excel1 (String Exelpath) throws Exception {

		File fs=new File(Exelpath);
		FileInputStream fis=new FileInputStream(fs);
		sheet =new XSSFWorkbook(fis);
	}

	////non static method with int return type and int parameter
	public int getRow(int sheetindex) {

		int rows=sheet.getSheetAt(sheetindex).getLastRowNum();
		rows=rows+1;
		return rows;
	}
	// non static method with string and 3 int parameter
	public String getdata(int sheetIndex, int row, int cell)	{
		excel=	sheet.getSheetAt(sheetIndex);
		String data= excel.getRow(row).getCell(cell).getStringCellValue();

		return data;

	}

}
