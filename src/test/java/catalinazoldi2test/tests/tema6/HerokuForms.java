package catalinazoldi2test.tests.tema6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import zoldicatalina2.driver.BrowserMananger;



public class HerokuForms {
    static ChromeDriver driver = null;

    public static void main(String[] args) {
        navigateToHerokuFormsPage();
        scrollToSubmitButton();
        closeBrowser();
    }

    private static void navigateToHerokuFormsPage() {
    }

    public static void navigateToHerokuForms() {
        ChromeDriver driver = BrowserMananger.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        System.out.println("Am mers la HerokuForms page!");
    }
    public static void scrollToSubmitButton() {
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButton).build().perform();
        submitButton.click();
        System.out.println("Am facut scroll catre submit button");
    }
    public static void closeBrowser() {
        driver.quit();
        System.out.println("Am inchis browserul!");
    }
}

