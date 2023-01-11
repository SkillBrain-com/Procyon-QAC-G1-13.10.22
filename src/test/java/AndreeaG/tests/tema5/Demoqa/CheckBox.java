package AndreeaG.tests.tema5.Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import teofilursan.driver.BrowserManager;

public class CheckBox {

    public static void main(String[] args) {
        goToCheckbox1();

    }

    public static void goToCheckbox1() {

        ChromeDriver driver = BrowserManager.createChromeDriver();
        driver.get("https://demoqa.com/checkbox");

        WebElement checkBox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/label/span[1]"));
        checkBox.click();


        WebElement expandPlusSign =driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div:first-of-type > div > button:first-of-type"));
        //WebElement expandPlusSign =driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div/button[1]"));
        expandPlusSign.click();

        driver.quit();


    }

            }



