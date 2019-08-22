package org.tes.ExcelFetch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead 
{
 public static String getData(int rowno, int columno) throws IOException
 {
	File f= new File("C:\\Users\\subbian\\eclipse-workspace\\Arch\\ExcelFetch\\Excel\\excel pwd.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook book=new XSSFWorkbook(stream);
	Sheet s=book.getSheet("details");
	Row r=s.getRow(rowno);
	Cell c=r.getCell(columno);
	int type =c.getCellType();
	String name="";
	if(type==1)
	{
		name=c.getStringCellValue();
	}
	else
	{
		if(DateUtil.isCellDateFormatted(c))
		{
			Date d=c.getDateCellValue();
			SimpleDateFormat a=new SimpleDateFormat("dd-MMM-yy");
			name=a.format(d);
		}
		else
		{
			double d=c.getNumericCellValue();
			long l=(long) d;
			name=String.valueOf(l);
		}
	}
 return name;
 }
}
