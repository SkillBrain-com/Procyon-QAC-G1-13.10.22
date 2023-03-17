package alinatinca.recap.UITestAutomationPlayground.tests;

import alinatinca.recap.SauceDemoCom.tests.BaseTests;
import alinatinca.recap.UITestAutomationPlayground.pageObjects.ClassAttributeLinkPage;
import org.testng.annotations.Test;

public class ClassAttributeLinkTest extends BaseTests {

    @Test(description = "verify that scenario from Class Attribute web page is working")
    public void goToClassAttributeLinkTest(){
        driver.get("http://uitestingplayground.com/");
        ClassAttributeLinkPage classAttributePage = new ClassAttributeLinkPage(driver);
        classAttributePage.clickOnClassAttribute();
        System.out.println("Navigate to Class Attribute link!");
        System.out.println("Scenario is: " + classAttributePage.getScenarioText().getText());
        classAttributePage.clickOnBlueButtonAndGetAlert();
        System.out.println("Test passed!");
    }
}