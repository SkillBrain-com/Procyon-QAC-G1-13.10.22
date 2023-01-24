package bogdanSandu.tests.tema8.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedirectsPage {

    public RedirectsPage(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    public static final String START_PAGE_URL = "https://testpages.herokuapp.com/styled/javascript-redirect-test.html";

    public static final String DELAY_BOUNCE = "delaygotobounce";

    public static final String BACK_BUTTON = "goback";

    public static final String DELAY_BASIC = "delaygotobasic";

    @FindBy(id= DELAY_BASIC)
    private WebElement delayBasic;

    @FindBy(id= BACK_BUTTON)
    private WebElement backButton;

    @FindBy(id= DELAY_BOUNCE)
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
