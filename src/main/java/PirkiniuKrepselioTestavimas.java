import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PirkiniuKrepselioTestavimas {

    public static void main(String[] args) throws InterruptedException{

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        driver.manage().window().maximize();
//       PirkiniuKrepselis test1 = new PirkiniuKrepselis(driver);
//        test1.addToCard();
//        Registracija test2 =new Registracija(driver);
//        test2.ieiti();
//        test2.registruotis();
//        Login test3 = new Login(driver);
//        test3.loginWindow();

        //Public stacit void setUp{
//System.setProperty("webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
//        driver = new ChromeDriver();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notification");
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.of(10));
//        driver.manage().window().maximize();
//        googleSearchPage = new  GooleSearchPage(driver);



        driver.quit();
    }

}
