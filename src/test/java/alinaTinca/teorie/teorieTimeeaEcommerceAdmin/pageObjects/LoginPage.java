package alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    protected ChromeDriver driver;

    //Create the constructor
    public LoginPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Find the email element on the page
    @FindBy(id ="Email")
    WebElement email;

    //Find the password element on the page
    @FindBy(id="Password")
    WebElement password;

    //Find the Login button on the page
    @FindBy(className = "button-1")
    WebElement loginButton;

    //Create methods that click on email, password and login button elements AND introduce data
    public void clickOnEmailAndClear() {
        email.click();
        email.clear();
    }

    public void clickOnPasswordAndClear(){
        password.click();
        password.clear();
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void inputData(String inputEmail, String inputPassword){
        email.sendKeys(inputEmail);
        password.sendKeys(inputPassword);
    }

}

