package areas.atuacao.metodos.verificacao;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificaCidadania {

	final static Logger logger = Logger.getLogger(VerificaCidadania.class);
	static WebDriver browser;
	static boolean teste;
	
	public static String verificar(WebDriver driver){
		
		
		logger.info("=====Verificando o card 'Sobre'=====");
		
		WebElement elemento = driver.findElement(By.xpath("//div[@class='journal-content-article']/p[2]"));
		boolean texto = driver.getPageSource().contains(elemento.getText());
		verificaElemento(texto, "Parágrafo do card 'Sobre' verificado");
		
		logger.info("=====Card 'Sobre' verificado=====");
		
		
		logger.info("=====Verificando o card 'Atribuições'=====");
		
		elemento = driver.findElement(By.xpath("//div[@id='p_p_id_56_INSTANCE_RdibDriBmE1c_']/section[@id='portlet_56_INSTANCE_RdibDriBmE1c']/div[@class='portlet-content']/div[@class=' portlet-content-container']/div[@class='portlet-body']/div[@class='journal-content-article']"));
		teste = driver.getPageSource().contains(elemento.getText());
		verificaElemento(teste, "parágrafo verificado");
		
		logger.info("=====Card 'Atribuições' verificado=====");
		
		
		logger.info("=====Verificando o card 'Localização'=====");
		//Imagem Link Google Maps
		elemento = driver.findElement(By.xpath("//div[@class='portlet-body']/div[@class='journal-content-article']/div[2]/a/img"));
		testaImagem(elemento);
				
		logger.info("=====Card 'Localização' verificado=====");
		
		
		//Endereço que está abaixo do Link Google Maps
		elemento = driver.findElement(By.xpath("//div[@class='portlet-body']/div[@class='journal-content-article']/div[3]/span[2]"));
		teste = driver.getPageSource().contains(elemento.getText());
		verificaElemento(teste, "Endereço verificado");
		
		
		//Ícone Denúncia à Ouvidoria
	    elemento = driver.findElement(By.xpath("//div[@class='portlet-body']/div[@class='journal-content-article']/div[2]/div[@class='esquerda']/img"));
	    testaImagem(elemento);
	    
		//Texto em cima do botão 'Comunique online'
		elemento = driver.findElement(By.xpath("//div[@class='journal-content-article']/div[2]/div[@class='direita']/div[@class='descricao-texto-ouvidoria']"));
		System.out.println(elemento.getText());
		
		//Botão 'Comunique online'
		elemento = browser.findElement(By.xpath("//a[@class='link-btn']"));
		System.out.println(elemento.getText());
		
		//Responsáveis 
		//COORDENADORA
		elemento = browser.findElement(By.xpath("//div[@id='p_p_id_56_INSTANCE_yUl2ZgX6RWn8_']/section[@id='portlet_56_INSTANCE_yUl2ZgX6RWn8']/div[@class='portlet-content']/div[@class=' portlet-content-container']/div[@class='portlet-body']/div[@class='journal-content-article']/div[@class='responsaveis'][1]/div[1]/span[@class='titulo-funcao']"));
		System.out.println(elemento.getText());
		
		//Drª. Patrícia do Couto Villela
		elemento = browser.findElement(By.xpath("//div[@id='p_p_id_56_INSTANCE_yUl2ZgX6RWn8_']/section[@id='portlet_56_INSTANCE_yUl2ZgX6RWn8']/div[@class='portlet-content']/div[@class=' portlet-content-container']/div[@class='portlet-body']/div[@class='journal-content-article']/div[@class='responsaveis'][1]/div[1]/span[2]"));
		System.out.println(elemento.getText());
		
		//SUBCOORDENADORA
		elemento = browser.findElement(By.xpath("//div[@id='p_p_id_56_INSTANCE_yUl2ZgX6RWn8_']/section[@id='portlet_56_INSTANCE_yUl2ZgX6RWn8']/div[@class='portlet-content']/div[@class=' portlet-content-container']/div[@class='portlet-body']/div[@class='journal-content-article']/div[@class='responsaveis'][2]/div[1]/span[@class='titulo-funcao']"));
		System.out.println(elemento.getText());
		
		//Drª. Glicia Pessanha Viana Crispim
		elemento = browser.findElement(By.xpath("//div[@id='p_p_id_56_INSTANCE_yUl2ZgX6RWn8_']/section[@id='portlet_56_INSTANCE_yUl2ZgX6RWn8']/div[@class='portlet-content']/div[@class=' portlet-content-container']/div[@class='portlet-body']/div[@class='journal-content-article']/div[@class='responsaveis'][2]/div[1]/span[2]"));
		System.out.println(elemento.getText());
		
		//Conteúdos Relacionados
		//Ícone da primeira cartilha
		elemento = browser.findElement(By.xpath("//div[@id='container-conteudo-relacionado']/div[2]/div[@class='esquerda']/img"));
		System.out.println(elemento.getAttribute("src") + "  " + elemento.getSize());
		
		//Texto do primeiro ícone
		elemento = browser.findElement(By.xpath("//div[@class='portlet-body']/div[@class='journal-content-article']/div[@id='container-conteudo-relacionado']/div[2]/div[@class='meio']/strong"));
		System.out.println(elemento.getText());
		
		//Texto do botão 'Ver'
		elemento = browser.findElement(By.xpath("//div[@id='container-conteudo-relacionado']/div[2]/div[@class='direita']/a[@class='link-btn']/span[@class='btn-secundario']"));
		System.out.println(elemento.getText());
		
		//logger.info("Verificar segundo ícone do card 'Conteúdo Relacionado'");
		//Ícone da segunda cartilha
		elemento = browser.findElement(By.xpath("//div[@class='portlet-body']/div[@class='journal-content-article']/div[@id='container-conteudo-relacionado']/div[3]/div[@class='esquerda']/img"));
		System.out.println(elemento.getAttribute("src") + "  " + elemento.getSize());
		
		//Texto so segundo ícone
		elemento = browser.findElement(By.xpath("//div[@class='portlet-body']/div[@class='journal-content-article']/div[@id='container-conteudo-relacionado']/div[3]/div[@class='meio']/strong"));
		System.out.println(elemento.getText());
		
		//Texto do botão 'Ver'
		elemento = browser.findElement(By.xpath("//div[@id='container-conteudo-relacionado']/div[3]/div[@class='direita']/a[@class='link-btn']/span[@class='btn-secundario']"));
		System.out.println(elemento.getText());
		
		return null;
	}
	
	public static void verificaElemento(boolean elemento, String mensagemLog) throws NoSuchElementException {
		
		if(elemento){
			
		  logger.info(mensagemLog);
		
		}else if(!elemento){
			
		  logger.error("Falha: " + elemento);
		}
	}
	
	public static void testaImagem(WebElement elemento){
		
		if(elemento.getSize() != null && elemento.getAttribute("src") != null){
			
			logger.info(elemento.getSize() + " " + elemento.getAttribute("src"));
		
		}else{
			
			logger.info("Imagem inexistente");
		}
		
	}
}
