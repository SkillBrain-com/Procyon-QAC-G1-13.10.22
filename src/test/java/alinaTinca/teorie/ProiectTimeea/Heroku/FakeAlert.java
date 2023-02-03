package alinatinca.teorie.ProiectTimeea.Heroku;

import AlinaTinca.driver.BrowserManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakeAlert {
    public static void main(String[] args) {
//        firstAlert();
        secondAlert();
    }

    public static void firstAlert(){
        ChromeDriver driver = null;
        try {
            driver = BrowserManager.createChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");
            System.out.println("Navigheaza la pagina");
            WebElement paragraph = driver.findElement(By.className("explanation"));
            System.out.println("Paragraful are urmatorul text: " + paragraph.getText());
            WebElement paragraphForFirstButton = driver.findElement(By.xpath("//div[@class='explanation']/p"));
            System.out.println("Paragraful aferent primului buton este: " + paragraphForFirstButton.getText());
            WebElement firstButton = driver.findElement(By.id("fakealert"));
            firstButton.click();
            System.out.println("Da clic pe primul buton");
            Alert firstAlert = driver.switchTo().alert();
            firstAlert.accept();
        }catch (NoAlertPresentException e) {
            System.out.println("Nu mai primim nicio exceptie acum cand identifica alerta; exceptia a fost prinsa si tratata!");
            System.out.println("Alerta nu poate fi acceptata pentru ca este fake!");
        }finally {
        if (driver !=null ){
            driver.quit();}
        }
    }

    public static void secondAlert(){
        ChromeDriver driver = null;
        try{
            driver = BrowserManager.createChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");
            WebElement paragraphForSeconAlert = driver.findElement(By.xpath(
                    "//p[text()='The following button will display a modal dialog when clicked. So you can also exit by clicking on the background.']"));
            System.out.println("Paragraful celui de-al doilea buton este: " + paragraphForSeconAlert.getText());
            WebElement secondButton = driver.findElement(By.id("modaldialog"));
            secondButton.click();
            Alert secondAlert = driver.switchTo().alert();
            secondAlert.accept();
        }catch (NoAlertPresentException e){
            System.out.println("A tratat exceptia pe care o primeam cand identifica alerta");
            System.out.println("Alerta nu poate fi acceptata pentru ca este fake!");
        }
        finally {
        if( driver != null ) {
            driver.quit();}
        }
    }
}