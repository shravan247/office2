package excell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excellPhyicalNoOfRowColumn {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\shrad\\eclipse-workspace\\javaAdvanceSelenium\\excell\\shravan1.xlsx");
		Workbook xlsx = WorkbookFactory.create(fis);
		Sheet s = xlsx.getSheet("sheet2");
		int rowsize = s.getPhysicalNumberOfRows();
		int columnsize = s.getRow(0).getPhysicalNumberOfCells();
		for (int i = 1; i < rowsize; i++) {
			for (int j = 0; j < columnsize; j++) {
				// different sheet
				String data = xlsx.getSheet("sheet2").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data + " ");
				//if(j!=columnsize-1)
					//System.out.print(" |  ");
			}
			System.out.println();

		}
	}
}
