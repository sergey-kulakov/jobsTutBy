package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseElement {
    private  RemoteWebElement element;
    protected  String name;
    protected  By locator;
    protected static BaseElement browser;
    private static WebDriver driver;

    protected BaseElement(By locator, String name)
    {
        this.name = name;
        this.locator = locator;
    }

    public static WebDriver get_driver() {
        return driver;
    }

    public static void set_driver(WebDriver driver) {
        BaseElement.driver = driver;
    }

    protected RemoteWebElement getElement()
    {

        return (RemoteWebElement)Browser.GetDriver().findElement(locator);
    }



    protected String GetName()
    {
        return name;
    }

    protected By GetLocator()
    {
        return locator;
    }

    public void Click()
    {

        getElement().click();

    }
    public String getText(){
        return  getElement().getText();
    }



}
