package madalinapopescu1.tests.tema5.demoqa;

import madalinapopescu1.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
    public static void main(String[] args) {
        goToButtons();
    }

    public static void goToButtons() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/elements");
        WebElement buttons = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]"));
        buttons.click();
        WebElement ClickMeButtons = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
        ClickMeButtons.click();
        System.out.println("Acest buton are textul: " + ClickMeButtons.getText());
        driver.quit();
    }
}
