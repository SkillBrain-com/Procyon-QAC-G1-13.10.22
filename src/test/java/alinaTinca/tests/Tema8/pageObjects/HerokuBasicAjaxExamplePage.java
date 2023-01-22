package alinaTinca.tests.Tema8.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class HerokuBasicAjaxExamplePage {

    ChromeDriver driver;

    public HerokuBasicAjaxExamplePage(ChromeDriver driver){
        this.driver = driver;
//        PageFactory.initElements(driver, this);
    }



    //pentru Categoriile de selectat
    @FindBy(id = "combo1")
    String chooseCategoryItem;

//    //incomplet
//    public void selectOption(String option) {
//        Select select = new Select(driver.findElement(By.id("combo1")));
//        select.selectByVisibleText(option);
//    }


    //pentru butonul CODEINIT
    @FindBy(className = "styled-click-button")
    WebElement codeInItButton;

    public void clickOnCodeInIt(){
        codeInItButton.click();
        System.out.println("Code In It button has been clicked!");
    }


    //pentru butonul GoToTheFormButton
    @FindBy(className = "styled-click-button")
    WebElement goBackToTheFormButton;

    public void clickOnGoToTheFormButton(){
        goBackToTheFormButton.click();
        System.out.println("Return on Basic Ajax page!");
    }

}

