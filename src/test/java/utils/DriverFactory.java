package utils;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private static WebDriver driver = null;
	
	DesiredCapabilities capability;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void getDriver(WebDriver driver) {
		DriverFactory.driver = driver;
	}

	public DriverFactory(){
		
	}
	public DriverFactory(String browserType) {
	    try {
			driver = getWebDriver(browserType);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public static void closeBrowser() {
		if (driver != null) {
			driver.close();
		}
	}

	public static WebDriver getWebDriver(String browserType) throws MalformedURLException {
			System.out.println("Passei aqui " + browserType);
			switch (browserType) {
		     case "Firefox":	
		    	 WebDriverManager.firefoxdriver().setup();
					FirefoxOptions optionsF = new FirefoxOptions();
					optionsF.addArguments("--start-maximized");
		    	 driver = new FirefoxDriver(optionsF);
		    	 return driver;
		    	 
		 	case "IE":
		 		WebDriverManager.iedriver().setup();
		 		//iedriver
		 		return driver;
		     case "Chrome":
		    	 WebDriverManager.chromedriver().setup();
		    	 ChromeOptions optionsC = new ChromeOptions(); 
				optionsC.addArguments("--start-maximized");
				optionsC.addArguments("use-fake-ui-for-media-stream");
		    	 driver = new ChromeDriver(optionsC);
		    	 driver.get("http://sampleapp.tricentis.com/101/app.php");
		    	 return driver;
		     default:
		         throw new RuntimeException("Browser Não Suportado!!!!");
		    }
//		}else {
//			return driver;
//		}
	}
	
	

}
