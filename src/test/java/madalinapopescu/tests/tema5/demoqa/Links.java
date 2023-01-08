package madalinapopescu1.tests.tema5.demoqa;

import madalinapopescu1.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
    public static void main(String[] args) {
        goLinks();
    }
    public static void goLinks() {
        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/elements");
        WebElement links = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[6]"));
        links.click();
        driver.quit();
    }
}
