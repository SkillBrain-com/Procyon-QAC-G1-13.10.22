import org.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
    public static void main(String[] args) {
        goToTheButtons();

        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/buttons");
        WebElement ButtonsSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]"));
        ButtonsSection.click();
        WebElement ClickMeButtons = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
        ClickMeButtons.click();
        System.out.println("This button is called: " + ClickMeButtons.getText());
        driver.quit();
    }

    public static void goToTheButtons() {
    }

}

