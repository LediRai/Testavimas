package Kayak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLException;

public class KayakHotel extends KayakBase{
    private DbConnection db;

    public KayakHotel(WebDriver driver) {
        super(driver);
        db = new DbConnection();
    }

    public static void main(String[] args) throws SQLException {
        System.setProperty("Webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        KayakBase.driver = new ChromeDriver(options);
        KayakHotel hotel = new KayakHotel(driver);
        KayakBase.goTo();
        KayakHome.hotelioPaieska();
        hotel.KayakBase();
        hotel.sarasas();
        driver.quit();
    }

    public void sarasas(){

    }
}
