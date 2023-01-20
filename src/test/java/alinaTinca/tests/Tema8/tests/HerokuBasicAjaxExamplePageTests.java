package alinaTinca.tests.Tema8.tests;

import alinatinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HerokuBasicAjaxExamplePageTests {

    ChromeDriver driver;

    public void getParagraph(){
        WebElement paragraph = driver.findElement(By.className("explanation"));
        System.out.println(paragraph.getText());
    }

    @Test
    public void getDesktopCategoryButton(){
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        System.out.println("Heroku Basic Ajax Example page has been opened!");

        Select chooseCategory = new Select(driver.findElement(By.id("combo1")));
        chooseCategory.selectByValue("2");
        System.out.println("The second item has been selected!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        System.out.println("The 7 minutes have passed!");

        WebElement codeInItButton = driver.findElement(By.className("styled-click-button"));
        codeInItButton.click();
        System.out.println("Code In It button has been clicked!");

        Assert.assertTrue(driver.getCurrentUrl().contains("Processed Form Details"),
                "The following message: Processed Form Details appears in the next page opened!");
        System.out.println("The informations about of the second selected item has been appeared in the next opened window wiht the following body:");
        System.out.println(driver.findElement(By.className("page-body")).getText());
    }

    public void getServerCategoryButton(){
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        System.out.println("Heroku Basic Ajax Example page has been opened!");
        Select chooseCategory = new Select(driver.findElement(By.id("combo1")));
        chooseCategory.selectByValue("3");
        System.out.println("The third item has been selected!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        System.out.println("The 7 minutes have passed!");

        WebElement codeInItButton = driver.findElement(By.className("styled-click-button"));
        codeInItButton.click();
        System.out.println("Code In It button has been clicked!");

        Assert.assertEquals(driver.getCurrentUrl(),
                "https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1",
                "The informations about of the third selected item has been displayed in the URL above with the following body:");
        System.out.println(driver.findElement(By.className("page-body")).getText());
    }
}
