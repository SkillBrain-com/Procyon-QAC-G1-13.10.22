package catalinaTema5.DemoqaElements;

import catalinaTema5.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args){
        goToRadioButtonsPage();
 }

    public static  void goToRadioButtonsPage() {
     ChromeDriver driver = BrowserManager.createChromeDriver();
     driver.get("https://demoqa.com/radio-button");
        WebElement radioButtonNo = driver.findElement(By.xpath("//label[@class='custom-control-label disable' and @for='noRadio']"));
        radioButtonNo.click();
        WebElement radioButtonImpressive =driver.findElement(By.xpath("//label[@class='custom-control-label' and @for='impressiveRadio']"));
        radioButtonImpressive.click();
        driver.quit();
    }
}
