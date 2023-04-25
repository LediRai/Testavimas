import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PiguTest {
    private static WebDriver driver;
    private static PiguPrisijungimas prisijungimas;
    private static PiguMegstamiausi megstamiausi;
    private static PiguHomePage homePage;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        driver = new ChromeDriver();

        homePage = new PiguHomePage(driver);
        prisijungimas = new PiguPrisijungimas(driver);
        megstamiausi = new PiguMegstamiausi(driver);
    }

    @Test
    public void PiguPrisijungimas(){
        prisijungimas.cookies();
        prisijungimas.piguLogin();
    }

    @Test
    public void PiguMegstamaiausi(){
        megstamiausi.pagrindinisPuslapisPigu();
    }

    @AfterClass
    public static void cleanUp(){
        driver.quit();
    }
}
