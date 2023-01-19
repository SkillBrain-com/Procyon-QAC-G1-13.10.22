package alinaTinca.teorie.teorieSeleniumBasic3.tests;

import alinaTinca.teorie.teorieSeleniumBasic3.pageObjects.EmagHomePage;
import alinatinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

public class EmagTests {

    ChromeDriver driver;

    //4
    @Test
    public void openLoginTest(){
        driver = BrowserManager.createChromeDriverWithOptions();
        //initialise driver with options defined above
        driver.get("https://www.emag.ro/");
        System.out.println("Inainte " + LocalDateTime.now());
        //IMPLICIT WAIT
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        //atunci cand dorim sa asteptam 5 secunde pana sa se afiseze butonul de accept DOAR CA IMPLICIT WAIT NU NE AJUTA PET ACEST CAZ

//        //Folosim EXPLICIT WAIT cu urmatoarea sintaxa:
//        WebElement acceptButton = new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.elementToBeClickable(By.className("js-accept")));
//        //browserul asteapta 5 sec pana cand acest element (butonul de accept) sa fie gasit si apoi clicuit


        //FLUENT WAIT
        //impreuna
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                //se creaza doar obiectul
                .withTimeout(Duration.ofSeconds(30))
                //durata maxima pana la care sa isi faca incercarea
                .pollingEvery(Duration.ofSeconds(5))
               // la ce durata sa faca din nou incercarea
                .ignoring(NoSuchElementException.class);  //asta nu se pune mereu; depinde de caz
                 // sa ignore exceptia ....
        //impreuna
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-accept")));
        //pana face operatia


        System.out.println("Dupa" + LocalDateTime.now());
        WebElement acceptButton = driver.findElement(By.className("js-accept"));
//        acceptButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", acceptButton);
        driver.quit();
    }

    //9
    //aceasta metoda este identica cu cea de mai sus
    @Test
    public void openLoginTestWithPageObject() {
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://www.emag.ro/");
        EmagHomePage emagHomePage = new EmagHomePage(driver);
        emagHomePage.clickOnAcceptButton();
        driver.quit();
    }

  //5
    @Test
    public void openMobileBrowser(){
        driver = BrowserManager.createChromeDriverForMobile();
        driver.get("https://www.emag.ro/");
        driver.quit();
        }


}
