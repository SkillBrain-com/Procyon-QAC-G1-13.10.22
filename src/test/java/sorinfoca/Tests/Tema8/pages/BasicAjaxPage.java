package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasicAjaxPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasicAjaxPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void goToPage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
    }

    public void selectOption(String option) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dropdown")));
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText(option);
    }

    public void clickCodeItInButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codeitin")));
        driver.findElement(By.id("codeitin")).click();
    }

    public String getSelectedOption() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dropdown")));
        Select select = new Select(driver.findElement(By.id("dropdown")));
        return select.getFirstSelectedOption().getText();
    }

    public boolean isOptionSelected(String option) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown")));
        Select select = new Select(driver.findElement(By.id("dropdown")));
        return select.getFirstSelectedOption().getText().equals(option);
    }
}

