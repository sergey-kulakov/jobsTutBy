package elements;

import org.openqa.selenium.By;
import org.testng.Assert;

public class TextBox extends BaseElement {

    public TextBox(By locator, String name)
    {
        super(locator, name);
    }

    public String getText(String text)
    {
        return getElement().getText();

    }

    public void setText(String text)
    {
        getElement().click();
        getElement().clear();
        getElement().sendKeys(text);
    }



}
