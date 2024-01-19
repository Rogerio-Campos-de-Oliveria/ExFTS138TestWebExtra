package webtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class testgiulianaflores {
    WebDriver driver;
    JavascriptExecutor js;

    @BeforeMethod
    public void serUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        js = (JavascriptExecutor) driver;

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testAcessoProduto(){
        driver.get("https://www.giulianaflores.com.br/");


        driver.findElement(By.cssSelector(".owl-carousel:nth-child(1) .owl-item:nth-child(1) img")).click();
        driver.findElement(By.id("inputSearchAddress")).click();
        driver.findElement(By.id("inputSearchAddress")).sendKeys("03276110");
        driver.findElement(By.cssSelector(".itemAddress")).click();
        driver.findElement(By.cssSelector(".apply-button")).click();
        driver.findElement(By.cssSelector(".item:nth-child(1) > .product-item img")).click();
        driver.findElement(By.id("ContentSite_lbtBuy")).click();

        driver.findElement(By.cssSelector("li:nth-child(7) > .jPeriodRadio")).click();
        driver.findElement(By.id("btConfirmShippingData")).click();
        driver.findElement(By.id("ContentSite_lbtBuy")).click();
        driver.findElement(By.cssSelector(".jThisBasket")).click();
        driver.findElement(By.id("ContentSite_Basketcontrol1_rptBasket_ibtBuy_0")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".owl-item:nth-child(4) > li > a > img"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".owl-item:nth-child(4) > li > a > img")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".item:nth-child(1) > .product-item img"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".item:nth-child(1) > .product-item img")).click();
        js.executeScript("window.scrollTo(0,159)");
        {
            WebElement element = driver.findElement(By.id("ContentSite_lbtBuy"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("ContentSite_lbtBuy"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.id("ContentSite_lbtBuy")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector("li:nth-child(7) > .jPeriodRadio")).click();
        driver.findElement(By.id("btConfirmShippingData")).click();
        driver.findElement(By.id("ContentSite_lbtBuy")).click();
        driver.close();


    }
}
