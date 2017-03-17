package elements;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static WebDriver driver;

    public static Browser CreateInstance()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return new Browser();
    }

    public static WebDriver GetDriver()
    {
        return driver;
    }

}
