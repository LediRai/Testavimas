import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class TestRda {
    public static Registracija registracija;
    public static WebDriver driver;
    public static Login login;

    @BeforeClass
    public  static void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        driver  = new ChromeDriver();

        // prenesimu isjungimas
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notification");
        WebDriver driver = new ChromeDriver(options);

        //laukiama kol visi elementai  uzkrauti

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        registracija = new Registracija(driver);
        login = new Login(driver); // sukuriau  login objekta
    }
//    @Test
//    public void registruotis(){
//        Registracija.ieiti();
//        Registracija.registruotis();
//    }

    @Test
    public void login(){
        Registracija.ieiti();
        Login.loginWindow();
    }
    @AfterClass
    public static void teamDowb(){
        driver.quit();
    }
}