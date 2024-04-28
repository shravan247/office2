package excell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excellMultiValue {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\shrad\\eclipse-workspace\\javaAdvanceSelenium\\excell\\shravan1.xlsx");
		Workbook xlsx= WorkbookFactory.create(fis);
		for (int i=0; i<=5; i++) {
			for (int j=0; j<1; j++) {
		String data = xlsx.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
		System.out.println(data);
		
	}
	}
	}}
