package alinaTinca.teorie.seleniumbasicpart2;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExceptions {

    public static void main(String[] args) {
        noSuchElementExcepsion();
        System.out.println("Am executat cu succes functia main.");
    }

    public static void noSuchElementExcepsion(){
        ChromeDriver driver = null;
        try{
            driver = BrowserManager.createChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/index.html");
            WebElement firstLink = driver.findElement(By.id("baicpagetest"));  //!!locatorul corect se scrie direct din prima nu in corpul de CATH
            firstLink.click();
        } catch (NoSuchElementException e) {
            System.out.println("Nu s-a gasit elementul: " + e.getMessage());
            WebElement firstLink = driver.findElement(By.id("baicpagetest"));
            firstLink.click();
        } finally {
            if (driver!=null){       //chiar daca ne arunca o exceptie avem posibilitatea sa inchidem driverul in mod programatic (si nu haotic fara try,catch si finallly) prin intermediul codului de try catch si finally
                driver.quit();
            }
        }
    }
}
