import org.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicProperties {

    public static void main(String[] args) {
        goToTheDynamicProperties();

    }

    public static void goToTheDynamicProperties() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

        WebElement DynamicProprietiesSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[9]/span"));
        DynamicProprietiesSection.click();
        WebElement ColorChangeButton = driver.findElement(By.cssSelector("button[id='colorChange']"));
        ColorChangeButton.click();
        driver.quit();



    }
}
