package alinaTinca.tests.Tema8.tests;

import alinaTinca.tests.Tema8.pageObjects.HerokuBasicAjaxExamplePage;
import alinatinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
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

    @Test(groups = "Test for desktop")
    public void getWebCategoryButtonForDesktop(){
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        System.out.println("Heroku Basic Ajax Example page has been opened on desktop!");

        HerokuBasicAjaxExamplePage herokuBasicAjaxExamplePage = PageFactory.initElements(driver, HerokuBasicAjaxExamplePage.class);
//incomplet
        Select chooseCategory = new Select(driver.findElement(By.id("combo1")));
        chooseCategory.selectByValue("1");


        System.out.println("Web item has been selected!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        System.out.println("The 7 minutes have passed!");

        WebElement codeInItButton = driver.findElement(By.className("styled-click-button"));
        codeInItButton.click();
        System.out.println("Code In It button has been clicked!");

        Assert.assertEquals(driver.getCurrentUrl(),
                "https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1",
                "The informations about Web item has been displayed in the URL above with the following body:");
        System.out.println(driver.findElement(By.className("page-body")).getText());

        WebElement goBackToTheFormButton = driver.findElement(By.className("styled-click-button"));
        goBackToTheFormButton.click();

        driver.quit();
    }

    @Test(groups = "Test for mobile")
    public void getWebCategoryButtonForMobile(){
        driver = BrowserManager.createChromeDriverForMobile();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        System.out.println("Heroku Basic Ajax Example page has been opened on iPhone X!");

        Select chooseCategory = new Select(driver.findElement(By.id("combo1")));
        chooseCategory.selectByValue("1");
        System.out.println("Web item has been selected!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        System.out.println("The 7 minutes have passed!");

        WebElement codeInItButton = driver.findElement(By.className("styled-click-button"));
        codeInItButton.click();
        System.out.println("Code In It button has been clicked!");

        Assert.assertEquals(driver.getCurrentUrl(),
                "https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1",
                "The informations about Web item has been displayed in the URL above with the following body:");
        System.out.println(driver.findElement(By.className("page-body")).getText());

        WebElement goBackToTheFormButton = driver.findElement(By.className("styled-click-button"));
        goBackToTheFormButton.click();

        driver.quit();
    }

    @Test(groups = "Test for desktop")
    public void getDesktopCategoryButtonForDesktop(){
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        System.out.println("Heroku Basic Ajax Example page has been opened on desktop!");

        Select chooseCategory = new Select(driver.findElement(By.id("combo1")));
        chooseCategory.selectByValue("2");
        System.out.println("Desktop item has been selected!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        System.out.println("The 7 minutes have passed!");

        WebElement codeInItButton = driver.findElement(By.className("styled-click-button"));
        codeInItButton.click();
        System.out.println("Code In It button has been clicked!");

        Assert.assertEquals(driver.getCurrentUrl(),
                "https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1",
                "The informations about Desktop item has been displayed in the URL above with the following body:");
        System.out.println(driver.findElement(By.className("page-body")).getText());

        WebElement goBackToTheFormButton = driver.findElement(By.className("styled-click-button"));
        goBackToTheFormButton.click();

        driver.quit();
    }

    @Test(groups = "Test for mobile")
    public void getDesktopCategoryButtonForMobile(){
        driver = BrowserManager.createChromeDriverForMobile();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        System.out.println("Heroku Basic Ajax Example page has been opened on iPhone X!");

        Select chooseCategory = new Select(driver.findElement(By.id("combo1")));
        chooseCategory.selectByValue("2");
        System.out.println("Desktop item has been selected!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        System.out.println("The 7 minutes have passed!");

        WebElement codeInItButton = driver.findElement(By.className("styled-click-button"));
        codeInItButton.click();
        System.out.println("Code In It button has been clicked!");

        Assert.assertEquals(driver.getCurrentUrl(),
                "https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1",
                "The informations about Desktop item has been displayed in the URL above with the following body:");
        System.out.println(driver.findElement(By.className("page-body")).getText());

        WebElement goBackToTheFormButton = driver.findElement(By.className("styled-click-button"));
        goBackToTheFormButton.click();

        driver.quit();
    }

    @Test(groups = "Test for desktop")
    public void getServerCategoryButtonForDesktop(){
        driver = BrowserManager.createChromeDriverWithOptions();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        System.out.println("Heroku Basic Ajax Example page has been opened on desktop!");
        Select chooseCategory = new Select(driver.findElement(By.id("combo1")));
        chooseCategory.selectByValue("3");
        System.out.println("Server item has been selected!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        System.out.println("The 7 minutes have passed!");

        WebElement codeInItButton = driver.findElement(By.className("styled-click-button"));
        codeInItButton.click();
        System.out.println("Code In It button has been clicked!");

        Assert.assertEquals(driver.getCurrentUrl(),
                "https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1",
                "The informations about of Server item has been displayed in the URL above with the following body:");
        System.out.println(driver.findElement(By.className("page-body")).getText());

        WebElement  goBackToTheFormButton = driver.findElement(By.className("styled-click-button"));
        goBackToTheFormButton.click();

        driver.quit();
    }

    @Test(groups= "Test for mobile")
    public void getServerCategoryButtonForMobile(){
        driver = BrowserManager.createChromeDriverForMobile();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        System.out.println("Heroku Basic Ajax Example page has been opened on iPhone X!");
        Select chooseCategory = new Select(driver.findElement(By.id("combo1")));
        chooseCategory.selectByValue("3");
        System.out.println("Server item has been selected!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        System.out.println("The 7 minutes have passed!");

        WebElement codeInItButton = driver.findElement(By.className("styled-click-button"));
        codeInItButton.click();
        System.out.println("Code In It button has been clicked!");

        Assert.assertEquals(driver.getCurrentUrl(),
                "https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1",
                "The informations about Server item has been displayed in the URL above with the following body:");
        System.out.println(driver.findElement(By.className("page-body")).getText());

        WebElement  goBackToTheFormButton = driver.findElement(By.className("styled-click-button"));
        goBackToTheFormButton.click();

        driver.quit();
    }
}
