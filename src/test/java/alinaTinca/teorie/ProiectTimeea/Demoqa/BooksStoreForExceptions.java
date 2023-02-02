package alinatinca.teorie.ProiectTimeea.Demoqa;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooksStoreForExceptions {

//Caz in care ne arunca exceptia!

//    public static void main(String[] args) {
//        ChromeDriver driver = BrowserManager.createChromeDriver();
//        driver.get("https://demoqa.com");
//        WebElement card = driver.findElement(By.className("card1234"));
//        //Nu va trece de aceasta linie pt ca arunca arunca exceptia NoSuchElementException - zice ca nu a reusit sa localizeze acest element "card1234"
//        card.click();
//        driver.quit();
//        System.out.println("Finish");
//    }

//Caz in care tratam exceptia!

    public static void main(String[] args) {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com");
        System.out.println("Navigam la pagina");

        try{
            WebElement card = driver.findElement(By.className("card1234"));
            //Prindem aceasta exceptie intr-un bloc de try cacth finally
            card.click();
        }
        catch (NoSuchElementException e){
            System.out.println("Nu mai zice ca nu a reusit sa localizeze elementul prompt Result, ci a prins exceptia si a tratat-o!");
        }finally {
            driver.quit();
        }
        System.out.println("Finish");
    }
}