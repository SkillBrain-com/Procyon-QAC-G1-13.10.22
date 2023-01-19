package teofilursan.seleniumpart2.tests.seleniumpart1;

import teofilursan.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExampleTest {

    public static void main(String[] args) {
        basicPageTest();
    }

    public static void basicPageTest() {
        WebDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement firstLink = driver.findElement(By.id("basicpagetest"));
        firstLink.click();
        System.out.println("Current url is : " + driver.getCurrentUrl());
        driver.quit();
    }
}
