package bogdanSandu.tests.Tema5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HerokuAppTests {
    private static ChromeDriver driver = null;
    HerokuAppTests(String url, ChromeDriver driver){
        HerokuAppTests.driver = driver;
        driver.get(url);
    }
    public void returnPage(){
        WebElement pageReturn = driver.findElement(By.linkText("Index"));
        pageReturn.click();
    }

    //Tests for first link
    public void firstLinkOpen(){
        WebElement firstLink = driver.findElement(By.id("basicpagetest"));
        firstLink.click();
    }
    public void getFirstLinkTitle(){
        WebElement linkTitle = driver.findElement(By.xpath("//*[@id=\"basicpagetest\"]"));
        System.out.println("First link title is: " + linkTitle.getText());
    }
    public void getFirstLinkText(){
        WebElement linkText = driver.findElement(By.cssSelector("body > div > div.explanation"));
        System.out.println("First text is: " + linkText.getText());
    }
    public void getFirstParagraph(){
        WebElement paragraph = driver.findElement(By.id("para1"));
        System.out.println("First paragraph is: " + paragraph.getText());
    }

    //Tests for second link
    public void secondLinkOpen(){
        WebElement secondLink = driver.findElement(By.id("elementattributestest"));
        secondLink.click();
    }
    public void getSecondLinkTitle(){
        WebElement secondPageTitle = driver.findElement(By.id("elementattributestest"));
        System.out.println("Second link title is: " + secondPageTitle.getText());
    }
    public void getSecondtLinkText(){
        WebElement linkText = driver.findElement(By.cssSelector("body > div > div.explanation > p"));
        System.out.println("Second link text is: " + linkText.getText());
    }

    //Tests for third link
    public void thirdLinkOpen(){
        WebElement thirdLink = driver.findElement(By.id("findbytest"));
        thirdLink.click();
    }
    public void getThirdLinkTitle(){
        WebElement thirdLinkPageTitle = driver.findElement(By.xpath("//*[@id=\"findbytest\"]"));
        System.out.println("Third link title is: " + thirdLinkPageTitle.getText());
    }

    public void getLinksFromList(){
        List<WebElement> allLinks = driver.findElements(By.tagName("li"));
        System.out.println("Number of Links in the Page is: " + allLinks.size());
        for (WebElement allLink : allLinks) {
            System.out.println(allLink.getText());
        }
    }
    //Tests for 4th link
    public void fourthLinkOpen(){
        WebElement fourthLink = driver.findElement(By.id("tablestest"));
        fourthLink.click();
    }
    public void getFourthLinkTitle(){
        WebElement fourthLinkPageTitle = driver.findElement(By.cssSelector("div h1"));
        System.out.println("Fourth link title is: " + fourthLinkPageTitle.getText());
    }
    public void getInfoForTable(){
        WebElement fourthLinkTable = driver.findElement(By.id("tablehere"));
        List<WebElement> tableRows = driver.findElements(By.cssSelector("#tablehere table tr"));
        for (int i = 0;i<tableRows.size();i++){
            WebElement currentRow = tableRows.get(i);
            if (i == 0){
                List<WebElement> firstRowColumns = currentRow.findElements(By.cssSelector("th"));
                System.out.println("First Header: " + firstRowColumns.get(0).getText());
                System.out.println("Second Header: " + firstRowColumns.get(1).getText());
            } else {
                List<WebElement> currentColumns = currentRow.findElements(By.cssSelector("td"));
                System.out.println("Text from row " + (i + 1) + ", column 1: " + currentColumns.get(0).getText());
                System.out.println("Text from row " + (i + 1) + ", column 2: " + currentColumns.get(1).getText());
            }
        }
    }
}
