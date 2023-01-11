import org.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    public static void main(String[] args) {
        goToTheCheckBox();

}

    public static void goToTheCheckBox() {
        ChromeDriver driver = BrowserManager.createChromeDriver();

        driver.get("https://demoqa.com/checkbox");

        WebElement CheckBoxSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]/span"));
        CheckBoxSection.click();

        WebElement checkBox = driver.findElement(By.cssSelector(".rct-checkbox svg[stroke='currentColor']"));
        checkBox.click();
        driver.quit();
    }
    }
