package alinaTinca.tests.Tema7;

import AlinaTinca.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class MakeAppoitmentTests extends BaseTest{

//Ex4
    @Test
    public void firstMakeValidAppoitment(){
        driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
        Select multipleSelectValueFacility = new Select(driver.findElement(By.xpath("//div[@class='col-sm-4']/select")));
        multipleSelectValueFacility.selectByValue("Tokyo CURA Healthcare Center");
        WebElement applyForHospitalButton = driver.findElement(By.id("checkbox-inline"));
        applyForHospitalButton.click();
        List<WebElement> healthcareProgramButton = driver.findElements(By.id("radio_program_medicaid"));
        healthcareProgramButton.get(1).click();
        List<WebElement> chooseData = driver.findElements(By.id("txt_visit_date"));
        for(WebElement choosedData: chooseData){
            System.out.println(choosedData.getText());
        if(choosedData.getText().equals("17/01/2023")){
    }choosedData.click();
//        Thread.sleep(10000);
        return;}}
}
