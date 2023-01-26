package alinatinca.teorie.teorieTimeeaEcommerceAdmin.tests;

import alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects.LoginPage;
import alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects.ProductEditPage;
import alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects.ProductsFromSideBarCatalogPage;
import alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects.SearchFromSideBarPage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects.ProductsFromSideBarCatalogPage.PRODUCT_LIST_CSS;

public class Product_Search_Tests extends BaseTest{

    //Predefinit - Login
    @BeforeClass
    public void beforeClass(){
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnEmailAndClear();
        loginPage.clickOnPasswordAndClear();
        loginPage.inputData("admin@yourstore.com", "admin");
        loginPage.clickOnLoginButton();
    }

    @Test(description = "verify that search is successful when searching for products by name")
    public void searchByProductNameFromCatalog(){
        SearchFromSideBarPage searchFromSideBarPage = new SearchFromSideBarPage(driver);
        searchFromSideBarPage.clickOnCatalogLink();
        searchFromSideBarPage.clickOnProduct();
        ProductsFromSideBarCatalogPage productsFromSideBarCatalogPage = new ProductsFromSideBarCatalogPage(driver);
        productsFromSideBarCatalogPage.getProductName().sendKeys("Windows 8 Pro");
        productsFromSideBarCatalogPage.getSearchButton().click();

        getWait(driver).until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(PRODUCT_LIST_CSS), 1));
        //apelam conditia de FluentWait(definita in BaseTest) prin faptul sa astepte pana cand conditia noastra adica nr unei liste de webelemente
        //(constanta PRODUCT_LIST_CSS) este de un anumit numar, adica 1 in cazul nostru - este indeplinita

//        Assert.assertEquals(productsFromSideBarCatalogPage.getProductsList().size(),
//                "1",
//                "Search did not return the expected products!");
//        //facem o verificare sa vedem daca numele primului produs pe care l-am cautat (numit Windows 8 Pro) coincide de fapt cu primul element din lista
//
//        Assert.assertEquals(productsFromSideBarCatalogPage.getProductTitles().size(),
//                "1",
//                "Search did not return the expected product title size!");
        //facem  o verificare sa vedem daca numele titlului aferent primului produs cautat coincide de fapt cu titlul primului element din lista

        Assert.assertEquals(productsFromSideBarCatalogPage.getProductsList().size(), productsFromSideBarCatalogPage.getProductTitles().size(),
                "Product titles list has different size than product list!");
        //facem o verificare sa vedem daca lungimea listei aferenta produselor este egala cu lungimea listei aferenta titlurilor produselor

        Assert.assertEquals(productsFromSideBarCatalogPage.getProductTitles().get(0).getText(),
                "Windows 8 Pro",
                "Search product title is not correct!");
        //facem o verificare sa vedem daca textul de pe primul produs din lista pe care l-am cautat se numeste de fapt Windows 8 Pro
    }

    @Test(description = "verify that after editing a product's name, it is not longer in the search list")
    public void editProductName(){
        driver.get("https://admin-demo.nopcommerce.com/Admin/Product/List");
        ProductsFromSideBarCatalogPage productsFromSideBarCatalogPage = new ProductsFromSideBarCatalogPage(driver);
        getWait(driver).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector(PRODUCT_LIST_CSS), 0));
        //prin apelarea metodei FluentWait facem in asa fel incat sa astepte pana ce conditia sa fie indeplinita: nr de elemente al listei de produse sa fie mai mare decat 0
        Assert.assertNotEquals(productsFromSideBarCatalogPage.getProductsList().size(),
                1,
                "No products present");
        //facem o verificare sa vedem ca lista produselor nu are lungimea egala cu 0, deci ca exista un numar de elemente in ea (inclusiv al doilea produs pe vrem sa il accesam)
        productsFromSideBarCatalogPage.getEditButtonFromProduct(productsFromSideBarCatalogPage.getProductsList().get(1)).click();
        //face clic pe al doilea produs din lista cu produse si cauta butonul de Edit de pe pagina aferent celui de-l doilea produs/rand

        //edit product name
        ProductEditPage productEditPage = new ProductEditPage(driver);
        productEditPage.getProductName().sendKeys(" Text Random Test");
        productEditPage.getSaveButton().click();
        //de continuat
    }
}