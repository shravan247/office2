package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class fetchmultivalue {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\practice\\shra.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Sheet1");
		int lastrow=sheet.getLastRowNum();
		int lastcell=sheet.getRow(0).getLastCellNum();
		
		DataFormatter form=new DataFormatter();
		for(int i=0; i<=lastrow; i++) {
			for(int j=0; j<=lastcell; j++) {
				String value=form.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.println(value);
			}
		}
		
	}
}