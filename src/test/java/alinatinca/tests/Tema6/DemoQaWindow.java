package alinatinca.tests.Tema6;

import alinatinca.Utils.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teofilursan.driver.BrowserManager;

import java.util.Set;

//Ex3
public class DemoQaWindow {

    static ChromeDriver driver = null;

    public static void main(String[] args) {

    //Test1
        navigateToDemoQAWindowPage();
        clickOnNewTabButton();
        closeBrowser();

    //Test2
        navigateToDemoQAWindowPage();
        clickOnNewWindowButton();
        closeBrowser();

    //Test3
        navigateToDemoQAWindowPage();
        try{
            clickOnNewWindowMessageButton();
        }catch (NoSuchElementException e){
            FileUtils.takeScreenshot(driver, "new alert");
        }finally {
            closeBrowser();
        }

    }

    public static void navigateToDemoQAWindowPage() {
        driver = BrowserManager.createChromeDriver();
        //create the driver instance
        driver.get("https://demoqa.com/browser-windows");
        //go to Demoqa Windows page
        System.out.println("Demo QA window page has been opened!");
        //display the above message
    }

    public static void clickOnNewTabButton() {
        //get parent tab id
        String parentTab = driver.getWindowHandle();
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        //open new tab
        newTabButton.click();
        //get tab list id
        Set<String> tabs = driver.getWindowHandles();
        for (String tab : tabs) {
            //switch focus to new tab, get heading text and close the tab
            if (!tab.equals(parentTab)) {
                //switch focus to new tab
                driver.switchTo().window(tab);
                WebElement newTabHeading = driver.findElement(By.id("sampleHeading"));
                System.out.println("The text from new tab: " + newTabHeading.getText());
                driver.close();
            }
        }
        //switch back to parent tab to be able to make other actions
        driver.switchTo().window(parentTab);
        //switch to parent tab window
        System.out.println("Click on new tab button");
        //display the above message
    }

    public static void clickOnNewWindowButton() {
        String parentWindow = driver.getWindowHandle();
        //go to window which openes
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        //find the New Window button from the main window
        newWindowButton.click();
        //click on New Window button
        Set<String> newTabs = driver.getWindowHandles();
        for (String tab : newTabs) {
            //switch focus to new tab, get heading text and close the tab
            if (!tab.equals(parentWindow)) {
                //switch focus to new tab
                driver.switchTo().window(tab);
                WebElement newTabtex = driver.findElement(By.id("sampleHeading"));
                System.out.println(newTabtex.getText());
                driver.close();
            }
        }
        //switch back to parent tab to be able to make other actions
        driver.switchTo().window(parentWindow);
        //switch to parent tab window
        System.out.println("Click on New Window button");
        //display the above message
    }

    public static void clickOnNewWindowMessageButton(){
        WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));
        newWindowMessage.click();
        String parentWindow = driver.getWindowHandle();
        Set<String> newWindows = driver.getWindowHandles();
        for (String newWindow: newWindows) {
            if (!newWindow.equals(parentWindow)) {
                driver.switchTo().window(newWindow);
                break;
            }
        }
        //switch back to parent tab to be able to make other actions
        driver.switchTo().window(parentWindow);
        //switch to parent tab window
        System.out.println(driver.findElement(By.xpath("//body[text()='Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.']")).getText());
        //display the above message
        driver.close();
        //close the current driver instance
        System.out.println("Click on New Window Message button");
        //display the above message
    }

    public static void closeBrowser() {
        driver.quit();
        //close the driver instance
        System.out.println("The driver instance has been closed!");
        //display the above message
    }
}



