package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.Scenario;

public class TestBase {

    private static WebDriver driver;

	    public void before() {

	        

	        driver = new ChromeDriver();
	    }

	    public static WebDriver getDriver() {
	        return driver;
	    }


	    public void tearDown(Scenario scenario) {
	        if (scenario.isFailed()) {
	            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
	            if (screenshot != null ) {
	                //scenario.embed(screenshot, "image/png");
	            }
	        }
	        driver.close();
	    }

}
