package alinaTinca.tests.Tema8.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class JavaScriptRedirectsPagePage {

    ChromeDriver driver;

    public JavaScriptRedirectsPagePage(ChromeDriver driver){
        this.driver = driver;
    }

    @FindBy(id = "delaygotobasic")
    WebElement firstButton;

    public void clickOnFirstButton(){
        firstButton.click();
//        System.out.println("The first button has been clicked!");
    }

    public void handleForFirstButton(){
        clickOnFirstButton();
        String parentWindow = driver.getWindowHandle();
        Set<String> newWindows = driver.getWindowHandles();
        for (String newWindow : newWindows) {
            if (!newWindow.equals(parentWindow)) {
                driver.switchTo().window(newWindow);
                break;
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("The following message appears on the new window: ");
        System.out.println(driver.findElement(By.xpath("//div[@class = 'explanation']/p")).getText());

        driver.close();
    }
}
