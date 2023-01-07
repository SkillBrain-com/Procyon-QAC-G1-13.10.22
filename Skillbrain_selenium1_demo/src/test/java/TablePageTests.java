import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TablePageTests {
    public static void main(String[] args) {
        ChromeDriver driver = BrowserManager.createDriver();
        TablePageManager tablePage = new TablePageManager("https://testpages.herokuapp.com/styled/tag/dynamic-table.html",driver);

        System.out.println(tablePage.checkPage());
        System.out.println(tablePage.getTableTitle());
        System.out.println(tablePage.getTableData());

        tablePage.clickTableData();
        System.out.println(tablePage.changeTableTitle("New Title"));

        tablePage.changeTableId("newId");

        List<String> name = new ArrayList<>();
        name.add("Maria");
        name.add("Ion");
        name.add("George");

        List<Integer> age = new ArrayList<>();
        age.add(1);
        age.add(2);
        age.add(3);

        String jsonFormated = tablePage.createJson(name,age);
        System.out.println(jsonFormated);
        tablePage.changeTableData(jsonFormated);



        BrowserManager.closeChromeDriver(driver);
    }
}
//adaugati un nou atribut in clasa tablePageManager in care sa salvati valoarea initiala a id tabel
//modificati acel atribut doar daca se apeleaza metoda de change id
//ce e in test trebuie sa ruleze fara eroare
