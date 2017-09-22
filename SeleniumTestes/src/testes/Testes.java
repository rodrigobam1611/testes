package testes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browsers.Navegadores;

public class Testes {
	
	final static Logger logger = Logger.getLogger(Testes.class);
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		long tempoDecorrido = System.currentTimeMillis();
		
		driver = Navegadores.GoogleChrome("http://www.google.com.br");
	    logger.info("Abrindo o Google Chrome...");		
	    
	    WebElement searchBox = driver.findElement(By.name("q"));
		
		logger.info("Digitando na caixa de busca...");
		Thread.sleep(1000);
		searchBox.sendKeys("ChromeDriver");
		
		logger.info("Clicando no botão de Pesquisa...");
		Thread.sleep(1000);
		searchBox.submit();
		
		logger.info("Fechando o Google Chrome...");
		Thread.sleep(1000);
		
		//File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		//FileUtils.copyFile(scrFile, new File("C:\\Users\\rodrigo.silva\\Desktop\\screenshotTest\\screenshot.jpg"));
		//driver.close();
		
		tempoDecorrido = System.currentTimeMillis() - tempoDecorrido;
		 
		logger.info("O processo levou " + TimeUnit.MILLISECONDS.toSeconds(tempoDecorrido) + " segundos");
		 
		//System.out.println("O processo levou " + TimeUnit.MILLISECONDS.toSeconds(tempoDecorrido) + " segundos");
		JOptionPane.showMessageDialog(null, "O processo levou " + TimeUnit.MILLISECONDS.toSeconds(tempoDecorrido) + " segundos");
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Desenvolvimento\\liferay-62-EE-Eclipse\\workspace\\SeleniumTestes\\WebDrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		long tempoDecorrido2 = System.currentTimeMillis();
//		 
//		logger.info("Abrindo o Google Chrome...");
//		driver.get("http://www.google.com.br");
//		
//		WebElement searchBox2 = driver.findElement(By.name("q"));
//		
//		logger.info("Digitando na caixa de busca...");
//		Thread.sleep(1000);
//		searchBox2.sendKeys("ChromeDriver");
//		
//		logger.info("Clicando no botão de Pesquisa...");
//		Thread.sleep(1000);
//		searchBox2.submit();
//		
//		logger.info("Fechando o Google Chrome...");
//		Thread.sleep(1000);
//		
//		JOptionPane.showMessageDialog(null, "O processo levou " + TimeUnit.MILLISECONDS.toSeconds(tempoDecorrido2) + " segundos");
	}
}


