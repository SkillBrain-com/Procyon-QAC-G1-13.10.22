package AndreeaG.tests.tema6;

import AndreeaG.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuForms {
    static ChromeDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        navigateToHerokuFormsPage();
        usernameFill();
        passwordFill();
        textAreaFill();
        checkboxOneEnabling();
        checkboxTwoEnabling();
        //scrollToSubmitButton();
        //closeBrowser();
    }

    public static void navigateToHerokuFormsPage() {
        driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        driver.manage().window().maximize();
        System.out.println("Am deschis Heroku forms page!");
    }

    public static void usernameFill(){
        WebElement userNameField = driver.findElement(By.xpath("//input[@name='username']"));
        userNameField.sendKeys("Tyrone");
        System.out.println("username is set.");
    }

    public static void passwordFill(){
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys( "Paroliciu");
        System.out.println("Password is set.");
    }
    public static void textAreaFill(){
        WebElement commentField= driver.findElement(By.xpath("//textarea[@name='comments']"));
        commentField.sendKeys( "Commenting away for the comment box to get filled up");
        System.out.println("Comments are in.");
    }

    public static void checkboxOneEnabling() throws InterruptedException {
        WebElement checkboxOne = driver.findElement(By.cssSelector("input[value='cb1']"));
        checkboxOne.click();
        Thread.sleep(1000);
        System.out.println("Checkbox One is now clicked");
        if(checkboxOne.isSelected()){
            checkboxOne.click();
        }
    }
    public static void checkboxTwoEnabling() throws InterruptedException {
        WebElement checkboxTwo = driver.findElement(By.cssSelector("input[value='cb2']"));
        checkboxTwo.click();
        Thread.sleep(1000);
        System.out.println("Checkbox Two is now clicked");
        if (checkboxTwo.isSelected()) {
            checkboxTwo.click();
        }
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