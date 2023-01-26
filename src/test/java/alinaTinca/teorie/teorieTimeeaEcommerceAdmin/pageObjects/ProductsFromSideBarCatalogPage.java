package alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects;

import alinatinca.teorie.teorieTimeeaEcommerceAdmin.tests.Product_Search_Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsFromSideBarCatalogPage {

    public static  final String PRODUCT_LIST_CSS = "#products-grid tbody tr";
    //cream o constanta care sa reprezinte elementul definit mai jou productList

    public ProductsFromSideBarCatalogPage(ChromeDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Find the product field
    @FindBy(id="SearchProductName")
    WebElement productName;

//    public void clickOnProductNameField(){
//        productName.click();
//    }

    public WebElement getProductName() {
        return productName;
    }

    //Find the search button
    @FindBy(id="search-products")
    WebElement searchButton;

//    public void clickOnSearchButton(){
//        productName.click();
//    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    //Find the item choosed from Products list
    @FindBy(css = PRODUCT_LIST_CSS)
    List<WebElement> productsList;

    //Find the item's title choosed from ProductList
    @FindBy(css = "#products-grid tbody tr td:nth-child(3)")
    List<WebElement> productTitles;


    public List<WebElement> getProductsList() {
        return productsList;
    }

    public List<WebElement> getProductTitles() {
        return productTitles;
    }

    //Metoda care ia ca parametru product si cauta pe el elementul Edit de pe pagina
    public WebElement getEditButtonFromProduct(WebElement product){
        return product.findElement(By.cssSelector("a.btn.btn-default"));
    }
}
