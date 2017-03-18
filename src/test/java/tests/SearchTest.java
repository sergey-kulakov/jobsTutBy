package tests;

import org.testng.annotations.*;
import pages.Base;
import pages.MainPage;
import pages.ResultsPage;
import pages.SearchPage;

public class SearchTest {

    @BeforeTest
    public void setUp() {
            Base.getDriver().get("https://www.tut.by/");
    }

    @Parameters({"searchString"})
    @Test
    public void searchTest(String searchString) throws InterruptedException {

        MainPage mainPage=new MainPage();
        mainPage.goToMenuItem("Работа");
        SearchPage searchPage=new SearchPage();
        searchPage.serchSameText(searchString);
        ResultsPage resultsPage=new ResultsPage();

        resultsPage.searchByFullText(searchString);

    }

    @AfterTest
    public void brorserQuit() {
        Base.getDriver().quit();
    }


}
