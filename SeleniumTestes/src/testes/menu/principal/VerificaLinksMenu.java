package testes.menu.principal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import areas.atuacao.metodos.verificacao.VerificaCidadania;
import browsers.Navegadores;

public class VerificaLinksMenu {

	final static Logger logger = Logger.getLogger(VerificaCidadania.class);
	static WebDriver driver;
	
	public static void abreMenu(WebDriver driver, WebElement element){

		//Abre no menu "Conheça o MPRJ"
		element = driver.findElement(By.className("texto-link"));
		element.click();
	}
	
	public static void verificarMenu() throws InterruptedException{
		
		driver = Navegadores.GoogleChrome("http://www.mprj.mp.br/home");
		
		WebElement element = null;
		
		abreMenu(driver, element);
		
		//Acessa o link "Procurador-Geral" e volta para a "Home"
		element = driver.findElement(By.xpath("//nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_5']/a"));
		element.click();
		voltar(driver);
		
		abreMenu(driver, element);
		
		//Acessa o link "Colégio de Procuradores de Justiça" e volta para a "Home"
		element = driver.findElement(By.xpath("//nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_746']/a"));
		element.click();
		voltar(driver);
		
		abreMenu(driver, element);
		
		//Acessa o link "Órgão Especial" e volta para a "Home"
		element = driver.findElement(By.xpath("//nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_6']/a"));
		element.click();
		voltar(driver);
		
		abreMenu(driver, element);
		
		//Acessa o link "Conselho Superior" e volta para a "Home"
		element = driver.findElement(By.xpath("//nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_7']/a"));
		element.click();
		voltar(driver);
		
		abreMenu(driver, element);
		
		//Acessa o link "Corregedoria-Geral" e volta para a "Home"
		element = driver.findElement(By.xpath("//nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_8']/a"));
		element.click();
		voltar(driver);
		
		abreMenu(driver, element);
		
		//Acessa o link "Organograma" e volta para a "Home"
		element = driver.findElement(By.xpath("//nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_12']/a"));
		element.click();
		voltar(driver);
		
		abreMenu(driver, element);
		
		//Acessa o link "Mapa Estratégico" e volta para a "Home"
		element = driver.findElement(By.xpath("//nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_13']/a"));
		element.click();
		voltar(driver);
		
		abreMenu(driver, element);
		
		//Acessa o link "Nossos Endereços" e volta para a "Home"
		element = driver.findElement(By.xpath("//nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_16']/a"));
		element.click();
		voltar(driver);
		
		driver.close();
	}
	
	public static void voltar(WebDriver driver) throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.history.go(-1)");
	}
	
	private boolean isElementPresent(By by) {
	    
		try {
	     
	    	driver.findElement(by);
	    	return true;
	    
	    } catch (NoSuchElementException e) {
	      
	    	return false;
	    }
	  }
	
	public static void main(String[] args) throws InterruptedException {
		
		verificarMenu();
	}
}
