package practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ssUtility extends ssBase {

	// >>>>>> take screenshot for hard coded "filename"

	public static void takeScreenshot(WebDriver driver, String filename) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshot/" + filename);
		Files.copy(source, destination);
	}

	// >>>>>>> take ss for diff filename using "Listeners"

	public void takescreenshot() throws Exception {
		//just we need Date from java package
		Date currentdate = new Date();
		String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(".//screenshot//" + screenshotfilename + ".png");
		Files.copy(source, destination);
	}

	// >>>>>>> listeners->>>using differnt folder for different testcase
	public static String screenshotsSubFolderName;

	public void captureScreenshot(String fileName) {
		if (screenshotsSubFolderName == null) {
			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yy-hh-mm-ss");
			screenshotsSubFolderName = myDateObj.format(myFormatObj);
		}

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".//screenshot//" + screenshotsSubFolderName + "/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");

	}
}
