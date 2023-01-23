package bogdanSandu.tests.Tema8.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedirectsPage {

    public RedirectsPage(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    public static final String StartPage = "https://testpages.herokuapp.com/styled/javascript-redirect-test.html";

    public static final String DelayBounce = "delaygotobounce";

    public static final String BackButton = "goback";

    public static final String DelayBasic = "delaygotobasic";

    @FindBy(id= DelayBasic)
    private WebElement delayBasic;

    @FindBy(id= BackButton)
    private WebElement backButton;

    @FindBy(id= DelayBounce)
    private WebElement delayBounceBtn;

    public WebElement getDelayBasic() {
        return delayBasic;
    }

    public WebElement getBackButton() {
        return backButton;
    }

    public WebElement getDelayBounceButton() {
        return delayBounceBtn;
    }
}
