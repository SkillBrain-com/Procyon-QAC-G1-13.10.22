package teofilursan.tests.seleniumpart1;

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
        System.out.println("Primul link are textul: "+firstLink.getText());
        firstLink.click();
        WebElement lastParagraph = driver.findElement(By.className("sub"));
        System.out.println("Ultimul paragraf are textul: " + lastParagraph.getText());
        WebElement indexLink = driver.findElement(By.xpath("//div[@class='page-navigation']//a"));
        indexLink.click();
        WebElement secondLink = driver.findElement(By.linkText("Element Attributes Examples"));
        secondLink.click();
        WebElement dynamicParagraph = driver.findElement(By.linkText("jsattributes"));
        System.out.println("Next-id is: " + dynamicParagraph.getAttribute("nextid"));
        WebElement attributeButton = driver.findElement(By.className("styled-click-button"));
        attributeButton.click();
        System.out.println("Next-id after click is: " + dynamicParagraph.getAttribute("nextid"));
        driver.quit();
    }
}
