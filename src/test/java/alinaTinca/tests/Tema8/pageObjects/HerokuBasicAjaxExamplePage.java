package alinaTinca.tests.Tema8.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class HerokuBasicAjaxExamplePage {

    ChromeDriver driver;

    public HerokuBasicAjaxExamplePage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "combo1")
    WebElement chooseCategoryItem;

    public void getDesktopCategory() {
        chooseCategoryItem.click();
    }

    @FindBy(className = "styled-click-button")
    WebElement codeInItButton;

    public void clickOnCodeInIt(){
        codeInItButton.click();
    }

}

