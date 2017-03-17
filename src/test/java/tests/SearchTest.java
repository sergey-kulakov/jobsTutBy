package tests;

import org.testng.annotations.Test;
import pages.Base;
import pages.MainPage;
import pages.ResultsPage;
import pages.SearchPage;

public class SearchTest {




    @Test
    public void searchTest() throws InterruptedException {

        MainPage mainPage=new MainPage();
        mainPage.goToMenuItem("Работа");
        SearchPage searchPage=new SearchPage();
        searchPage.serchSameText("Специалист по тестированию");
        ResultsPage resultsPage=new ResultsPage();
        resultsPage.assertResultIsPresent("Специалист по тестированию");



    }



}
