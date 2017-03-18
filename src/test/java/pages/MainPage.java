package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class MainPage extends Base{

    public void goToMenuItem(String menuName)  {
        List<WebElement> menu = driver.findElements(By.xpath("//*[@id='mainmenu']/ul/li"));
        for (WebElement menuItem : menu) {
            String tabname = menuItem.getText();
             if (tabname.equals(menuName)) {

                menuItem.click();
                break;

            }

        }



    }

}
