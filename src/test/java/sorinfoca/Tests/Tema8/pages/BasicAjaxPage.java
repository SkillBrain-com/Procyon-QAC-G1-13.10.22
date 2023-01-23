package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicAjaxPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasicAjaxPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void goToPage() {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
    }

    public void selectOption(String option) {
        Select select = new Select(driver.findElement(By.name("combo1")));
        select.selectByVisibleText(option);
    }

    public void clickCodeItInButton() {
        driver.findElement(By.name("combo2")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("body > div > div.centered > form > input.styled-click-button"), "#combo2 > option:nth-child(3)"));
    }

    public String getSelectedOption() {
        Select select = new Select(driver.findElement(By.name("combo2")));
        return select.getFirstSelectedOption().getText();
    }

    public boolean isOptionSelected(String option) {
        return getSelectedOption().equals(option);
    }
}

