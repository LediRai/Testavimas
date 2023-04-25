import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasePage {
    public static void main (String[] args){
//        Scanner scanner = new Scanner (System.in);
//        System.out.println(" Enter a number: ");
//       // System scanner;
//        int num = scanner.nextInt();
//        if(num% 2==0){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
// System.setProperty("webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver(); //metodas paleidzia narsykle tai objektas
       // System.out.println("veikia");

        //navigate to website
        driver.get("https://pigu.lt");

        //     driver.close(); //uzdaro viena langa
        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"cookie_block\"]/div/div/div[1]/div[2]/button[3]"));
        cookieNotice.click();

        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        searchBox.sendKeys( "lova");
        searchBox.submit();


        ////*[@id="cookie_block"]/div/div/div[1]/div[2]/button[3]
        driver.quit(); // uzdaro visus tabus
    }

}