package AndreeaG.tests.tema5.Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teofilursan.driver.BrowserManager;

public class CheckBox {


    public static void main(String[] args) {
            goToCheckbox();
    }



    public static void goToCheckbox(){
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        WebElement checkBox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]/span"));
        checkBox.click();
        WebElement chkBox= driver.findElement(By.cssSelector(".rct-checkbox svg[stroke='currentColor']"));
        chkBox.click();
        driver.quit();
}
}