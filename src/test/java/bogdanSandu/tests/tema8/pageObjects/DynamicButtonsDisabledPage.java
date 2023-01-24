package bogdanSandu.tests.tema8.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicButtonsDisabledPage {

    public DynamicButtonsDisabledPage(ChromeDriver driver){
        PageFactory.initElements(driver , this);
    }

    public static final String START_PAGE_URL = "https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html";

    public static final String BUTTON_START = "button00";

    public static final String BUTTON_ONE = "button01";

    public static final String BUTTON_TWO = "button02";

    public static final String BUTTON_THREE = "button03";

    public static final String MESSAGE = "buttonmessage";

    @FindBy(id = BUTTON_START)
    private WebElement startButton;

    @FindBy(id = BUTTON_ONE)
    private WebElement OneButton;

    @FindBy(id = BUTTON_TWO)
    private WebElement TwoButton;

    @FindBy(id = BUTTON_THREE)
    private WebElement ThreeButton;

    @FindBy(id = MESSAGE)
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
