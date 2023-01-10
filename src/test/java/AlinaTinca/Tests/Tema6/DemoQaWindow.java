package AlinaTinca.Tests.Tema6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import teofilursan.driver.BrowserManager;

import java.util.Set;
public class DemoQaWindow {

    static ChromeDriver driver = null;

    public static void main(String[] args) {
        navigateToDemoQAWindowPage();
        clickOnNewTabButton();
        closeBrowser();
    }

    public static void navigateToDemoQAWindowPage() {
        driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        System.out.println("Am deschis Demo QA window page!");
    }

    public static void clickOnNewTabButton() {
        //get parent tab id
        String parentTab = driver.getWindowHandle();
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        //open new tab
        newTabButton.click();
        //get tab list ids
        Set<String> tabs = driver.getWindowHandles();
        for (String tab : tabs) {
            //switch focus to new tab, get heading text and close the tab
            if(!tab.equals(parentTab)) {
                //switch focus to new tab
                driver.switchTo().window(tab);
                WebElement newTabHeading = driver.findElement(By.id("sampleHeading"));
                System.out.println("Text de pe noul tab " + newTabHeading.getText());
                driver.close();
            }
        }
        //switch back to parent tab to be able to make other actions
        driver.switchTo().window(parentTab);
        System.out.println("Am facut click pe new tab button");
    }

    public static void closeBrowser() {
        driver.quit();
        System.out.println("Am inchis browserul!");
    }
}

    //vezi pe Github codul scris pt aici

