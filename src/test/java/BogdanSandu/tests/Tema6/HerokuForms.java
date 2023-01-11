package BogdanSandu.tests.Tema6;

import BogdanSandu.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HerokuForms {

    static ChromeDriver driver = null;

    public static void main(String[] args) {
        navigateToHerokuFormsPage();
        scrollToSubmitButton();
        closeBrowser();
    }

    public static void navigateToHerokuFormsPage() {
        driver = BrowserManager.createDriverAndGetPage();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        System.out.println("Am deschis Heroku Forms page!");
    }

    public static void scrollToSubmitButton() {
        WebElement submitButton = driver.findElement(By
                .xpath("//input[@type='submit']"));
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
