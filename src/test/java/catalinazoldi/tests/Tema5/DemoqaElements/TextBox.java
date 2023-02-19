package catalinazoldi.tests.Tema5.DemoqaElements;

import catalinazoldi.driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

  public static void main(String[] args) {
      goToTextBoxPage();
  }
  public static void goToTextBoxPage() {
      ChromeDriver driver = BrowserManager.createChromeDriver();
      driver.get("https://demoqa.com/text-box");
      WebElement email = driver.findElement(By.id("userEmail"));
      email.click();
      email.sendKeys("catalina@mail.com");
      WebElement fullName = driver.findElement(By.id("userName"));
      fullName.click();
      fullName.clear();
      fullName.sendKeys("Jon Snow");
      WebElement currentAddress = driver.findElement(By.id("currentAddress"));
      currentAddress.click();
      currentAddress.clear();
      currentAddress.sendKeys("Black Castle");
      WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
      permanentAddress.click();
      permanentAddress.clear();
      permanentAddress.sendKeys("Winterfell");
      WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
      submitButton.click();
      driver.quit();
      System.out.println("Test rulat cu success");
  }
}
