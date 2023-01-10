import org.openqa.selenium.chrome.ChromeDriver;

public class BothPagesTests {
    public static void main(String[] args) {
        ChromeDriver driver = BrowserManager.createDriver();
//        TestPagesHerokuappManager herokuapp = new TestPagesHerokuappManager("https://testpages.herokuapp.com/styled/index.html", driver);
        DemoQaManager demoqaPage = new DemoQaManager("https://demoqa.com/elements", driver);


        demoqaPage.selectTextBox();
        demoqaPage.selectCheckBox();
        demoqaPage.selectRadioButton();
        demoqaPage.WebTablesLink("webtables");
        demoqaPage.ButtonsLink("buttons");
        demoqaPage.LinkElementLink("links");


//        herokuapp.goToTheFirstPage();
//        herokuapp.goToTheSecondPage();
//        herokuapp.goToTheThirdPage();
//        herokuapp.goToTheFourthPage();


        // cand metoda este void putem returna direct in metoda. numai trebuia afisat si pe clasa de test.
        //cand are return afisam in clasa de test.

        BrowserManager.closeChromeDriver(driver);

    }


}


