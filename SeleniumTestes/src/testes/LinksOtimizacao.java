package testes;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browsers.Navegadores;

public class LinksOtimizacao {
	
	final static Logger logger = Logger.getLogger(TesteNoticia.class);
	static WebDriver driver;

	public static void getUrlBrowser(){
		
		driver = Navegadores.GoogleChrome("https://developers.google.com/speed/pagespeed/insights/?hl=pt-BR&url=http%3A%2F%2Fwww.mprj.mp.br%2F");
		
		int total = 0;

		for (int i = 1; i < 20; i++) {
			
//			WebElement elemento = driver.findElement(By.xpath("//div[@class='urls']/div[@class='url-block'][2]/ul/li[" + i + "]/span[@class='url-external']"));
//			System.out.println(elemento.getAttribute("data-title"));
//			total = i;
		}
		
		//System.out.println("Total de Links Javascript: " + total);
		//System.out.println("\n\n");
		
		total = 0;
		
		for (int i = 1; i < 25; i++) {
			
//			WebElement elemento = driver.findElement(By.xpath("//div/div[@class='rule-details']/div[@class='urls']/div[@class='url-block'][3]/ul/li[" + i + "]/span[@class='url-external']"));
//			System.out.println(elemento.getAttribute("data-title"));
//			total = i;
		}
		
		//LerArquivoTxt.criarArquivotTxt(texto);
		//System.out.println("Total de Links CSS: " + total);
		//System.out.println("\n\n");
		
		total = 0;
		
//		for (int i = 1; i < 25; i++) {
//			
//			WebElement elemento = driver.findElement(By.xpath("//div[@class='goog-control rule-result failed expanded'][2]/div/div[@class='rule-details']/div[@class='urls']/div[@class='url-block']/ul"));
//			System.out.println(elemento.getAttribute("data-title"));
//			total = i;
//		}
//		
		//LerArquivoTxt.criarArquivotTxt(texto);
		
		//WebElement elemento2 = driver.findElement(By.xpath("//div/div[@class='rule-details']/div[@class='urls']/div[@class='url-block']/ul/li[1]/span[@class='url-external']"));
		
		WebElement elemento2 = driver.findElement(By.xpath("//div[@class='goog-control rule-result failed'][4]/a[@class='show-how-to-fix goog-zippy-header goog-zippy-collapsed']/span[@class='show']"));
		elemento2.click();
		
		elemento2 = driver.findElement(By.xpath("//div[@class='result-groups']/div[@class='result-group result-group-hover']/div[@class='result-group-body']/div[@class='severity-group']/div[@class='goog-control rule-result failed expanded']/div/div[@class='rule-details']/div[@class='urls']/div[@class='url-block']/ul/li[1]/span[@class='url-external']"));
		System.out.println(elemento2.getAttribute("data-title"));
		
	}
	
	public static void main(String[] args) {
		
		getUrlBrowser();
	}
	
}
