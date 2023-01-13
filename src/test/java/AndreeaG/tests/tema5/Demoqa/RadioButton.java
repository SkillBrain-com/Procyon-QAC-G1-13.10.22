package AndreeaG.tests.tema5.Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teofilursan.driver.BrowserManager;

public class RadioButton {

    public static void main(String[] args) {
        radioButton();
    }
    public static void radioButton(){
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        WebElement radioButtonYes = driver.findElement(By.xpath("//label[@class='custom-control-label' and @for='yesRadio']"));
        radioButtonYes.click();
        WebElement radioButtonImpressive =driver.findElement(By.xpath("//label[@class='custom-control-label' and @for='impressiveRadio']"));
        radioButtonImpressive.click();
        driver.quit();
    }
}
