import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooleSearchPage {
    private WebDriver driver;


    public void GoogleSearchPage(WebDriver driver){
        this.driver = driver;
        driver.get("https://google.com");
        }

    public void acceptCookies(){
        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        cookieNotice.click();

    }
}
