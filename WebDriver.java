import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class SK9SDATest {
  private WebDriver driver;

  @BeforeEach
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanss\\Desktop\\sda\\Kody\\SdaSk9Selenium\\src\\main\\resources\\chromedriver.exe");
    driver = new ChromeDriver();
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void sK9SDA() {
    // Test name: SK9 - SDA
    // Step # | name | target | value
    // 1 | open | https://sdacademy.dev/ | 
    // Otevreni SDA stanky
    driver.get("https://sdacademy.dev/");
    // 2 | setWindowSize | 1900x1100 | 
    // Roztazeni okna do pozadovanych rozmeru
    driver.manage().window().setSize(new Dimension(1900, 1100));
    driver.findElement(By.id("cookiescript_accept")).click();
    // 3 | click | css=#menu-item-34381 > a |
    driver.findElement(By.cssSelector("#menu-item-34381 > a")).click();
    // 4 | type | name=form-user-name | Petr Novak
    driver.findElement(By.name("form-user-name")).sendKeys("Petr Novak");
    // 5 | type | name=form-user-phone | 542353535
    driver.findElement(By.name("form-user-phone")).sendKeys("542353535");
    // 6 | type | name=form-user-email | afgfawfaw@afwfawf.cz
    driver.findElement(By.name("form-user-email")).sendKeys("afgfawfaw@afwfawf.cz");
    // 7 | type | name=form-user-message | aggeg4atrhfhcghghgchchcfchfhc
    driver.findElement(By.name("form-user-message")).sendKeys("aggeg4atrhfhcghghgchchcfchfhc");
    // 8 | click | css=.sda-input-container:nth-child(6) .wpcf7-list-item-label | 
    driver.findElement(By.cssSelector(".sda-input-container:nth-child(6) .wpcf7-list-item-label")).click();
    Assertions.assertEquals("Contact:", driver.findElement(By.xpath("/html/body/section[1]/div/aside/h4")).getText());
    // 9 | close |  |
    driver.close();
  }
}
