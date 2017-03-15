import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest {
    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void searchTest() throws InterruptedException {
        driver.get("https://www.tut.by/");

       goToMenuItem("Работа");


    }
public void goToMenuItem(String menuName){
        List<WebElement> menu = driver.findElements(By.xpath("//*[@id='mainmenu']/ul/li"));
        for (WebElement menuItem : menu) {
            String tabname = menuItem.getText();
            if (menuItem.getText().equals(menuName)) {
                menuItem.click();
            }

        }

    }

    @AfterTest
    public void brorserQuit() {
        driver.quit();
    }
}
