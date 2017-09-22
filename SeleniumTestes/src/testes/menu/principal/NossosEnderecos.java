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
import browsers.Navegadores;

public class NossosEnderecos {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    
    baseUrl = "http://www.mprj.mp.br/";
    driver = Navegadores.GoogleChrome(baseUrl);
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNossosEnderecos() throws Exception {
    driver.get(baseUrl + "/home");
    driver.findElement(By.cssSelector("span.texto-link")).click();
    driver.findElement(By.cssSelector("#layout_16 > a > span.texto-link > root > name")).click();
    assertEquals("NOSSOS ENDEREÇOS", driver.findElement(By.cssSelector("div.titulo-destaque.titulo-default")).getText());
    try {
      assertEquals("NOSSOS ENDEREÇOS", driver.findElement(By.cssSelector("div.titulo-destaque.titulo-default")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.titulo-destaque.titulo-default")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("MAPA MPRJ", driver.findElement(By.xpath("div.i4ewOd-pzNkMb-tJHJj > div.i4ewOd-pzNkMb-r4nke-LS81yb di8rgd-TEhSn SfQLQb-fI6EEc > div.suEOdc.i4ewOd-pzNkMb-r4nke")).getAttribute("data-tooltip"));
    try {
      assertEquals("MAPA MPRJ", driver.findElement(By.cssSelector("div.suEOdc.i4ewOd-pzNkMb-r4nke")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.i4ewOd-pzNkMb-tJHJj")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("div.i4ewOd-pzNkMb-LgbsSe.pzNkMb-euCgFf-LgbsSe-Bz112c")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("div.i4ewOd-pzNkMb-LgbsSe.pzNkMb-euCgFf-LgbsSe-Bz112c")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.i4ewOd-pzNkMb-LgbsSe.pzNkMb-euCgFf-LgbsSe-Bz112c")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("div.i4ewOd-pzNkMb-n9oEIb.i4ewOd-pzNkMb-bMcfAe > div.i4ewOd-pzNkMb-LgbsSe")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("div.i4ewOd-pzNkMb-n9oEIb.i4ewOd-pzNkMb-bMcfAe > div.i4ewOd-pzNkMb-LgbsSe")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.i4ewOd-pzNkMb-n9oEIb.i4ewOd-pzNkMb-bMcfAe > div.i4ewOd-pzNkMb-LgbsSe")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("div.i4ewOd-pzNkMb-ornU0b-b0t70b-Bz112c")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("div.i4ewOd-pzNkMb-ornU0b-b0t70b-Bz112c")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.i4ewOd-pzNkMb-ornU0b-b0t70b-Bz112c")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("div.nJjxad-LgbsSe.nJjxad-m9bMae-LgbsSe")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("div.nJjxad-LgbsSe.nJjxad-m9bMae-LgbsSe")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.nJjxad-m9bMae-LgbsSe-n0tgWb-Q4BLdf")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("", driver.findElement(By.cssSelector("div.nJjxad-LgbsSe.nJjxad-bEDTcc-LgbsSe")).getText());
    try {
      assertEquals("", driver.findElement(By.cssSelector("div.nJjxad-LgbsSe.nJjxad-bEDTcc-LgbsSe")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.nJjxad-LgbsSe.nJjxad-bEDTcc-LgbsSe")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("Clique para abrir o MAPA com mais detalhes e a relação de endereços.", driver.findElement(By.linkText("Clique para abrir o MAPA com mais detalhes e a relação de endereços.")).getText());
    try {
      assertEquals("Clique para abrir o MAPA com mais detalhes e a relação de endereços.", driver.findElement(By.linkText("Clique para abrir o MAPA com mais detalhes e a relação de endereços.")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.linkText("Clique para abrir o MAPA com mais detalhes e a relação de endereços.")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
