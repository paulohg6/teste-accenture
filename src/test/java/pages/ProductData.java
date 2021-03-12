package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BasePage;

public class ProductData  extends BasePage{
	public WebDriver driver = null;

	private final By startdate = By.id("startdate");
	private final By insurancesum = By.id("insurancesum");
	private final By meritrating = By.id("meritrating");
	private final By damageinsurance = By.id("damageinsurance");
	private final By  courtesycar = By.id("courtesycar");
	private final By  nextselectpriceoption = By.id("nextselectpriceoption");
	
	
	public ProductData() {

	}
	public void escreveStarDate(String string) {
		escrever(startdate,string);
	}
	
	public void selecionaInsurancesum(String string) {
		selecionarCombo(insurancesum,string);
	}
	public void selecionaDamageinsurance(String string) {
		selecionarCombo(damageinsurance,string);
	}
	public void selecionaMeritrating(String string) {
		selecionarCombo(meritrating,string);
	}
	public void selecionaCourtesycar(String string) {
		selecionarCombo(courtesycar,string);
	}
	public void selecionaOptionalsProducts(Integer int1) {
		//Regra adicionada 
		//1 seleciona EuroProtection 
		//2 seleciona legal defense insurance 
		//3 seleciona os dois 
		
		switch (int1) {
		case 1:
			executarJS("EuroProtection.click();");
			break;
		case 2:
			executarJS("LegalDefenseInsurance.click();");
			break;
		case 3:

			executarJS("EuroProtection.click();");
			executarJS("LegalDefenseInsurance.click();");
			break;

		default:
			//Nada sera selecionado
			break;
		} 
	}
	
	
	public void clicaNext() {
		clicarBotao(nextselectpriceoption);
	}

}
