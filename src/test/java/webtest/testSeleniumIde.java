package webtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.compress.changes.ChangeSetResults;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class testSeleniumIde {
    WebDriver driver;

    @BeforeMethod
    public void serUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testAcessoProduto(){
        driver.get("https://www.extra.com.br");
        driver.findElement(By.cssSelector("span.Móveis")).click();


    }


}
