package testes.menu.principal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import browsers.Navegadores;

public class AreasDeAtuacao {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    
    baseUrl = "http://www.mprj.mp.br/";
    driver = Navegadores.GoogleChrome(baseUrl);
    // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAreasDeAtuacao() throws Exception {
    driver.get(baseUrl + "/home");
    driver.findElement(By.cssSelector("span.texto-link")).click();
    driver.findElement(By.cssSelector("#layout_4 > a > span.texto-link > root > name")).click();
    assertEquals("Áreas de Atuação", driver.findElement(By.cssSelector("div.titulo-destaque.titulo-default")).getText());
    try {
      assertEquals("Áreas de Atuação", driver.findElement(By.cssSelector("div.titulo-destaque.titulo-default")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.titulo-destaque.titulo-default")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Cidadania\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Cidadania\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Cidadania\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Cível\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Cível\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Cível\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Consumidor\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Consumidor\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Consumidor\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Criminal\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Criminal\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Criminal\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Direitos Humanos e Minorias\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Direitos Humanos e Minorias\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Direitos Humanos e Minorias\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Educação\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Educação\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Educação\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Eleitoral\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Eleitoral\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Eleitoral\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Execução Penal\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Execução Penal\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Execução Penal\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Idoso e Pessoa com Deficiência\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Idoso e Pessoa com Deficiência\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Idoso e Pessoa com Deficiência\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Infância e Juventude\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Infância e Juventude\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Infância e Juventude\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Meio Ambiente\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Meio Ambiente\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Meio Ambiente\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Saúde\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Saúde\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Saúde\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Violência Doméstica\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Violência Doméstica\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Violência Doméstica\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Registro Civil de Nascimento e Documentação\"]")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Registro Civil de Nascimento e Documentação\"]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("img[alt=\"Imagem Área de Atuação Registro Civil de Nascimento e Documentação\"]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Cidadania\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Cível\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Consumidor\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Criminal\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Direitos Humanos e Minorias\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Educação\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Eleitoral\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Execução Penal\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Idoso e Pessoa com Deficiência\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Infância e Juventude\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Meio Ambiente\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Saúde\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Violência Doméstica\"]")).click();
    driver.get(baseUrl + "/conheca-o-mprj/areas-de-atuacao");
    driver.findElement(By.cssSelector("img[alt=\"Imagem Área de Atuação Registro Civil de Nascimento e Documentação\"]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
