package AndreeaG.tests.tema6;

import AndreeaG.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuForms {
    static ChromeDriver driver = null;

    public static void main(String[] args) {
        navigateToHerokuFormsPage();
        //scrollToSubmitButton();
        //closeBrowser();
    }

    public static void navigateToHerokuFormsPage() {
        driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        driver.manage().window().maximize();
        System.out.println("Am deschis Heroku forms page!");
    }

    public static void basicHtmlFormFill(){
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Tyrone");
        System.out.println("username is: "+ username.getText());
    }

   /* public static void scrollToSubmitButton() {
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButton).build().perform();
        submitButton.click();
        System.out.println("Am facut scroll la submit button!");
    }

  /*  public static void closeBrowser() {
        driver.quit();
        System.out.println("Am inchis browserul!");
    }*/
}