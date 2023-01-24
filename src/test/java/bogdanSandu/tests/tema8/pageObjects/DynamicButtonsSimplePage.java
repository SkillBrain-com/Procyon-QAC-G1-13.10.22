package bogdanSandu.tests.tema8.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicButtonsSimplePage {

    public DynamicButtonsSimplePage(ChromeDriver driver){

        PageFactory.initElements(driver , this);
    }

    public static final String START_PAGE_URL ="https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html";

    public static final String START_BUTTON = "button00";

    public static final String BUTTON_ONE = "button01";

    public static final String BUTTON_TWO = "button02";

    public static final String BUTTON_THREE = "button03";

    public static final String MESSAGE = "buttonmessage";

    @FindBy(id = START_BUTTON)
    private WebElement startButton;

    @FindBy(id = BUTTON_ONE)
    private WebElement oneButton;

    @FindBy(id = BUTTON_TWO)
    private WebElement twoButton;

    @FindBy(id = BUTTON_THREE)
    private WebElement threeButton;

    @FindBy(id = MESSAGE)
    private WebElement message;

    public WebElement getStartButton() {
        return startButton;
    }

    public WebElement getOneButton() {
        return oneButton;
    }

    public WebElement getTwoButton() {
        return twoButton;
    }

    public WebElement getThreeButton() {
        return threeButton;
    }

    public WebElement getMessage() {
        return message;
    }
}
