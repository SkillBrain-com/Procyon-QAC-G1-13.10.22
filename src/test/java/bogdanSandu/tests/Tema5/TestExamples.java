package bogdanSandu.tests.Tema5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teofilursan.driver.BrowserManager;

public class TestExamples {
    public static void main(String[] args) {
        goToBasicWebPage();
    }
    public static void  goToBasicWebPage(){
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement firstLink = driver.findElement(By.id("basicpagetest"));
        System.out.println("Text of first link is: " + firstLink.getText());
        firstLink.click();
        WebElement lastParagraph = driver.findElement(By.className("sub"));
        System.out.println("Text of last link is: " + lastParagraph);
        WebElement indexLink = driver.findElement(By.xpath("//div"));
        indexLink.click();
        WebElement secondLink = driver.findElement(By.linkText("Element Attributes Exampl"));
        secondLink.click();
        driver.quit();
    }

}
