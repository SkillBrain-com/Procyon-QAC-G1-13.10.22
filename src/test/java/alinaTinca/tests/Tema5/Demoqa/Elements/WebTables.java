package alinaTinca.tests.Tema5.Demoqa.Elements;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTables {

    public static void main(String[] args) {
        goToTheWebTables("Jon","Smith","test@test.com","40","60000","Marketing");
        //check if the method called goToTheWebTables is done successfully
    }

    public static void goToTheWebTables(String firstName, String lastName, String email, String age, String salary, String department){
        //create a method called goToTheWebTables that identifies several elements from Web Tables section and makes operations on these elements
        ChromeDriver driver = BrowserManager.createChromeDriver();
        //create and configure the Chrome browser page settings
        driver.get("https://demoqa.com/webtables");
        //go to the Demoqa URL
        WebElement webTablesSection = driver.findElement(By.cssSelector("#item-3"));
        //find the section called Web Tables
        webTablesSection.click();
        //click on the section called Web Tables
        WebElement addButton = driver.findElement(By.cssSelector("#addNewRecordButton"));
        //find the Add Button
        addButton.click();
        //click on the Add Button
        WebElement firstNameField = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        //find the First Name field
        firstNameField.click();
        //click on the First Name field
        firstNameField.sendKeys(firstName);
        //introduce new first name
        WebElement lastNameField= driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        //find the Last Name field
        lastNameField.click();
        //click on the Last Name field
        lastNameField.sendKeys(lastName);
        //introduce new last name
        WebElement emailField = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        //find the Email Field
        emailField.click();
        //click on the Email field
        emailField.sendKeys(email);
        //introduce new email
        WebElement ageField = driver.findElement(By.cssSelector("input[placeholder='Age']"));
        //find the Age field
        ageField.click();
        //click on the Age field
        ageField.sendKeys(age);
        //introduce new age
        WebElement salaryField = driver.findElement(By.cssSelector("input[placeholder='Salary']"));
        //find the Salary field
        salaryField.click();
        //click on the Salary field
        salaryField.sendKeys(salary);
        //introduce new salary
        WebElement departmentField = driver.findElement(By.cssSelector("input[id='department']"));
        //find the Department field
        departmentField.click();
        //click on this field
        departmentField.sendKeys(department);
        //introduce new department
        WebElement submitButton = driver.findElement(By.cssSelector("button[id='submit']"));
        //find the button called Submit
        submitButton.click();
        //click on Submit button
        WebElement deleteIcon = driver.findElement(By.cssSelector(" span[id='delete-record-4']"));
        //find the Bin element gaseste iconul Bin (si sterge randul 4 adaugat anterior)
        Actions actions = new Actions(driver);
        //create a object of type Actions
        actions.moveToElement(deleteIcon).build().perform();
        //scroll to the delete icon
        deleteIcon.click();
        //click on the Bin icon
        System.out.println("I scrolled to the delete icon");
        //display the below message
        WebElement editIcon = driver.findElement(By.cssSelector("span[id='edit-record-2']"));
        //find the Edit icon
        editIcon.click();
        //click on the Edit icon
        WebElement inputFirstNameIcon = driver.findElement(By.cssSelector("input[value='Alden']"));
        //find the Edit icon for Alden's name
        inputFirstNameIcon.click();
        //click on the First Name field
        inputFirstNameIcon.clear();
        //clear the previous data from that field
        inputFirstNameIcon.sendKeys(firstName);
        //introduce new name
        WebElement inputLastNameField = driver.findElement(By.cssSelector("input[value='Cantrell']"));
        //find the Last Name field
        inputLastNameField.click();
        //click on the this field
        inputLastNameField.clear();
        //clear the previous data from this field
        inputLastNameField.sendKeys(lastName);
        //introduce new last name
        WebElement inputEmailField = driver.findElement(By.cssSelector(" input[value='alden@example.com']"));
        //find the Email field
        inputEmailField.click();
        //click on the Email field
        inputEmailField.clear();
        //clear the previous data from this field
        inputEmailField.sendKeys(email);
        //introduce new email
        WebElement inputAgeField = driver.findElement(By.cssSelector(" input[value='45']"));
        //find the Age field
        inputAgeField.click();
        //click on this field
        inputAgeField.clear();
        //clear the previous data
        inputAgeField.sendKeys(age);
        //introduce new age
        WebElement inputSalaryField = driver.findElement(By.cssSelector("input[value='12000']"));
        //find the Salary field
        inputSalaryField.click();
        //click on the Salary field
        inputSalaryField.clear();
        //clear the previous data from this field
        inputSalaryField.sendKeys(salary);
        //introduce new salary
        WebElement inputDepartmentField = driver.findElement(By.cssSelector("input[value='Compliance']"));
        //find the Department field
        inputDepartmentField.click();
        //click on the Salary field
        WebElement buttonSubmit = driver.findElement(By.cssSelector("button[type='submit']"));
        //find the Submit button
        buttonSubmit.click();
        //click on the Submit button
        WebElement typeToSearchButton = driver.findElement(By.cssSelector("input[placeholder='Type to search']"));
        //find the Search button (pt a cauta numele Amalia care tocmai ce a fost editat)
        typeToSearchButton.click();
        //click on the thin button
        typeToSearchButton.sendKeys("Cierra");
        //introduce Cierra name for find it
        typeToSearchButton.sendKeys(Keys.ENTER);
        //introduce Enter
        driver.quit();
        //close the Chrome browser page
    }
}
