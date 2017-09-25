package basico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browsers.Navegadores;

public class Basico {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = Navegadores.Firefox("http://www.google.com.br");
		
		WebElement element = driver.findElement(By.name("q"));
		
		Thread.sleep(2000);
		
		element.sendKeys("MPRJ");
		
		element.submit();
		
	}
}
