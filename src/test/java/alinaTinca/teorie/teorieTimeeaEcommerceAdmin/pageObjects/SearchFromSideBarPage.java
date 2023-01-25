package alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFromSideBarPage {

    ChromeDriver driver;

    public SearchFromSideBarPage(ChromeDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Find catalog element from sidebar
//    @FindBy(css = "nav.mt-2 .nav-item.has-treeview:nth-child(2)") ???
    @FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a/i")
    WebElement catalogLink;

    public void clickOnCatalogLink(){
        catalogLink.click();
    }

    //Find products element from sidebar
    @FindBy(css = ".nav-item a[href='/Admin/Product/List']")
    WebElement products;

    public void clickOnProduct(){
        products.click();
    }
}
