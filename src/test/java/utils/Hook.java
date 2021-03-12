package utils;

import java.net.MalformedURLException;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	
	@After
	public void afterTests() {
		DriverFactory.closeBrowser();
		
	}
	
	@Before
	public void beforeTests() throws MalformedURLException{
		String navegador = System.getProperty("navegador","Chrome");
		DriverFactory.getWebDriver(navegador);
		
	}
}
