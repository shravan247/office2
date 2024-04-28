package excell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDrivenTestingworkbookNegelctfirstROW {
	@DataProvider (name="exceldata")
	public Object[][] data() throws EncryptedDocumentException, IOException  {
		
		FileInputStream f = new FileInputStream(
				"C:\\Users\\shrad\\eclipse-workspace\\javaAdvanceSelenium\\excell\\shravan1.xlsx");
		Workbook xlsx = WorkbookFactory.create(f);
		Sheet s = xlsx.getSheet("sheet2");
		int rowsize = s.getPhysicalNumberOfRows();
		int columnsize = s.getRow(0).getPhysicalNumberOfCells();
		Object[][] d=new Object[rowsize-1][columnsize];
//to start from second row make i=1 (rowsize-1 both up and down)
		for (int i = 0; i < rowsize-1; i++) {
			for (int j = 0; j < columnsize; j++) {
				//getRow(i+1)
				d[i][j]=s.getRow(i+1).getCell(j).toString();
			}}
		return d;
		}
	
	@Test (dataProvider = "exceldata")
	public void m1(String trainer, String subject) {
		System.out.println(trainer);
		System.out.println(subject);
	}

}
