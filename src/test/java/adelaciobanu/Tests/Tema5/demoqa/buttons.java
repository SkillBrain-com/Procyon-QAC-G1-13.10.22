package adelaciobanu.Tests.Tema5.demoqa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {
}
    public static void main(String[] args) {
        goToButtons();
    }
    public static void goToButtons() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/elements");
        WebElement buttons = driver.findElement(By.xpath("//div[@Class='element-list collapse show']/ul/li[5]"));
        buttons.click();
        WebElement clickMeButtons = driver.findElement(By.xpath("//div[@class=\"mt-4\"][2]"));
        clickMeButtons.click();
        System.out.println("Acest buton are textul: " + clickMeButtons.getText());
        driver.quit();
    }
}