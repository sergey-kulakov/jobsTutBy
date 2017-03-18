package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.Assert.*;

public class ResultsPage extends Base {
    private String lblResultLocator = "//div[@class='search-result-item__head']/a[contains(text(),'%s')]";


    public void searchByFullText(String text) {

        List<WebElement> vacanciesList = driver.findElements(By.xpath(String.format(lblResultLocator,text)));
        assertFalse(vacanciesList.isEmpty());
        System.out.println("Полных совпадений "+vacanciesList.size());
        for (WebElement vacancy : vacanciesList) {
            String vacancyTitle = vacancy.getText();
            System.out.println(vacancyTitle);


        }
    }
}
