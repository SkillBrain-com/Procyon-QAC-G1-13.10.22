package alinatinca.tests.Tema5.Demoqa.Elements;

<<<<<<< HEAD
import alinatinca.BrowserManager;
=======
import alinatinca.driver.BrowserManager;
>>>>>>> main
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
        WebElement uploadAndDownloadSection = driver.findElement(By.xpath("//span[text()='Upload and Download']"));
        //find the section called Upload and Download
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", uploadAndDownloadSection);
        //scroll to the Upload and Download Section
        uploadAndDownloadSection.click();
        //click on this button
        WebElement downloadButton = driver.findElement(By.cssSelector("a[id='downloadButton']"));
        //find the Download button
        Actions actions = new Actions(driver);
        //create an object of type Actions that takes as parameter the driver instance
        actions.moveToElement(downloadButton).build().perform();
        //scroll to the download button
        downloadButton.click();
        //click on this button
        driver.quit();
        //close the Chrome browser page
    }
}
