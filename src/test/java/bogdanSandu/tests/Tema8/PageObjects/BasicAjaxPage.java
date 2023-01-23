package bogdanSandu.tests.Tema8.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasicAjaxPage {

    public BasicAjaxPage(ChromeDriver driver){
        PageFactory.initElements(driver,this);
    }

    public static final String StartPage = "https://testpages.herokuapp.com/styled/basic-ajax-test.html";

    @FindBy(css ="#combo1 option")
    private List<WebElement> selectCategory;

    @FindBy(css ="#combo2 option")
    private  List<WebElement> selectLanguage;

    @FindBy(css ="input.styled-click-button")
    private WebElement button;

    @FindBy(id ="_valueid")
    private WebElement categorySelected;

    @FindBy(id ="_valuelanguage_id")
    private WebElement languageSelected ;

    public WebElement getButton() {
        return button;
    }

    public WebElement getCategorySelected() {
        return categorySelected;
    }

    public WebElement getLanguageSelected() {
        return languageSelected;
    }

    public List<WebElement> getSelectCategory() {
        return selectCategory;
    }

    public List<WebElement> getSelectLanguage() {
        return selectLanguage;
    }
}
