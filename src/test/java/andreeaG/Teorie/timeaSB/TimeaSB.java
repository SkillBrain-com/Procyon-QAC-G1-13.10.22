package andreeaG.Teorie.timeaSB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import teofilursan.driver.BrowserManager;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


@Test
public class TimeaSB {
    ChromeDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver = BrowserManager.createChromeDriver();

    }
@AfterMethod (alwaysRun = true)
    public void AfterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider(name="myFirstDataProvider")
    public Object[][] myFirstDataProvider() {
        return new Object[][]{
                {"/elements"},
                {"/forms"},
                {"alertsWindows"},
                //{"/widgets"},
               // {"/interaction"},
               // {"/books"}
        };
    }

    @Test(dataProvider ="myFirstDataProvider")
    public void dataProviderTest(String path){
        driver.get("https://demoqa.com/" + path);
        WebElement image = driver.findElement(By.xpath("/html/body/div[2]/header/a/img"));
        assertTrue(image.isDisplayed(), "Image is not displayed");
    }
@Test
    public void assertTest(){
        driver.get("https://demoqa.com/");
    List<WebElement> cards =driver.findElements(By.className("card"));
    assertEquals(cards.size(),6,"Wrong card size");
    }

    public void primulTest() {

        driver.get("https://demoqa.com/browser-windows");
        driver.quit();

    }
@Test
    public void doubleClick(){

    driver.get("https://demoqa.com/buttons");
    WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
    Actions actions =new Actions(driver);
    actions.doubleClick(doubleClick).build().perform();
    WebElement message = driver.findElement(By.id("doubleClickMessage"));
    assertEquals(message.getText(),"You have done a double click", "Double click was unsuccessful");
    }
    @Test
    public void rightClick(){

        SoftAssert softAssert = new SoftAssert();
        driver.get("https://demoqa.com/buttons");
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        softAssert.assertFalse(rightClickButton.isDisplayed(),"Right click button is not displayed");
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickButton).build().perform();

        WebElement message = driver.findElement(By.id("rightClickMessage"));
        softAssert.assertEquals(message.getText(),"You have done a right click", "Right click was unsuccessful");

        softAssert.assertAll();

    }

}


