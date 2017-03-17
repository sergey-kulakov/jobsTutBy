package pages;

import org.openqa.selenium.By;

/**
 * Created by sergey on 17.03.2017.
 */
public class SearchPage extends Base {
    public void serchSameText(String searchString){
        driver.findElement(By.xpath("//input[@data-qa='vacancy-serp__query']")).sendKeys(searchString);
        driver.findElement(By.xpath("@data-qa='navi-search__button']")).click();
    }

}
