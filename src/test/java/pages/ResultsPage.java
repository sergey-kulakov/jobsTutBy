package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.Assert.*;

public class ResultsPage extends Base {
    private String lblResultLocator = "//*[contains(@class, 'b-results-list')]//a[contains(.,'%s')]";

    public void assertResultIsPresent(String text) {

        List<WebElement> vacanciesList = driver.findElements(By.xpath(lblResultLocator));
        assertFalse(vacanciesList.isEmpty());
        for (WebElement vacancy : vacanciesList) {
            String vacancyTitle = vacancy.getText();
            System.out.println(vacancyTitle);


        }




      //  new Label(By.xpath(String.format(lblResultLocator, text)), text).waitForIsElementPresent();
    }
}
