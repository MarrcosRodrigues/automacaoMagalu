package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clicarInformatica(String valor) {
		driver.findElement(By.linkText(valor)).click();;
	}

	public String obterTitulo() {
		return driver.findElement(By.xpath("//h1[@class='sc-hKwDye jOiekM']")).getText();
	}
	
	public void clicarProduto() {
		driver.findElement(By.xpath("//div[@class='sc-dFtzxp bESJXZ']//li[1]")).click();
	}
	
}
