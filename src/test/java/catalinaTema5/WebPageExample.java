package catalinaTema5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageExample {
    public static void main(String[] args) {
        ChromeDriver = BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");

        WebElement findTitle = driver.findelement(By.tagName("h1"));
        System.out.println("Title displays" + findTitle.getText());

        WebElement nextParagraphTitle = driver.findElement(By.ByXPath("/html/body/div/h2[2]"));
        System.out.println("Title is" + nextParagraphTitle.getText());

        WebElement firstLink = driver.findElement(By.id("basicpagetest"));
        System.out.println( firstLink.getText());
        firstLink.click();

        WebElement findSubtitle = driver.findElement(By.id("domattributes"));
        System.out.println("Title is" + findSubtitle.getText());


        WebElement dynamicattributes = driver.findElement(By.ByClassName("jsattributes"));
        System.out.println("Title is" + dynamicattributes());

        WebElement lastParagraph = driver.findElement(By.className("sub"));
        System.out.println( lastParagraph.getText());


        WebElement attributeButton = driver.findElement(By.className("styled-click-button"));
        attributeButton.click();






        driver.quit();



    }
 }


