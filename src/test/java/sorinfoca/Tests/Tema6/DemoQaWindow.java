package sorinfoca.Tests.Tema6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import sorinfoca.driver.BrowserManager;

import java.util.Set;

public class DemoQaWindow {
    static ChromeDriver driver = null;

    public static void main(String[] args) {
        navigateToDemoQaWindowPage();
        clickNewTabButton();
        closeBrowser();

    }

    public static void navigateToDemoQaWindowPage() {
        driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        System.out.println("Am deschis Demo QA window page");
    }

    public static void clickNewTabButton() {
        //get parent tab id
        String parentTab = driver.getWindowHandle();
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        //open new tab
        newTabButton.click();
        //get tab list ids
        Set<String> tabs = driver.getWindowHandles();
        for (String tab : tabs) {
            //switch focus to tab and get heading textclose the tab
            if(!tab.equals(parentTab)) {
                driver.switchTo().window(tab); //schimb focusul de la tabul pe care l-am deschis
                WebElement newTabHeading = driver.findElement(By.id("sampleHeading"));
                System.out.println("Text de pe noul tab" + newTabHeading.getText());
                driver.close();
            }
        }
        //swith back to parent tab to be able to make other actions
        driver.switchTo().window(parentTab);
        System.out.println("Am facut scroll catre submit button");
    }
    public static void closeBrowser() {
        driver.quit();
        System.out.println("Am inchis browserul");
    }

}

