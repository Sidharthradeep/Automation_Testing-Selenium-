package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excelutil {
public static String getCellValue(String xl, String Sheet, int r, int c)
{
	try
	{
		// File f=new File(xl);
	    FileInputStream fi=new FileInputStream(xl);
	    try (XSSFWorkbook wb = new XSSFWorkbook(fi)) {
			XSSFCell cell =wb.getSheet(Sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
			 return cell.getStringCellValue();
			}
			else
			{
				// double v= cell.getNumericCellValue();
			    //return String.valueOf(v);
			    return cell.getRawValue();
			    // cell.get
			}
		}
	 }
	    catch (Exception e)
	{

	    return "";
	    }
}
public static int getRowCount (String xl, String Sheet)
{
	try
	{
		//  File f=new File(xl);
	    FileInputStream fi=new FileInputStream(xl);
	    try (XSSFWorkbook wb = new XSSFWorkbook(fi)) {
			return wb.getSheet(Sheet).getLastRowNum();
		}
	}
	catch (Exception e)
	{
		return 0;
	}
  }
}
