package POM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;

public class ScreenshotUtility {
	public static void takeScreenshot(WebDriver driver, String fileName, ExtentTest test) {

        try {

            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE);

            String screenshotPath = "screenshots/" + fileName + ".png";

            FileHandler.copy(source, new File(screenshotPath));

            test.fail("Screenshot taken: ");
            test.addScreenCaptureFromPath(screenshotPath);

        } catch (IOException e) {

            System.out.println("Failed to take screenshot: " + e.getMessage());

        }

    }

}
