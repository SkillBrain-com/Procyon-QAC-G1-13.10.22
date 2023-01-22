package alinaTinca.tests.Tema8.tests;

import alinatinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class JavaScriptRedirectsPageTests {

    ChromeDriver driver;

    public void getparagraph(){
        WebElement paragraph = driver.findElement(By.className("explanation"));
        System.out.println(paragraph.getText());
    }

    @Test(groups = "Test for desktop")
    public void clickOnFirstButtonForDesktop() {
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        System.out.println("JavaScript Redirects page has been opened on desktop!");

        WebElement firstButton = driver.findElement(By.id("delaygotobasic"));
        firstButton.click();
        System.out.println("The first button has been clicked!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        System.out.println("The 7 minutes have passed!");

        String parentWindow = driver.getWindowHandle();
        Set<String> newWindows = driver.getWindowHandles();
        for (String newWindow : newWindows) {
            if (!newWindow.equals(parentWindow)) {
                driver.switchTo().window(newWindow);
                break;
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("The following message appears on the new window: ");
        System.out.println(driver.findElement(By.xpath("//div[@class = 'explanation']/p")).getText());

        driver.close();
    }

    @Test(groups = "Test for mobile")
    public void clickOnFirstButtonForMobile() {
        driver = BrowserManager.createChromeDriverForMobile();
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        System.out.println("JavaScript Redirects page has been opened on mobile!");

        WebElement firstButton = driver.findElement(By.id("delaygotobasic"));
        firstButton.click();
        System.out.println("The first button has been clicked!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        System.out.println("The 7 minutes have passed!");

        String parentWindow = driver.getWindowHandle();
        Set<String> newWindows = driver.getWindowHandles();
        for (String newWindow : newWindows) {
            if (!newWindow.equals(parentWindow)) {
                driver.switchTo().window(newWindow);
                break;
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("The following message appears on the new window: ");
        System.out.println(driver.findElement(By.xpath("//div[@class = 'explanation']/p")).getText());

        driver.close();
    }

}
