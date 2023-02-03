package alinatinca.teorie.ProiectTimeea.Demoqa;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windows {
    public static void main(String[] args) {
        firstWindow();
    }

    public static void firstWindow() {
        ChromeDriver driver = null;
        driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        System.out.println("Navigheaza la pagina");
        String parentTab = driver.getWindowHandle();
        WebElement firstButton = driver.findElement(By.id("tabButton"));
        firstButton.click();
        System.out.println("Da clic pe primul buton si navigheaza catre un nou tab");
        Set<String> tabs = driver.getWindowHandles();
        for(String tab: tabs){
            //schimba focusul pe tabul nou
            if(!tab.equals(parentTab)){
                driver.switchTo().window(tab);
                WebElement newTabHeading = driver.findElement(By.id("sampleHeading"));
                //gaseste textul afisat in noul tab
                System.out.println("Textul de pe noul tab este: " + newTabHeading.getText());
                driver.close();
                //inchide noul tab deschis
            }
        }
        driver.switchTo().window(parentTab);
        //revine focusul pe tabul initial (parentTab)
        System.out.println("Am facut clic din nou pe primul buton!");
        driver.quit();
    }
}