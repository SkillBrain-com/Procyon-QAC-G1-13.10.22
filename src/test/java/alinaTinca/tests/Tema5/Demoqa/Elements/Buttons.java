package alinaTinca.tests.Tema5.Demoqa.Elements;

import AlinaTinca.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

    public static void main(String[] args) {
        goToTheButtons();
        //check if the method called goToTheButtons is done successfully

    }
    public static void goToTheButtons(){
        //create a method called goToTheButtons that goes to the Buttons sections and interacts with a button
        ChromeDriver driver = BrowserManager.createChromeDriver();
        //create and configure the Chrome browser page setting
        driver.get("https://demoqa.com/buttons");
        //go to the Demoqa URL
        WebElement ButtonsSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]"));
        //find the Buttons section
        ButtonsSection.click();
        //click on this section
        WebElement ClickMeButtons = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
        //find the last button called Click Me
        ClickMeButtons.click();
        //click on this button
        System.out.println("This button is called: " + ClickMeButtons.getText());
        //display the message from this button
        driver.quit();
        //close the Chrome browser page
    }
}
