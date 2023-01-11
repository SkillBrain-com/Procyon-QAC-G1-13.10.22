package AndreeaG.tests.tema5.Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teofilursan.driver.BrowserManager;

public class RadioButton {

    public static void main(String[] args) {

        radioButton();

    }

    public static void radioButton(){


        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        WebElement radioButtonYes = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
        WebElement radioButtonImpressive =driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
        radioButtonYes.click();
        radioButtonImpressive.click();


        //driver.quit();



    }








}
