package Excelutil;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelclass {

	
	public static String get_StringValue(String x1,String sheet,int r,int c) throws Exception
	{
		FileInputStream fi=new FileInputStream(x1);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
		if(cell.getCellType()==CellType.STRING)
		{
			return cell.getStringCellValue();
		}
		else {
			return cell.getRawValue();
		}
	}
	
	public static int get_RowCount(String x1,String sheet) throws Exception
	{
		FileInputStream fi=new FileInputStream(x1);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		int rowcount=wb.getSheet(sheet).getLastRowNum();
		return rowcount+1;
	}
}