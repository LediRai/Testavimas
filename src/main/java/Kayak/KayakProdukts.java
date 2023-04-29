package Kayak;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class KayakProdukts extends KayakBase {
    private DbConnection db;
    private static final By stayButton = By.xpath("//a[@aria-label='Search for hotels']//*[name()='svg']");
    private static final By seeAll = By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/div[2]/div[1]/div/div/section[2]/div/header/div/div[2]/a");
    private static final By products = By.className("FLpo-hotel-name");
    private static final By productLinks = By.className("FLpo-big-name");
    private static final By hotelPrice = By.className("zV27-price");
    private Alert priceElement;

//    private static final By productName = By.tagName("FNY6-title");
//    private static final By producPrice = By.tagName("esgW-price");

    public KayakProdukts(WebDriver driver) {
        super(driver);
        db = new DbConnection();
    }

    public static void main(String[] args) throws SQLException {
        System.setProperty("Webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        KayakBase.driver = new ChromeDriver(options);
        KayakProdukts produktas1 = new KayakProdukts(driver);
        KayakBase.goTo();
        produktas1.kayakProducts();

        driver.quit();
    }

    public static void goTo() {
        driver.get("https://www.kayak.com/");
    }

    public void kayakProducts() {
        WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement stayBtn = driver.findElement(stayButton);
            stayBtn.click();
            Thread.sleep(7000);
            WebElement matytiVisus = driver.findElement(seeAll);
            matytiVisus.click();
        } catch (Exception e) {
            System.out.println("neveikia");
        }

        //spec metodas kuris tikrina tam tikra laiko tarpa gali buti 1min, laiko tarpas kas kiek laiko tikrina

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        List<WebElement> productList = driver.findElements(products);

        System.out.println(productList.size());

        //ziuriu kikek elementu yra bloke
//
//        for (WebElement tittle : productList) {
//            String title = tittle.getText();
//            System.out.println(title);
//        }
        List<WebElement> priceList = driver.findElements(hotelPrice);
        List<WebElement> linkList = driver.findElements(productLinks);
        System.out.println(priceList.size());



//        for (int i = 0; i < productList.size(); i++) {
//            WebElement titleElement = productList.get(i);
//            String title = titleElement.getText();
//            WebElement priceElement = priceList.get(i);
//            String price = priceElement.getText();
//            int priceValue = Integer.parseInt(price.replaceAll("\\D+",""));
//            System.out.println("Product " + (i + 1) + ": " + title + " - " + priceValue);
//        }

//        try {
//            String sql = "INSERT INTO products(hotel_title) VALUES(?)" ;
//            PreparedStatement pstmt = DbConnection.databaseConn(sql);
//            DbConnection.testDbConnection();
//            for (WebElement title : productList) {
//                assert false;
//                pstmt.setString(1, title.getText());
//                pstmt.executeUpdate();
//            }
//            System.out.println("Data insert successfully!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//        try {
//            String sql = "INSERT INTO products(price) VALUES(?)";
//            PreparedStatement pstmt = DbConnection.databaseConn(sql);
//            for (WebElement price : priceList){
//                assert false;
//                String titlestring = price.getText();
//                int priceValue = Integer.parseInt(titlestring.replaceAll("\\D+",""));
//                pstmt.setInt(1,priceValue);
//                pstmt.executeUpdate();
//            }
//            System.out.println("Data insert successfully!");
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }

        try {
            String sql = "INSERT INTO products(hotel_title, price) VALUES(?, ?)";
            PreparedStatement pstmt = DbConnection.databaseConn(sql);
            DbConnection.testDbConnection();

            for (int i = 0; i < linkList.size(); i++) {
                String titleString = productList.get(i).getText();
                int priceValue = Integer.parseInt(priceList.get(i).getText().replaceAll("\\D+", ""));
                pstmt.setString(1, titleString);
                pstmt.setInt(2, priceValue);
                pstmt.executeUpdate();
                try {
                    driver.navigate().to(linkList.get(i).getAttribute("href"));
                } catch (StaleElementReferenceException e) {
                    List<WebElement> elements = driver.findElements(productLinks);
                    driver.navigate().to(elements.get(i).getAttribute("href"));
                }
                Thread.sleep(2000);
                driver.navigate().back();
                wait.until(ExpectedConditions.stalenessOf(linkList.get(0)));
                linkList = driver.findElements(productLinks);
            }
            pstmt.close();
            System.out.println("Data inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


// VEIKIANTIS
//        try {
//            String sql = "INSERT INTO products(hotel_title, price) VALUES(?, ?)" ;
//            PreparedStatement pstmt = DbConnection.databaseConn(sql);
//            DbConnection.testDbConnection();
//            int i = 0;
//            for (WebElement title : productList) {
//                assert false;
//                String titleString = title.getText();
//                int priceValue = Integer.parseInt(priceList.get(i).getText().replaceAll("\\D+",""));
//                pstmt.setString(1, titleString);
//                pstmt.setInt(2, priceValue);
//                pstmt.executeUpdate();
//                i++;
//            }
//            System.out.println("Data inserted successfully!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
}
