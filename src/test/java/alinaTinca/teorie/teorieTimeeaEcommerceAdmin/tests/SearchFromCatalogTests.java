package alinatinca.teorie.teorieTimeeaEcommerceAdmin.tests;

import alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects.LoginPage;
import alinatinca.teorie.teorieTimeeaEcommerceAdmin.pageObjects.SearchFromSideBarPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchFromCatalogTests extends BaseTest{

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
    }
}
