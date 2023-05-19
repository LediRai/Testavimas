package mokiVezi;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MokiVeziTest extends MokiVeziBase {


    public MokiVeziTest(){
        super(MokiVeziBase.driver);
    }

    @BeforeClass
    public static void  setUp(){
        System.setProperty("Webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        //System.setProperty("webdriver.gecko.driver", "C:/Users/MEDION/Desktop/moziladriver/geckodriver-v0.33.0-win64/geckodriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        MokiVeziBase.driver = new ChromeDriver(options);
        MokiVeziBase.driver.manage().window().maximize();
    }

//    @Test
//    public void registracija(){
//        MokiVeziUzsiregistruoti.registruotis();
//    }

//    @Test
//    public void paspaudimas(){
//        MokiVeziIspardavimas.prekiuIspardavimas();
//    }

    @AfterClass
    public static void tearDown() {
        MokiVeziBase.driver.quit();
        //firefoxDriver.quit();
    }

}