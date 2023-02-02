package alinatinca.teorie.ProiectTimeea.Demoqa;

import AlinaTinca.driver.BrowserManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

public class BooksStoreForScreenshot {
//    public static void main(String[] args) throws IOException {
//        ChromeDriver driver = BrowserManager.createChromeDriver();
//        try{
//            driver.get("https://demoqa.com");
//            System.out.println("Navigam la pagina");
//            List<WebElement> cards = driver.findElements(By.cssSelector(".card"));
//            WebElement sixthCard = cards.get(5);
//            System.out.println("Ne cauta cel de-al 6-lea card");
//
//            Actions actions = new Actions(driver);
//            actions.moveToElement(sixthCard).build().perform();
//            System.out.println("Facem un scroll pe pagina catre al 6 lea card");
//            sixthCard.click();
//            System.out.println("Da click pe al 6 lea card");
//
//            File file = driver.getScreenshotAs(OutputType.FILE);
//            File destFile = new File("\\src\\test\\java\\alinatinca\\teorie\\ProiectTimeea\\Demoqa\\Screenshot1.png");
//            FileUtils.copyFile(file, destFile);
//            System.out.println("Ne-a creat un screenshot pentru testul pe care l-am rulat!");
//            // Nu ne-a stocat nicaieri screenshotul facut desi testul s-a executat!
//
//        }finally {
//            driver.quit();
//        }
//        System.out.println("Finish");
//    }


    // Aici am incercat sa prind si o exceptie ca sa vedem cum putem sa o tratam!

    public static void main(String[] args) throws IOException {
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.createChromeDriver();
            driver.get("https://demoqa.com");
            System.out.println("Navigam la pagina");
            List<WebElement> cards = driver.findElements(By.cssSelector(".card"));
            WebElement sixthCard = cards.get(5);
            System.out.println("Ne cauta cel de-al 6-lea card");
            Actions actions = new Actions(driver);
            actions.moveToElement(sixthCard).build().perform();
            System.out.println("Facem un scroll pe pagina catre al 6 lea card");
            sixthCard.click();
            System.out.println("Da click pe al 6 lea card");
            System.out.println("In mod special vrem sa ne arunce o exceptie de tipul NoSuchElementException, ca sa o putem trata mai jos! ");
            throw new NoSuchElementException("Exceptie custom");

        } catch (Exception e) {
            if( driver != null) {
                File file = driver.getScreenshotAs(OutputType.FILE);
                //System.getProperty("user.dir") + String.format("/Logs/%s.png", fileName);
                File destFile = new File(System.getProperty("user.dir") + "\\src\\test\\java\\alinatinca\\teorie\\ProiectTimeea\\Demoqa\\Screenshot1.png.png");
                FileUtils.copyFile(file, destFile);
                System.out.println("Ne-a creat un screenshot pentru testul pe care l-am rulat!");
                System.out.println("In plus, pentru ca ne-a aruncat exceptia NoSuchElementException, ea a fost prinsa si tratata!"); }
                // Nu ne-a stocat nicaieri screenshotul facut desi testul s-a executat!
        } finally {
            if (driver != null) {
                driver.quit();}
        }
        System.out.println("Finish");
    }
}