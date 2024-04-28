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

public class practiceUtility  {
WebDriver driver;
	public static void takess1(WebDriver driver, String filename) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("./appuShetty/" + filename);
		Files.copy(s, d);
	}

	public void takesss2() throws Exception {
		Date d = new Date();
		String filename = d.toString().replace(" ", "-").replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File e = new File(".//appuShetty//" + filename + ".png");
		Files.copy(s, e);
	}

	public static String screenshotsSubFolderName;

	public void captureScreenshot(String fileName) {
		if (screenshotsSubFolderName == null) {
			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yy-hh-mm-ss");
			screenshotsSubFolderName = myDateObj.format(myFormatObj);
		}

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".//appuShetty//" + screenshotsSubFolderName + "/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
