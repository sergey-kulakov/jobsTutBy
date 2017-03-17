package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class MainPage extends Base{
    public void goToMenuItem(String menuName) throws InterruptedException {
        List<WebElement> menu = driver.findElements(By.xpath("//*[@id='mainmenu']/ul/li"));
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
