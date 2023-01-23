package sorinfoca.Tests.Tema8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class JavaScriptRedirectPage {

    private WebDriver driver;

    public JavaScriptRedirectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage() {
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
    }

    public void clickRedirectButton(int index) {
        driver.findElements(By.id("delaygotobasic")).get(index).click();
    }

    public void switchToNewTab() {
        String originalHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        handles.remove(originalHandle);
        String newTab = handles.iterator().next();
        driver.switchTo().window(newTab);
    }
}
