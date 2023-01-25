package andreeaG.tests.tema8.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicAjaxPage {
    ChromeDriver driver;
    WebDriverWait wait;

    public BasicAjaxPage (ChromeDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id= "combo1")
    WebElement category;

    @FindBy(id= "combo2")
    Select language;

    @FindBy(name ="submitButton")
    WebElement submitButton;


    public void selectCategory (String categoryName){
        Select category = new Select (this.category);
        category.selectByVisibleText(categoryName);
    }


    public void selectLanguage (String languageName) {
        language.selectByVisibleText(languageName);
    }

    public void clickOnSubmitButton (){

    }
}
