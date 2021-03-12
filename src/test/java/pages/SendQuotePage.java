package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BasePage;

public class SendQuotePage extends BasePage {
	public WebDriver driver = null;

	private final By email = By.id("email");
	private final By username = By.id("username");
	private final By password = By.id("password");
	private final By confirmpassword = By.id("confirmpassword");
	private final By sendemail = By.id("sendemail");
	private final By confirm = By.className("confirm");
	
	public SendQuotePage () {

		}

	public void escreveEmail(String string) {
		escrever(email, string);
	}

	public void escreveUsername(String string) {
		escrever(username, string);
	}

	public void escrevePassword(String string) {
		escrever(password, string);
	}

	public void escreveConfirmpassword(String string) {
		escrever(confirmpassword, string);
	}

	public void clicaNext() {
		clicarBotao(sendemail);				
        
	}
	
	public void clicaEmConfirm() {
		clicarBotao(sendemail);				
        
	}
	
	public void validarTextoSucesso() {
		clicarBotao(sendemail);				
        
	}
	
	

}
