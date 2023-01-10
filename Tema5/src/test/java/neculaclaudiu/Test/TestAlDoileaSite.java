package neculaclaudiu.Test;

import neculaclaudiu.driver.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestAlDoileaSite {
    public static void main(String[] args) {
        ChromeDriver driver = ChromeDriverManager.createChromeDriver();
        //TextBox(driver);
        //CheckBox(driver);
        //RadioButton(driver);
        //WebTables(driver);
        //Buttons(driver);

    }
    public static void TextBox(ChromeDriver driver){
        driver.get("https://demoqa.com/elements");
        driver.manage().window().fullscreen();
        WebElement textBox = driver.findElement(By.id("item-0"));
        textBox.click();
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.clear();
        fullName.sendKeys("Necula Claudiu");
        WebElement email = driver.findElement(By.id("userEmail"));
        email.clear();
        email.sendKeys("neculaclaudiu21@gmail.com");
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.clear();
        currentAddress.sendKeys("Str.Braile Nr. 105 Bl. A1 Sc.2 Ap.45");
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.clear();
        permanentAddress.sendKeys("Str.Braile Nr. 105 Bl. A1 Sc.2 Ap.45");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
        WebElement submitElement = driver.findElement(By.id("submit"));
        submitElement.click();
        driver.quit();
    }
    public static void CheckBox(ChromeDriver driver){
        // Navigheaza catre pagina "https://demoqa.com/checkbox"
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().fullscreen();
        WebElement expandButton = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]"));
        WebElement colapseButton = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]"));
        expandButton.click();
        for(int j = 1; j<=2; j++) {
            for (int i = 1; i <= 2; i++) {
                WebElement checkboxDestop = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]//li[" + i + "]//span//label//span[1]"));
                checkboxDestop.click();
            }
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");
            for (int i = 1; i <= 3; i++) {
                WebElement checkboxWorkSpace = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]//li[1]//li[" + i + "]//label//span[1]"));
                checkboxWorkSpace.click();
            }
            for (int i = 1; i <= 4; i++) {
                WebElement chechboxOffice = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]//li[2]//li[" + i + "]//label//span[1]"));
                chechboxOffice.click();
            }
            for (int i = 1; i <= 2; i++) {
                WebElement checkboxDownloads = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[" + i + "]/span/label/span[1]"));
                checkboxDownloads.click();
            }
        }
        colapseButton.click();
        driver.quit();
    }
    public static void RadioButton(ChromeDriver driver) {
        driver.get("https://demoqa.com/radio-button");
        WebElement yesButton = driver.findElement(By.id("impressiveRadio"));
        yesButton.click();
        //WebElement text = driver.findElement(By.cssSelector("p.mt-3"));
        //System.out.println(text.getText());
    }
    public static void WebTables(ChromeDriver driver){
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().fullscreen();
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();
        WebElement firstName = driver.findElement(By.cssSelector("input#firstName"));
        firstName.sendKeys("Claudiu");
        WebElement lastName = driver.findElement(By.cssSelector("input#lastName"));
        lastName.sendKeys("Necula");
        WebElement email = driver.findElement(By.cssSelector("input#userEmail"));
        email.sendKeys("neculaclaudiu21@gmail.com");
        WebElement age = driver.findElement(By.cssSelector("input#age"));
        age.sendKeys("23");
        WebElement salary = driver.findElement(By.cssSelector("input#salary"));
        salary.sendKeys("2000");
        WebElement departament = driver.findElement(By.cssSelector("input#department"));
        departament.sendKeys("undeva in lume");
        WebElement submit = driver.findElement(By.cssSelector("button#submit"));
        submit.click();
        WebElement delete = driver.findElement(By.xpath("//*[@id=\"delete-record-4\"]"));
        delete.click();
        driver.quit();


    }
    public static void Buttons(ChromeDriver driver){
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().fullscreen();
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleClick).perform();
        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClick).perform();
        WebElement clickMe = driver.findElement(By.cssSelector("button#oFsdO"));
        clickMe.click();
        driver.quit();
        }
    }


