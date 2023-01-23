package bogdanSandu.tests.Tema8.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicButtonsSimplePage {

    public DynamicButtonsSimplePage(ChromeDriver driver){

        PageFactory.initElements(driver , this);
    }

    public static final String StartPage ="https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html";

    public static final String StartButton = "button00";

    public static final String ButtonOne = "button01";

    public static final String ButtonTwo = "button02";

    public static final String ButtonThree = "button03";

    public static final String Message = "buttonmessage";

    @FindBy(id = StartButton)
    private WebElement startButton;

    @FindBy(id = ButtonOne)
    private WebElement oneButton;

    @FindBy(id = ButtonTwo)
    private WebElement twoButton;

    @FindBy(id = ButtonThree)
    private WebElement threeButton;

    @FindBy(id = Message)
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
