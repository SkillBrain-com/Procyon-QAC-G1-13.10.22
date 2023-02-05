package cosminneagu.tests.tema6;

import andreeaG.utils.FileUtils;
import cosminneagu.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HerokuForms {
    static ChromeDriver driver = null;

    public static void main(String[] args)throws InterruptedException {
        navigateToHerokuFormsPage();
        try {
            usernameFill();
            passwordFill();
            textAreaFill();
            checkboxOneEnabling();
            checkboxTwoEnabling();
            radioButton1();
            radioButton3();
            multipleSelectValues();
            dropDownMenu();
            scrollToSubmitButton();
        } catch (NoSuchElementException e) {
            FileUtils.takeScreenshot(driver, "screengrab");
            System.out.println("Printscreen done");
        } finally {
            closeBrowser();
        }
    }

    public static void navigateToHerokuFormsPage(){
        driver= BrowserManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        driver.manage().window().maximize();
        System.out.println("Am deschis Heroku forms page!");
    }

    public static void usernameFill(){
        WebElement userNameField=driver.findElement(By.xpath("//input[@name='username']"));
        userNameField.sendKeys("John");
        System.out.println("Am adaugat username");
    }

    public static void passwordFill(){
        WebElement passwordField=driver.findElement(By.xpath("//input[@type='password']"));
        passwordField.sendKeys("parolaEste");
        System.out.println("Am adaugat parola");
    }

    public static void textAreaFill(){
        WebElement textField=driver.findElement(By.xpath("//textarea[@name='comments']"));
        textField.click();
        textField.clear();
        System.out.println("Am sters ce era scris");
        textField.sendKeys("Ana are mere");
        System.out.println("Am adaugat comentariu");
    }

    public static void checkboxOneEnabling() throws InterruptedException {
        WebElement checkboxOne = driver.findElement(By.cssSelector("input[value='cb1']"));
        checkboxOne.click();
        Thread.sleep(1000);
        System.out.println("S-a dat click pe checkbox 1");
        if (checkboxOne.isSelected()) {
            checkboxOne.click();
        }
    }

    public static void checkboxTwoEnabling()throws InterruptedException{
        WebElement checkboxTwo=driver.findElement(By.cssSelector("input[value='cb2"));
        checkboxTwo.click();
        Thread.sleep(1000);
        System.out.println("S-a dat click pe checkbox 2");
        if (checkboxTwo.isEnabled()){
            checkboxTwo.click();
        }
    }

    public static void radioButton1(){
        WebElement radioButtonOne=driver.findElement(By.xpath("//input[@value='rd1']"));
        radioButtonOne.click();
        System.out.println("S-a dat click pe radio button 1");

    }

    public static void radioButton3(){
        WebElement radioButtonOne=driver.findElement(By.xpath("//input[@value='rd1']"));
        radioButtonOne.click();
        System.out.println("S-a dat click pe radio button 3");

    }

    public static void multipleSelectValues(){
        Select multipleSelectValues=new Select(driver.findElement(By.xpath
                ("//select[@name='multipleselect[]")));
        multipleSelectValues.deselectAll();
        multipleSelectValues.selectByValue("ms1");
        multipleSelectValues.selectByValue("ms2");
        multipleSelectValues.selectByValue("ms3");
        System.out.println(" Multiple Select values");
    }

    public static void dropDownMenu(){
        WebElement dropDown=driver.findElement(By.name("dropdown"));
        dropDown.click();
        System.out.println("S-a dat click pe item 3");
    }

    public static void scrollToSubmitButton(){
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButton).build().perform();
        System.out.println("Scroll pana la butonul de submit ");
    }

    public static void closeBrowser() {
        driver.quit();
        System.out.println("Am inchis browser-ul!");
    }
}
