package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.List;

/**
 * Created by Sergey on 17.03.2017.
 */
public class Menu extends BaseElement {
    public Menu(By locator, String name)
    {
        super(locator, name);
    }
    protected RemoteWebElement getElements()
    {

        return (RemoteWebElement)Browser.GetDriver().findElements(locator).;
    }
}
