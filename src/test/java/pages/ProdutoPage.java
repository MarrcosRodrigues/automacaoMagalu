package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage {
	
	private WebDriver driver;
	
	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String obterNomeProduto() {
		return driver.findElement(By.className("ihAhDB")).getText();
	}
	
	public String obterPrecoProduto() {
		return driver.findElement(By.className("ezRJyU")).getText();
	}
	
	public void clicarBotaoAdicionar() {
		driver.findElement(By.className("DcfVk")).click();
	}

}
