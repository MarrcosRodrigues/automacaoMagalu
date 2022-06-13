package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage {
	
	private WebDriver driver;
	
	
	public CarrinhoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String obterNomeProduto() {
		return driver.findElement(By.cssSelector("a.BasketItemProduct-info-title p:nth-child(1)")).getText();
	}
	
	public String obterPrecoProduto() {
		return driver.findElement(By.cssSelector("a.BasketItemProduct-info-title p:nth-child(1)")).getText();
	}
	
	public String obterTotalProduto() {
		return driver.findElement(By.cssSelector("div.BasketItemProduct-price")).getText();
	}
	
	
}
