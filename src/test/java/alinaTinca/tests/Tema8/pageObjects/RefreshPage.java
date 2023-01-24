package alinatinca.tests.Tema8.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RefreshPage {

    //Create the required attributes for this test case
    ChromeDriver driver;
    WebDriverWait wait;
    Wait<WebDriver> fluentWait;

    //Create the constructor that can define the required parameters for this test case
    public RefreshPage(ChromeDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
    }

    //Find the refresh button on the page
    @FindBy(id ="refreshdate")
    WebElement refreshButton;

    //Create a method that return the current timestamp
    public String getCurrentTimestamp(){
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("refreshdate")));
//        System.out.println("Condition has been executed!");
        return refreshButton.getText();
    }

    //Create a method that return the refreshed timestamp
    public String getRefreshedTimestamp(){
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("refreshdate")));
//        System.out.println("Condition has been executed!");
        return refreshButton.getText();
    }
}