package andreeaG.teorie.seleniumBasics3.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectTimea {

   @FindBy(css="button.js-accept")
    private WebElement acceptButton;

    public WebElement getAcceptButton() {
        return acceptButton;
    }
}
