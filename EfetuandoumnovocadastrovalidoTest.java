// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class EfetuandoumnovocadastrovalidoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void efetuandoumnovocadastrovalido() {
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email_create")).click();
    driver.findElement(By.id("email_create")).sendKeys("thiagoteste48@gmail.com");
    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
    driver.findElement(By.id("id_gender1")).click();
    driver.findElement(By.id("customer_firstname")).click();
    driver.findElement(By.id("customer_firstname")).sendKeys("Thiago");
    driver.findElement(By.id("customer_lastname")).click();
    driver.findElement(By.id("customer_lastname")).sendKeys("teste");
    driver.findElement(By.id("passwd")).click();
    driver.findElement(By.id("passwd")).sendKeys("123456789");
    driver.findElement(By.id("days")).click();
    {
      WebElement dropdown = driver.findElement(By.id("days"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:21\\s+']")).click();
    }
    driver.findElement(By.id("days")).click();
    driver.findElement(By.id("months")).click();
    {
      WebElement dropdown = driver.findElement(By.id("months"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:December\\s']")).click();
    }
    driver.findElement(By.id("months")).click();
    driver.findElement(By.id("years")).click();
    {
      WebElement dropdown = driver.findElement(By.id("years"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:2000\\s+']")).click();
    }
    driver.findElement(By.id("years")).click();
    driver.findElement(By.id("newsletter")).click();
    driver.findElement(By.id("optin")).click();
    driver.findElement(By.id("company")).click();
    driver.findElement(By.id("company")).sendKeys("yaman");
    driver.findElement(By.id("address1")).click();
    driver.findElement(By.id("address1")).sendKeys("Rua dos Jatobás");
    driver.findElement(By.id("address2")).sendKeys("77");
    driver.findElement(By.id("city")).sendKeys("São Paulo");
    driver.findElement(By.id("postcode")).sendKeys("04349010");
    driver.findElement(By.id("id_state")).click();
    {
      WebElement dropdown = driver.findElement(By.id("id_state"));
      dropdown.findElement(By.xpath("//option[. = 'California']")).click();
    }
    driver.findElement(By.id("id_state")).click();
    driver.findElement(By.cssSelector(".columns-container")).click();
    driver.findElement(By.id("postcode")).click();
    driver.findElement(By.id("postcode")).click();
    {
      WebElement element = driver.findElement(By.id("postcode"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("postcode")).sendKeys("00000");
    driver.findElement(By.cssSelector(".required:nth-child(10)")).click();
    driver.findElement(By.cssSelector(".textarea")).click();
    driver.findElement(By.id("other")).click();
    driver.findElement(By.id("other")).sendKeys("teste ad cadastro");
    driver.findElement(By.cssSelector(".form-group:nth-child(13)")).click();
    driver.findElement(By.id("phone_mobile")).click();
    driver.findElement(By.id("phone_mobile")).sendKeys("11933458855");
    driver.findElement(By.id("phone_mobile")).sendKeys("11950623351");
    driver.findElement(By.id("address_alias")).click();
    driver.findElement(By.id("alias")).click();
    driver.findElement(By.cssSelector(".columns-container")).click();
    driver.findElement(By.id("alias")).click();
    driver.findElement(By.id("alias")).sendKeys("Ao lado do zoologico");
    driver.findElement(By.cssSelector(".submit")).click();
    driver.findElement(By.cssSelector("#submitAccount > span")).click();
    driver.findElement(By.cssSelector(".nav")).click();
    assertThat(driver.findElement(By.cssSelector(".account > span")).getText(), is("Thiago teste"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
