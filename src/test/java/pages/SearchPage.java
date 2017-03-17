package pages;

import elements.Button;
import elements.TextBox;
import org.openqa.selenium.By;

/**
 * Created by sergey on 17.03.2017.
 */
public class SearchPage {
    private TextBox txbSearch = new TextBox(By.xpath("//input[@data-qa='vacancy-serp__query']"), "search");
    private Button tbnSearch = new Button(By.xpath("@data-qa='navi-search__button']"), "search");

    public void searchSameText(String searchString){

        txbSearch.setText(searchString);
        tbnSearch.Click();

    }

}
