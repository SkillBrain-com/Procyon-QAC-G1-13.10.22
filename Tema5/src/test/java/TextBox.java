import org.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {



    public static void main(String[] args) {
        goToTheTextBoxAndCheckIt("Maria Madalina","test@test.com","Bacau","Romania");

        public static void goToTheTextBoxAndCheckIt( fullNameInput,  EmailInput,  currentAddressInput,  permanentAddressInput) {
            ChromeDriver driver = BrowserManager.createChromeDriver();

            driver.get("https://demoqa.com/text-box");
            WebElement TextBoxSection = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]"));
            TextBoxSection.click();
            WebElement fullNameField = driver.findElement(By.id("userName"));
            WebElement EmailField = driver.findElement(By.id("userEmail"));
            WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
            WebElement permanentAddressField = driver.findElement(By.id("permanentAddress"));
            fullNameField.click();
            fullNameField.clear();
            fullNameField.sendKeys(fullNameInput);
            fullNameField.sendKeys(Keys.TAB);
            EmailField.click();
            EmailField.clear();
            EmailField.sendKeys(EmailInput);
            EmailField.sendKeys(Keys.TAB)
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
            currentAddressField.click();
            currentAddressField.clear();
            currentAddressField.sendKeys(currentAddressInput);
            currentAddressField.sendKeys(Keys.TAB);
            permanentAddressField.click();
            permanentAddressField.clear();
            permanentAddressField.sendKeys(permanentAddressInput);
            permanentAddressField.sendKeys(Keys.TAB);
            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.sendKeys(Keys.ENTER);
            driver.quit();




        }
}

    public static void goToTheTextBoxAndCheckIt(String maria_madalina, String s, String bacau, String romania) {
    }
