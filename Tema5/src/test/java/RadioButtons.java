import org.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        goToTheRadioButton();
    }

    public static void goToTheRadioButton(){
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        WebElement RadioButtonSection = driver.findElement(By.cssSelector("#item-2"));
        RadioButtonSection.click();
        WebElement yesRadio = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        yesRadio.click();
        System.out.println("The message displayed is: " + yesRadio.getText());
        driver.quit();



    }
}
