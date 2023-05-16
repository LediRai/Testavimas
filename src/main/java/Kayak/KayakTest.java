package Kayak;

import Kayak.KayakBase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class KayakTest extends KayakBase {
    private KayakHome kayakHome;

    public KayakTest() {
        super(driver);
        kayakHome = new KayakHome(driver);
    }

    @BeforeClass
    public static void setUp() {
        System.setProperty("Webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        KayakBase.driver = new ChromeDriver(options);
        KayakBase.driver.manage().window().maximize();
    }

    @Test
    public void Testas() throws IOException {
        KayakHome.goTo();
        KayakHome.hotelioPaieska();
    }

    @AfterClass
    public static void tearDown() {
          driver.quit();
    }
}

