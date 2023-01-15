package cosminneagu.teorie.demoqa;

import cosminneagu.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksImages {
    public static void main(String[] args) {
        goToTheBrokenLinksImages();

    }

    public static void goToTheBrokenLinksImages(){

        ChromeDriver driver = BrowserManager.createChromeDriver();

        driver.get("https://demoqa.com/broken");

        WebElement BrokenLinksImagesSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[7]/span"));
        BrokenLinksImagesSection.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        WebElement lastLink = driver.findElement(By.xpath("//a[@href='http://the-internet.herokuapp.com/status_codes/500']"));
        lastLink.click();
        driver.get("https://demoqa.com/broken");
        driver.quit();
    }
}
