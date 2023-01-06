package alinaTinca.tests.Tema5.Demoqa.Elements;

import AlinaTinca.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAndDownload {

    public static void main(String[] args) {
        goToTheUploadAndDownload();
        //check if the method called goToTheUploadAndDownload is done successfully
    }

    public static void goToTheUploadAndDownload(){
        //create a method called goToTheUploadAndDownload that identifies a element and makes operation on it
        ChromeDriver driver = BrowserManager.createChromeDriver();
        //create and configure the Chrome browser page settings
        driver.get("https://demoqa.com/upload-download");
        //go to this URL
        WebElement UploadAndDownloadSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[8]/span"));
        //find the section called Upload and Download
        UploadAndDownloadSection.click();
        //click on this button
        WebElement DownloadButton = driver.findElement(By.cssSelector("a[id='downloadButton']"));
        //find the Download button
        DownloadButton.click();
        //click on this button
        driver.quit();
        //close the Chrome browser page
    }
}
