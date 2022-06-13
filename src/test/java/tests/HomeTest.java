package tests;


import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import base.BaseTest;
import pages.CarrinhoPage;
import pages.HomePage;
import pages.ProdutoPage;

public class HomeTest extends BaseTest{
	
	HomePage Hpage = new HomePage(driver);
	ProdutoPage Ppage = new ProdutoPage(driver);
	CarrinhoPage Cpage = new CarrinhoPage(driver);
	
	
	@Test
	public void deveInteragirComPaginaInformatica() {
		//Clicar no menu Informática
		Hpage.clicarInformatica("Informática");
		//Validar titulo
		Assert.assertEquals("Informática", Hpage.obterTitulo());
		System.out.println(Hpage.obterTitulo());
		
		//Clicar no notebook produto
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Hpage.clicarProduto();
	}
	
	@Test
	public void deveInteragirComPaginaProduto() {
		deveInteragirComPaginaInformatica();
		
		//Validar nome produto
		assertTrue(Ppage.obterNomeProduto().startsWith("Notebook Gamer Acer Nitro 5 AN517-52-50RS"));
		System.out.println(Ppage.obterNomeProduto());
		
		//Obter preco produto
		Ppage.obterPrecoProduto(); 
		System.out.println(Ppage.obterPrecoProduto());
		System.out.println();
		
		//Adicionar ao carrinho
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Ppage.clicarBotaoAdicionar();
		
	}
	
	@Test
	public void deveInteragirComCarrinho() {
		deveInteragirComPaginaProduto();
		
		//Validar nome do produto no carrinho
		assertTrue(Cpage.obterNomeProduto().startsWith("Notebook Gamer Acer Nitro 5 AN517-52-50RS"));
		System.out.println(Cpage.obterNomeProduto());
		
		System.out.println();
		
		//Validar o preco do produto no carrinho
		assertTrue(Cpage.obterTotalProduto().endsWith("R$ 5.299,00"));
		System.out.println(Cpage.obterTotalProduto());

	}
	

}
