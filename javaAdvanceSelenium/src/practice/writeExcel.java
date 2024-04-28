package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\\\practice\\\\shra.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Sheet1");
		sheet.createRow(2).createCell(1).setCellValue("kukura");
		FileOutputStream fos=new FileOutputStream("D:\\\\practice\\\\shra.xlsx");
		book.write(fos);
		fos.flush();
		System.out.println("pass");
	}

}
