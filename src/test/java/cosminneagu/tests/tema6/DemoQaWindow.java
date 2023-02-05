package cosminneagu.tests.tema6;

import andreeaG.driver.BrowserManager;
import cosminneagu.Utils.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DemoQaWindow {
    static ChromeDriver driver = null;

    public static void main(String[] args) {
    goToDemoQAWindowPage();
    clickOnNewTabButton();
    clickOnNewWindowButton();

    try {
        clickOnNewWindowMessageButton();
    } catch (NoSuchElementException e) {
        FileUtils.takeScreenshot(driver, "no such element");
    } finally {
        closeBrowser();}

    }

    public static void goToDemoQAWindowPage(){
        driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        System.out.println("Am deschis Demo QA window page");
    }

    public static void clickOnNewTabButton(){
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
                System.out.println("Text de pe primul tab: " + newTabHeading.getText());
                driver.close();
            }
        }
        //switch back to parent tab to be able to make other actions
        driver.switchTo().window(parentTab);
        System.out.println("Am facut click pe new tab button");

    }

    public static void clickOnNewWindowButton(){
        //get parent tab id
        String parentTab = driver.getWindowHandle();
        WebElement newTabButton = driver.findElement(By.id("windowButton"));
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
                System.out.println("Text de pe al 2-lea tab: " + newTabHeading.getText());
                driver.close();
            }
        }
        //switch back to parent tab to be able to make other actions
        driver.switchTo().window(parentTab);
        System.out.println("Am facut click pe new window button");
    }

    public static void clickOnNewWindowMessageButton(){
        //get parent tab id
        String parentTab = driver.getWindowHandle();
        WebElement newTabButton = driver.findElement(By.id("messageWindowButton"));
        //open new tab
        newTabButton.click();
        //get tab list ids
        Set<String> tabs = driver.getWindowHandles();
        for (String tab : tabs) {
            //switch focus to new tab, get heading text and close the tab
            if (!tab.equals(parentTab)) {
                //switch focus to new tab
                driver.switchTo().window(tab);
                WebElement newWindowMessageTab = driver.findElement(By.tagName("body"));
                System.out.println("Text de pe al 3-lea tab: " + newWindowMessageTab.getText());
                driver.close();
            }
        }
        //switch back to parent tab to be able to make other actions
        driver.switchTo().window(parentTab);
        System.out.println("Am facut click pe new window message button!!");
    }

    public static void closeBrowser() {
        driver.quit();
        System.out.println("Am inchis browser-ul !");
    }
}
