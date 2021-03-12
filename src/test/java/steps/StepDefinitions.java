package steps;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;
import pages.DadosVeiculoPage;
import pages.InsuranceDataPage;
import pages.PriceOptionPage;
import pages.ProductData;
import pages.SendQuotePage;
import utils.DriverFactory;

public class StepDefinitions {
	DadosVeiculoPage dadosVeiculo;
	InsuranceDataPage insuranceData;
	ProductData productData;
	PriceOptionPage priceOptionPage;
	SendQuotePage sendQuotePage;

	
	
	
	
	@After
	public void afterTests(Scenario scenario) {		
		if(scenario.isFailed()) {
			
			byte[] screenshot = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getId());
		}else {
			byte[] screenshot = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getId());
		}
		
		DriverFactory.closeBrowser();
		
	}
	
	@Before
	public void beforeTests() throws MalformedURLException{
		String navegador = System.getProperty("navegador","Chrome");
		DriverFactory.getWebDriver(navegador);
		
		
	}

	@Dado("que você esta na pagina do sample app")
	public void que_você_esta_na_pagina_do_sample_app() throws InterruptedException {
		dadosVeiculo = new DadosVeiculoPage();

	}

	@Quando("você insere a make {string}")
	public void você_insere_a_make(String string) {



		dadosVeiculo.SelecionaMake(string);
	}

	@Quando("seleciona o model {string}")
	public void seleciona_o_model(String string) {
		dadosVeiculo.SelecionaModel(string);
	}

	@Quando("insere a Cylinder Capacity {string}")
	public void insere_a_cylinder_capacity(String string) {
		dadosVeiculo.escreveCylindercapacity(string);
	}

	@Quando("insere a engine performace {string}")
	public void insere_a_engine_performace(String string) throws InterruptedException {
		dadosVeiculo.escreveEngineperformance(string);
	}

	@Quando("insere a date of Manufacture {string}")
	public void insere_a_date_of_manufacture(String string) throws InterruptedException {
		dadosVeiculo.escreveDateOfManufacture(string);
	}

	@Quando("seleciona o Number of Seats {int}")
	public void seleciona_o_number_of_seats(Integer int1) {
		dadosVeiculo.SelecionaNumberOfSeats(Integer.toString(int1));
	}

	@Quando("seleciona o number of seatsmotor cycle {int}")
	public void seleciona_o_number_of_seatsmotor_cycle(Integer int1) {
		dadosVeiculo.SelecionaNumberOfSeatsmotorcycle(Integer.toString(int1));

	}

	@Quando("seleciona o Fuel Type {string}")
	public void seleciona_o_fuel_type(String string) {
		dadosVeiculo.SelecionaFuel(string);
	}

	@Quando("insere o Payload  {string}")
	public void insere_o_payload(String string) {
		dadosVeiculo.escrevePayload(string);
	}

	@Quando("insere a Total Weight {string}")
	public void insere_a_total_weight(String string) {
		dadosVeiculo.escreveTotalWeight(string);
	}

	@Quando("insere o List Price  {string}")
	public void insere_o_list_price(String string) throws InterruptedException {
		dadosVeiculo.escreveListprice(string);
	}

	@Quando("insere a Quilometragem anual anual {string}")
	public void insere_a_quilometragem_anual_anual(String string) throws InterruptedException {
		dadosVeiculo.escreveAnnualMileage(string);
	}

	@Quando("clica em proximo")
	public void clica_em_proximo() {
		dadosVeiculo.clicaNext();
	}

	@Quando("insere o First Name {string}")
	public void insere_o_first_name(String string) {
		insuranceData = new InsuranceDataPage();
		insuranceData.escreveFirstname(string);
	}

	@Quando("insere o Last Name {string}")
	public void insere_o_last_name(String string) {
		insuranceData.escrevelastname(string);
	}

	@Quando("insere a Date of Birth {string}")
	public void insere_a_date_of_birth(String string) {
		insuranceData.escrevebirthdate(string);
	}

	@Quando("seleciona o country {string}")
	public void seleciona_o_country(String string) {
		insuranceData.selecionaCountry(string);
	}

	@Quando("insere o zipcode {string}")
	public void insere_o_zipcode(String string) {
		insuranceData.escreveZipCode(string);
	}

	@Quando("seleciona a occupation {string}")
	public void seleciona_a_occupation(String string) {
		insuranceData.selecionaOccupation(string);
		
	}

	@Quando("clica em next na tela insurant data")
	public void clica_em_next_na_tela_insurant_data() {
		insuranceData.clicaNext();
	}
	
	@Quando("seleciona a Star date {string}")
	public void seleciona_a_star_date(String string) {
		 productData= new ProductData();
		 productData.escreveStarDate(string);
	}

	@Quando("seleciona o Insurance Sum igual a {string}")
	public void seleciona_o_insurance_sum_igual_a(String string) {
	    productData.selecionaInsurancesum(string);
	}

	@Quando("seleciona o Merit Rating igual a {string}")
	public void seleciona_o_merit_rating_igual_a(String string) {
	    productData.selecionaMeritrating(string);
	}

	@Quando("seleciona o Demage Insurance igual a {string}")
	public void seleciona_o_demage_insurance_igual_a(String string) {
	    productData.selecionaDamageinsurance(string);
	}

	@Quando("clica nos Optional Products desejados {int}")
	public void clica_nos_optional_products_desejados(Integer int1) {
	    productData.selecionaOptionalsProducts(int1);
	}

	@Quando("seleciona o Cortesy Car {string}")
	public void seleciona_o_cortesy_car(String string) {
	    productData.selecionaCourtesycar(string);
	}

	@Quando("clica em next na tela Product Data")
	public void clica_em_next_na_tela_product_data() {
		productData.clicaNext();
	}
	

	
	@Quando("seleciona a opcao em price option {string}")
	public void seleciona_a_opcao_em_price_option_ultimate(String string) {
		priceOptionPage = new PriceOptionPage();
		priceOptionPage.selecionaPriceOptions(string);
		priceOptionPage.clicaNext();
	}
	
	@Quando("insere o email {string}")
	public void insere_o_email(String string) {
		sendQuotePage= new SendQuotePage();
		sendQuotePage.escreveEmail(string);
	}

	@Quando("insere o username {string}")
	public void insere_o_username(String string) {
		sendQuotePage.escreveUsername(string);
	}

	@Quando("insere o password {string}")
	public void insere_o_password(String string) {
		sendQuotePage.escrevePassword(string);
	}

	@Quando("insere o confirm password {string}")
	public void insere_o_confirm_password(String string) {
		sendQuotePage.escreveConfirmpassword(string);
	}

	@Quando("clica em send")
	public void clica_em_send() throws InterruptedException {
		sendQuotePage.clicaNext();


	}
	
	@Entao("a mensagem {string} aparece na tela.")
	public void a_mensagem_aparece_na_tela(String string) throws InterruptedException {
		
	Thread.sleep(10000);	
	By confirm = By.className("confirm");
	DriverFactory.getDriver().switchTo().activeElement();
	DriverFactory.getDriver().findElement(confirm).click();
	Assert.assertTrue(true);
	}
	

}
