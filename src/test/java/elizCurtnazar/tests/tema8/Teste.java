package elizCurtnazar.tests.tema8;

import elizCurtnazar.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Teste {

    ChromeDriver driver;

    @Test
    public void basicAjaxExample() {

        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        System.out.println("Inainte " + LocalDateTime.now());
        List <WebElement> selectCategory = driver.findElements(By.cssSelector("#combo1"));
        selectCategory.get(0).click();
        List <WebElement> selectLanguage = driver.findElements(By.name("language_id"));
        selectLanguage.get(0).click();
        WebElement codeInItButton = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions
                .elementToBeClickable(By.cssSelector(".styled-click-button")));
        System.out.println("Dupa " + LocalDateTime.now());
        codeInItButton.click();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1",
                "The input data is not displayed!");
        driver.quit();
    }

    public void
}

