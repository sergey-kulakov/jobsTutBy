package pages;

import elements.Button;
import elements.Menu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class MainPage {

    private Menu menu = new Menu(By.xpath("//*[@id='mainmenu']/ul/li"), "tbnMenuItem");
   // private Button product1Link = new Button(By.xpath("//img[@alt='product1']"), "product1");

    public void goToMenuItem(String menuName) throws InterruptedException {

       // List<WebElement> menu = driver.findElements(By.xpath("//*[@id='mainmenu']/ul/li"));

        for (WebElement menuItem : menu) {
            String tabname = menuItem.getText();
            System.out.println(tabname);
            if (tabname.equals(menuName)) {

                menuItem.click();
                Thread.sleep(4000);
            }

        }

    }
}
