import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RdeWebTestPvz8 {

    private static WebDriver driver;
    private static HomePage8 homePage8;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        driver = new ChromeDriver();
        homePage8 = new HomePage8(driver);
    }
    @Test
    public void RdeHomePagetest(){
        homePage8.goTo();
    }


}
