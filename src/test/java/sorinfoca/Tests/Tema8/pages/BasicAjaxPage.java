package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicAjaxPage {
    private WebDriver driver;

    public BasicAjaxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void get() {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
    }

    public void selectOption(String option) {
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText(option);
    }

    public void clickCodeItInButton() {
        driver.findElement(By.id("codeitin")).click();
    }

    public String getSelectedOption() {
        Select select = new Select(driver.findElement(By.id("dropdown")));
        return select.getFirstSelectedOption().getText();
    }

    public boolean isOptionSelected(String option) {
        return getSelectedOption().equals(option);
    }
}

