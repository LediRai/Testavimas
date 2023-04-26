package Kayak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class KayakProdukts extends KayakBase {
    private DbConnection db;
    private final By products = By.cssSelector(" div[aria-label='Stays near Kaunas carousel'] div[class='c-5pd-list']");

    public KayakProdukts(WebDriver driver) {
        super(driver);
        db = new DbConnection();
    }

    public static void main(String[] args) throws SQLException {
        System.setProperty("Webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        KayakBase.driver = new ChromeDriver(options);
        KayakBase.driver.manage().window().maximize();
        KayakProdukts produktas1 = new KayakProdukts(driver);
        produktas1.goTo();
        produktas1.kayakProducts();
    }

    public static void goTo(){
        driver.get("https://www.kayak.com/");
    }

    public void kayakProducts(){
        List<WebElement> productList = driver.findElements(products);

        try {
            String sql ="INSERT INTO products(tittle) VALUES(?)";

            PreparedStatement pstmt = DbConnection.databaseCon(sql);
            for (WebElement tittle : productList) {
                pstmt.setString(1, tittle.getText());
            }
            System.out.println("Data insert successfully!");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
