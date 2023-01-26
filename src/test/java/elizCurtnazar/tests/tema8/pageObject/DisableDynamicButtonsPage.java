package elizCurtnazar.tests.tema8.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DisableDynamicButtonsPage {

    ChromeDriver driver;
    WebDriverWait wait;
    Wait<WebDriver> fluentWait;
    public DisableDynamicButtonsPage(ChromeDriver driver) {
        this.driver = driver;
        //using WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        //using FluentWait
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(1))
                .pollingEvery(Duration.ofSeconds(8));
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "buttonmessage")
    WebElement buttonMessage;

   public void clickButtons() {
       List<WebElement> listButtons = driver.findElements(By.cssSelector("button[id*='button']"));
       Assert.assertEquals(buttonMessage.getText(), "Click Buttons In Order");
       listButtons.get(0).click();
        wait.until(ExpectedConditions.invisibilityOfAllElements(listButtons));
   }
}







//       Assert.assertEquals(buttonMessage.getText(), "Click Buttons In Order");
//       System.out.println("Start button of Disable Dynamic Buttons page clicked!");
//       listButtons.get(1).click();
////       wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("waitmessage")));
//
//       Assert.assertEquals(buttonMessage.getText(), "Click Buttons In Order");
//       System.out.println("One button of Disable Dynamic Buttons page clicked!");
//       Assert.assertEquals(buttonMessage.getText(), "Click Buttons In Order");
//       listButtons.get(2).click();
       //       wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("waitmessage")));

//       System.out.println("Two button of Disable Dynamic Buttons page clicked!");
//       Assert.assertEquals(buttonMessage.getText(), "Click Buttons In Order");
//       listButtons.get(3).click();
       //       wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("waitmessage")));

//       System.out.println("Three button of Disable Dynamic Buttons page clicked!");
//       Assert.assertEquals(buttonMessage.getText(), "All Clicked Buttons");


