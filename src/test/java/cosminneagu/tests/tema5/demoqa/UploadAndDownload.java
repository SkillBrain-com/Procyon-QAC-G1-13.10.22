package cosminneagu.tests.tema5.demoqa;

import cosminneagu.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAndDownload {
    public static void main(String[] args) {
        goToTheUploadAndDownload();
        //check if the method called goToTheUploadAndDownload is done successfully
    }

    public static void goToTheUploadAndDownload(){

        ChromeDriver driver = BrowserManager.createChromeDriver();

        driver.get("https://demoqa.com/upload-download");

        WebElement UploadAndDownloadSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[8]/span"));

        UploadAndDownloadSection.click();

        WebElement DownloadButton = driver.findElement(By.cssSelector("a[id='downloadButton']"));

        DownloadButton.click();

        driver.quit();

    }
}
