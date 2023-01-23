package bogdanSandu.tests.Tema8.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RefreshPage {

    public RefreshPage(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }

    public static final String StartPage = "https://testpages.herokuapp.com/styled/refresh";

    public static final String RefreshDateValue = "embeddedrefreshdatevalue";

    public static final String RefreshDate = "refreshdate";

    @FindBy(id = RefreshDateValue)
    private WebElement refreshDateValue;

    @FindBy(id = RefreshDate)
    private WebElement refreshDate;

    public WebElement getRefreshDateValue() {
        return refreshDateValue;
    }

    public WebElement getRefreshDate() {
        return refreshDate;
    }
}
