import org.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {



        public static void main(String[] args) {
            goToTheLinks();

        }

        public static void goToTheLinks(){
            ChromeDriver driver = BrowserManager.createChromeDriver();
            driver.get("https://demoqa.com/links");
            WebElement LinksSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[6]"));
            LinksSection.click();
            WebElement CreatedLink = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p[3]/a"));
            CreatedLink.click();
            driver.get("https://demoqa.com/links");
            driver.quit();


        }
}
