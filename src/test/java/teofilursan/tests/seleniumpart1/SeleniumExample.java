package teofilursan.tests.seleniumpart1;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExample {

    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement firstLink = driver.findElement(By.id("basicpagetest"));
        firstLink.click();
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
