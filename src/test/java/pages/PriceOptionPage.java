package pages;

import org.openqa.selenium.WebDriver;

import utils.BasePage;

public class PriceOptionPage extends BasePage {
	public WebDriver driver = null;



	
	public PriceOptionPage() {

	}
	
	public void selecionaPriceOptions(String string) {

		switch (string) {
		case "Silver":
			executarJS("selectsilver.click();");
			break;
		case "Gold":
			executarJS("selectgold.click();");
			break;
		case "Platinum":
			executarJS("selectplatinum.click();");
			break;
		case "Ultimate":
			executarJS("selectultimate.click();");
			break;
		default:
			//Nada sera selecionado
			break;
		} 
	}
	
	
	public void clicaNext() {
		executarJS("nextsendquote.click();");
	}

	
}
