package Kayak;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class KayakProdukts extends KayakBase {
    private DbConnection db;
    private static final By stayButton = By.xpath("//a[@aria-label='Search for hotels']//*[name()='svg']");
    private static final By seeAll = By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/div[2]/div[1]/div/div/section[2]/div/header/div/div[2]/a");
    private static final By products = By.cssSelector(".c3xth-hotel-name");
    // ("FLpo-hotel-name");
    private static final By productLinks = By.className("FLpo-big-name");
    private static final By hotelPrice = By.cssSelector("span[class='c3xth-price'] span:nth-child(1)");
    //("zV27-price");
    private static final By hotelAdddress= By.className("c3xth-address");
    private static final By hotelImg = By.className("f800-image-container");
            // ("e9fk-photo");
    private Alert priceElement;

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
        System.out.println(productList.size());    //ziuriu kikek elementu yra bloke
//        for (WebElement tittle : productList) {
//            String title = tittle.getText();
//            System.out.println(title);
//        }

        List<WebElement> priceList = driver.findElements(hotelPrice);
        System.out.println(priceList.size());
        // hotelio kaina
//        for (int i = 0; i < productList.size(); i++) {
//            WebElement titleElement = productList.get(i);
//            String title = titleElement.getText();
//            WebElement priceElement = priceList.get(i);
//            String price = priceElement.getText();
//            int priceValue = Integer.parseInt(price.replaceAll("\\D+",""));
//            System.out.println("Product " + (i + 1) + ": " + title + " - " + priceValue);
//        }

        // hotelio paveiksliukas
        List<WebElement> hotelPaveiksliukas = driver.findElements(hotelImg);
        System.out.println(hotelPaveiksliukas.size());
//        for (WebElement img : hotelPaveiksliukas) {
//            String src = img.getAttribute("src");
//            System.out.println(src);
//        }

        //  List<WebElement> linkList = driver.findElements(productLinks);

        List<WebElement> linkList = driver.findElements(productLinks);
//        System.out.println(priceList.size());
//        for (int i = 0; i < linkList.size(); i++) {
//            System.out.println("***********");
//            driver.navigate().to(linkList.get(i).getAttribute("href"));
//
//            String hotelName = driver.findElement(products).getText();
//            System.out.println(hotelName);
//            List<WebElement> elements = driver.findElements(hotelAdddress);
//            if (elements.size() > 0) {
//                String address = driver.findElement(hotelAdddress).getText();
//                System.out.println(address);
//            } else {
//                System.out.println("Adresas nerastas");
//            }
//            String priceString = driver.findElement(hotelPrice).getText();
//            System.out.println(priceString);
//            int priceValue = Integer.parseInt(priceString.replaceAll("\\D+", ""));
//            WebElement imageContainer = driver.findElement(By.className("f800-image-container"));
//            String styleAttribute = imageContainer.getAttribute("style");
//            String imageUrl = styleAttribute.substring(styleAttribute.indexOf("url(") + 4, styleAttribute.indexOf(")"));
//            System.out.println(imageUrl);
//            driver.navigate().back();
//            linkList = driver.findElements(productLinks);
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

        //VEIKIANTIS
        try {
            String sql = "INSERT INTO products(hotel_title, price, address, image) VALUES(?, ?, ?, ?)";
            PreparedStatement pstmt = DbConnection.databaseConn(sql);
            DbConnection.testDbConnection();
            for (int i = 0; i < linkList.size(); i++) {
                System.out.println("***********");
                driver.navigate().to(linkList.get(i).getAttribute("href"));
                String hotelName = driver.findElement(products).getText();

                String hotelAddress; // sukurtas tuscias kintamasis  kuriam veliau priskiriam arba surasta adresa arba adresas nerastas
                List<WebElement> elements = driver.findElements(hotelAdddress);
                if (elements.size() > 0) {
                    hotelAddress = driver.findElement(hotelAdddress).getText();
                } else {
                    hotelAddress = "Adresas nerastas";
                }

                String priceString = driver.findElement(hotelPrice).getText();
                int priceValue = Integer.parseInt(priceString.replaceAll("\\D+", ""));
                WebElement imageContainer = driver.findElement(By.className("f800-image-container"));
                String styleAttribute = imageContainer.getAttribute("style");
                String imageUrl = styleAttribute.substring(styleAttribute.indexOf("url(") + 4, styleAttribute.indexOf(")"));
                pstmt.setString(1, hotelName);
                pstmt.setInt(2, priceValue);
                pstmt.setString(3, hotelAddress);
                pstmt.setString(4, "https://kayak.com" + imageUrl);
                pstmt.executeUpdate();
                driver.navigate().back();
                linkList = driver.findElements(productLinks);

            }
            System.out.println("Data inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }}

