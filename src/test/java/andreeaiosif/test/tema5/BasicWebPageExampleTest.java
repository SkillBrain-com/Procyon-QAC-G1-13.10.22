package andreeaiosif.test.tema5;

import andreeaiosif.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BasicWebPageExampleTest {

    public static void main(String[] args) {
        goToBasicWebPageAndCheckElements();
        table();
    }

    public static void goToBasicWebPageAndCheckElements() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement firstLink = driver.findElement(By.id("basicpagetest"));
        System.out.println("Primul link are textul : " + firstLink.getText());
        firstLink.click();
        WebElement lastParagraph = driver.findElement(By.className("sub"));
        System.out.println("Ultimul paragraph are textul : " + lastParagraph.getText());
        WebElement indexLink = driver.findElement(By.xpath("//div[@class='page-navigation']//a"));
        indexLink.click();
        WebElement secondLink = driver.findElement(By.linkText("Element Attributes Examples"));
        secondLink.click();
        WebElement dynamicParagraph = driver.findElement(By.id("jsattributes"));
        System.out.println("Next-id before click is: " + dynamicParagraph.getAttribute("nextid"));
        WebElement attributeButton = driver.findElement(By.className("styled-click-button"));
        attributeButton.click();
        System.out.println("Next-id after click is: "+ dynamicParagraph.getAttribute("nextid"));
        driver.quit();
    }

    public static void table() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement tableLink = driver.findElement(By.id("tablestest"));
        System.out.println("Primul link are textul : " + tableLink.getText());
        tableLink.click();
        WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        List<WebElement> firstColumns = rows.get(0).findElements(By.tagName("td"));
        for(WebElement row:rows) {
            System.out.println(row.findElements(By.tagName("td")));
        }
        driver.quit();
    }
}

