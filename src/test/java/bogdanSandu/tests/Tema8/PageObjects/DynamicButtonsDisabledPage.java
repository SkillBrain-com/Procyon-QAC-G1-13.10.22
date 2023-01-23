package bogdanSandu.tests.Tema8.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicButtonsDisabledPage {

    public DynamicButtonsDisabledPage(ChromeDriver driver){
        PageFactory.initElements(driver , this);
    }

    public static final String StartPage = "https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html";

    public static final String ButtonStart = "button00";

    public static final String ButtonOne = "button01";

    public static final String ButtonTwo = "button02";

    public static final String ButtonThree = "button03";

    public static final String Message = "buttonmessage";

    @FindBy(id = ButtonStart)
    private WebElement startButton;

    @FindBy(id = ButtonOne)
    private WebElement OneButton;

    @FindBy(id = ButtonTwo)
    private WebElement TwoButton;

    @FindBy(id = ButtonThree)
    private WebElement ThreeButton;

    @FindBy(id = Message)
    private WebElement message;

    public WebElement getStartButton() {
        return startButton;
    }

    public WebElement getOneButton() {
        return OneButton;
    }

    public WebElement getTwoButton() {
        return TwoButton;
    }

    public WebElement getThreeButton() {
        return ThreeButton;
    }

    public WebElement getMessage() {
        return message;
    }
}
