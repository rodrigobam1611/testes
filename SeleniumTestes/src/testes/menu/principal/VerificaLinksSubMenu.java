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

public class VerificaLinksSubMenu {
	
	final static Logger logger = Logger.getLogger(VerificaCidadania.class);
	static WebDriver driver;
	
	public static void abreMenu(WebDriver driver, WebElement element){

		//Abre no menu "Conheça o MPRJ"
		element = driver.findElement(By.className("texto-link"));
		element.click();
	}
	
	public static void mouseOver(WebDriver driver, WebElement element){
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
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
	
	public static void verificaSubMenu() throws InterruptedException{
		
		driver = Navegadores.GoogleChrome("http://www.mprj.mp.br/home");
		
		//Abre no menu "Conheça o MPRJ"
		WebElement element = null;		
		abreMenu(driver, element);
		
		//Acessa o link "Sobre a instituição" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_3']/a"));
		assertEquals("Nossos Endereços", driver.findElement(By.xpath("//div[@id='wrapper']/div[@id='content']/div[@class='content-topo']/div[@class='titulo-destaque titulo-default']")));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Cidadania" e volta para a "Home" 
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_68']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Cível" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_67']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Consumidor" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_69']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Criminal" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_70']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Direitos Humanos e Minorias" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_72']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Educação" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_71']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Eleitoral" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_74']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Execução Penal" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_73']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Idoso e Pessoa com Deficiência" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_76']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Infância e Juventude" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_75']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Meio Ambiente" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_77']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Saúde" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_78']/a"));
		element.click();
		voltar(driver);
		
		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Violência Doméstica" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_80']/a"));
		element.click();
		voltar(driver);

		//Abre o menu "Conheça o MPRJ" e realiza um mouseOver sobre "Áreas de atuação"
		abreMenu(driver, element);
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/a"));
		mouseOver(driver, element);
		
		//Acessa a área de atuação "Registro Civil de Nascimento e Documentação Básica" e volta para a "Home"
		element = driver.findElement(By.xpath("//header[@id='banner']/nav[@id='navigation']/div[@id='menu-responsivo-pai']/div[@id='menu-responsivo']/div[@class='collapse nav-collapse mobile']/ul[@id='navCollapse']/li[@id='layout_2']/ul[@id='child-menu']/li[@id='layout_4']/ul[@id='grandchild-menu']/li[@id='layout_81']/a"));
		element.click();
		voltar(driver);
		
		driver.close();
	}
	
		
	public static void main(String[] args) throws InterruptedException {
		
		verificaSubMenu();
	}
	
}
