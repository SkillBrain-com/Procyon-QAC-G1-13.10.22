package ancaMarian.tests.tema6;

import ancaMarian.driver.BrowserManager;
import ancaMarian.utils.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DemoQaWindow {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = BrowserManager.createDriver();
        navigateToDemoQAWindowPage(driver);
        clickOnNewTabButton(driver);
        clickOnNewWindowButton(driver);
        clickOnNewWindowMessageButton(driver);
        try {
            clickOnNonExistingTable(driver);
        } catch (NoSuchElementException e) {
            FileUtils.takeScreenshot(driver, "ElementNotFound");
            System.out.println("Nu s-a gasit elementul pe pagina. S-a salvat un screenshot.");
        } finally {
            BrowserManager.closeChromeDriver(driver);
        }
    }

    public static void navigateToDemoQAWindowPage(ChromeDriver driver) {
        driver.get("https://demoqa.com/browser-windows");
        System.out.println("Am deschis Demo QA window page!");
    }

    public static void clickOnNewTabButton(ChromeDriver driver) {
        //get parent tab id
        String parentTab = driver.getWindowHandle();
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        //open new tab
        newTabButton.click();
        //get tab list ids
        Set<String> tabs = driver.getWindowHandles();
        for (String tab : tabs) {
            //switch focus to new tab, get heading text and close the tab
            if (!tab.equals(parentTab)) {
                //switch focus to new tab
                driver.switchTo().window(tab);
                WebElement newTabHeading = driver.findElement(By.id("sampleHeading"));
                System.out.println("Text de pe noul tab: " + newTabHeading.getText());
                driver.close();
            }
        }
        //switch back to parent tab to be able to make other actions
        driver.switchTo().window(parentTab);
        System.out.println("Am facut click pe new tab button.");
    }

    public static void clickOnNewWindowButton(ChromeDriver driver) {
        String parentWindow = driver.getWindowHandle();
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                WebElement newTabHeading = driver.findElement(By.id("sampleHeading"));
                System.out.println("Text de pe noul window: " + newTabHeading.getText());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("Am facut click pe New Window.");
    }

    public static void clickOnNewWindowMessageButton(ChromeDriver driver) throws InterruptedException {
        String parentWindow = driver.getWindowHandle();
        WebElement newWindowMessageButton = driver.findElement(By.id("messageWindowButton"));
        newWindowMessageButton.click();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                Thread.sleep(2000);
//                WebElement newWindowMessageText = driver.findElement(By.tagName("body"));
//                System.out.println("Text de pe noul window message: " + newWindowMessageText.getText());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("Am facut click pe New Window Message.");
    }

    public static void clickOnNonExistingTable(ChromeDriver driver) {
        WebElement nonExistingTable = driver.findElement(By.id("table"));
        nonExistingTable.click();
    }
}
