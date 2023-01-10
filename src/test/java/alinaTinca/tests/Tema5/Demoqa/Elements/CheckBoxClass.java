package alinaTinca.tests.Tema5.Demoqa.Elements;

import AlinaTinca.BrowserManagerClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClass {

    public static void main(String[] args) {
        goToTheCheckBox();
        //check if the method called goToChechBox is done successfully
    }
    public static void goToTheCheckBox(){
        //create a method called goToTheCheckBox that goes to this section and idetifies one element and make operation on it
        ChromeDriver driver = BrowserManagerClass.createChromeDriver();
        //create and configure the Chome browser page settings
        driver.get("https://demoqa.com/checkbox");
        //go to the Demoaq URL
        WebElement CheckBoxSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]/span"));
        //find the section called Check Box
        CheckBoxSection.click();
        //click on the Check Box section
        WebElement checkBox = driver.findElement(By.cssSelector(".rct-checkbox svg[stroke='currentColor']"));
        //find the box asignated to the field called Home
        checkBox.click();
        //click on that box
        driver.quit();
        //close the Chrome browser page
    }
}

