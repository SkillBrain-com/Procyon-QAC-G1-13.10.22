package sorinfoca.Tests.Tema8.TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class TestPages {
    private WebDriver driver;
    private WebDriverWait wait;

    private ChromeOptions mobileEmulation() {
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Nexus 5");
        ChromeOptions mobileOptions = new ChromeOptions();
        mobileOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        return mobileOptions;
    }

    private ChromeOptions desktopEmulation() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return options;
    }

    @Test
    public void testBasicAjax() {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown")));
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText("Option 2");
        driver.findElement(By.id("codeit")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("content")));
        String actualText = driver.findElement(By.id("content")).getText();
        String expectedText = "Option 2";
        assertEquals(actualText, expectedText);
    }

    @Test
    public void testJavaScriptRedirect() {
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        String originalHandle = driver.getWindowHandle();
        driver.findElement(By.id("redirect")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://testpages.herokuapp.com/styled/redirect-destination.html";
        assertEquals(actualUrl, expectedUrl);
    }

    @Test
    public void testRefresh() {
        driver.get("https://testpages.herokuapp.com/styled/refresh");
        long originalTimestamp = Long.parseLong(driver.findElement(By.id("timestamp")).getText());
        driver.navigate().refresh();
        wait.until(ExpectedConditions.textToBe(By.id("timestamp"), String.valueOf(originalTimestamp + 1)));
        long updatedTimestamp = Long.parseLong(driver.findElement(By.id("timestamp")).getText());
        assertEquals(Instant.ofEpochMilli(updatedTimestamp), Instant.ofEpochMilli(originalTimestamp + 1), String.valueOf(2000));
    }

    @Test
    public void testDynamicButtonsSimple() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
        List<WebElement> buttons = driver.findElements(By.xpath("//button[@class='btn']"));
        for (WebElement button : buttons) {
            button.click();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        String actualMessage = driver.findElement(By.id("message")).getText();
        String expectedMessage = "All buttons have been pressed";
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testDynamicButtonsDisabled() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
        List<WebElement> buttons = driver.findElements(By.xpath("//button[@class='btn']"));
        for (WebElement button : buttons) {
            button.click();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        String actualMessage = driver.findElement(By.id("message")).getText();
        String expectedMessage = "All buttons have been pressed";
        assertEquals(actualMessage, expectedMessage);
    }
}

