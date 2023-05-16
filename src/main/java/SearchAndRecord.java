import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.*;
import java.time.Duration;

public class SearchAndRecord {

    private static final String DB_URL="jdbc:postgresql://localhost:5432/SearchAndRecord";
    private static final String DB_USER = "postgres";
    private static final String DB_PASWORD = "labas123";
    private static  Connection  connection = null;


    public static void main(String[] args) throws SQLException {

//        System.setProperty("Webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //tikrinama info duomenu bazeje
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASWORD);
            System.out.println("success connected ");
            createTable();
            searchAndInsert("masina");
            searchAndInsert("kede");
            searchAndInsert("kaktusas");
        } catch (SQLException e){
            System.out.println(e.getMessage()); // limituota rodant kur yra klaida
        } finally {
            try {
                if (connection!=null){
                    connection.close();
                }
            }catch (SQLException r){
                System.out.println(r.getMessage());
            }
        }

        // tikslas atsidaryti psl kuris turi paieska, joje atliksim kokias nors paieskas,
        // ir paieskos rezultatus issaugosim duomenu bazeje

    }
    public static void  createTable() throws SQLException{
        String sql = """
                CREATE TABLE IF NOT EXISTS search_results (
                id SERIAL PRIMARY KEY,
                term TEXT NOT NULL,
                count INT
                );""";

        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Table search_results creates successfuly");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //is main metodo paimta informacija ir perkelta i statini metoda
    public static  void searchAndInsert (String term) throws SQLException{
        System.setProperty("Webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try {
            driver.get("https://google.com");
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys(term);
            searchBox.submit();
            WebElement resultsStarts = driver.findElement(By.id("result-starts"));
            String countText = resultsStarts.getText().split(" ")[1];
            int count = Integer.parseInt(countText.replaceAll(",", ""));
            System.out.println("Search term" + term + "Count: " + count);

            String sql = "Insert INTO search_result (term, count) VALUE (?, ?);";
            try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
                pstmt.setString(1, term);
                pstmt.setInt(2, count);
                pstmt.executeUpdate();
                System.out.println("Data was inserted successfuly");
            } catch (SQLException e) {
                System.out.println(e.getMessage());// parodys tikslia vieta kur yr aklaida
            }
        } finally { //try yra try viduj, pradziai patikrisn info , sudes medziaga ir uzdarys , bet turi atitikti visos salygos
            driver.quit();
        }
    }
}
