package elizCurtnazar.tests.tema7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeButton extends BaseTest {

    @Test
    public void goToTheHomePage() {
        WebElement menu = driver.findElement(By.cssSelector(".btn-dark.btn-lg.toggle"));
        menu.click();
        WebElement homeButton = driver.findElement(By.xpath("/html/body/nav/ul/li[2]/a"));
        homeButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");

    }

    @Test
    public void loginPage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        goToTheHomePage();

    }

    @Test
    public void historyPage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/history.php#history");
        goToTheHomePage();
    }

    @Test
    public void profilePage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#profile");
        goToTheHomePage();
        Assert.assertNotEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/", "!!ERROR!!");



    }


}
