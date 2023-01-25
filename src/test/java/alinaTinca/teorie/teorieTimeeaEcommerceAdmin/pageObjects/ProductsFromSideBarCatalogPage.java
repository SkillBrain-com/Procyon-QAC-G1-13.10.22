package alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects;

import alinatinca.teorie.teorieTimeeaEcommerceAdmin.tests.ProductsFromSideBarCatalogTests;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsFromSideBarCatalogPage {

    public ProductsFromSideBarCatalogPage(ChromeDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Find the product field
    @FindBy(id="SearchProductName")
    WebElement productName;

    public void clickOnProductNameField(){
        productName.click();
    }

    //Find the search button
    @FindBy(id="search-products")
    WebElement searchButton;

    public void clickOnSearchButton(){
        productName.click();
    }

    //Find the item choosed from Products list
    @FindBy(css = "#products-grid tbody tr td:nth-child(3)")
    List<WebElement> productList;


}
