package excell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excell {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\shrad\\eclipse-workspace\\javaAdvanceSelenium\\excell\\shravan.xlsx");
	XSSFWorkbook xlsx= new XSSFWorkbook(fis);
	String data = xlsx.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	
}
}
