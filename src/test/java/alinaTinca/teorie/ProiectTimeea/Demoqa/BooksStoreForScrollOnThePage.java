package alinatinca.teorie.ProiectTimeea.Demoqa;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class BooksStoreForScrollOnThePage {
    public static void main(String[] args) {
        ChromeDriver driver = BrowserManager.createChromeDriver();
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

        driver.quit();
        System.out.println("Finish");
    }
}