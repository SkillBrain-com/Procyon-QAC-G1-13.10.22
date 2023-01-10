package bogdanSandu.tests.Tema5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQATests {
    private static ChromeDriver driver = null;
    DemoQATests(String url, ChromeDriver driver) {
        DemoQATests.driver = driver;
        driver.get(url);
    }
    public void selectTextBox() {
        WebElement textBox = driver.findElement(By.cssSelector("#item-0"));
        textBox.click();
    }
    public void updateTextField() {
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.clear();
        fullName.sendKeys("Bob ");
        WebElement email = driver.findElement(By.id("userEmail"));
        email.click();
        email.clear();
        email.sendKeys("adresamail@gmail.com");
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.click();
        currentAddress.clear();
        currentAddress.sendKeys("Str. No.");
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.clear();
        permanentAddress.sendKeys("Str. Abc, No.2");
        WebElement clickSubmitButton = driver.findElement(By.id("submit"));
        clickSubmitButton.click();
    }
    public void getInfo(){
        WebElement getInfo = driver.findElement(By.cssSelector("#output > div"));
        System.out.println("Info: " + getInfo.getText());
    }
    public void selectCheckBox() {
        WebElement checkBox = driver.findElement(By.id("item-1"));
        checkBox.click();
        WebElement clickOnPlus = driver.findElement(By.cssSelector("#tree-node > div > button.rct-option.rct-option-expand-all"));
        clickOnPlus.click();
        WebElement clickOnMinus = driver.findElement(By.cssSelector("#tree-node > div > button.rct-option.rct-option-collapse-all"));
        clickOnMinus.click();
    }
    public void celectRadioButton() {
        WebElement radioButton = driver.findElement(By.id("item-2"));
        radioButton.click();
        WebElement radioButtonAnswer = driver.findElement(By.cssSelector("[for='yesRadio']"));
        radioButtonAnswer.click();
    }
    public void selectWebTables() {
        WebElement webTables = driver.findElement(By.id("item-3"));
        webTables.click();
    }
    public void updateTextTables() {
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.clear();
        firstName.sendKeys("Bob");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.clear();
        lastName.sendKeys("Bob");
        WebElement email = driver.findElement(By.id("userEmail"));
        email.click();
        email.clear();
        email.sendKeys("contmail@gmail.com");
        WebElement age = driver.findElement(By.id("age"));
        age.click();
        age.clear();
        age.sendKeys("28");
        WebElement salary = driver.findElement(By.id("salary"));
        salary.click();
        salary.clear();
        salary.sendKeys("3500");
        WebElement department = driver.findElement(By.id("department"));
        department.click();
        department.clear();
        department.sendKeys("QA Engineer");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }
}
