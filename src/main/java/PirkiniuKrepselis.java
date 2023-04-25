import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PirkiniuKrepselis {
    private WebDriver driver;
    private final By addToCart = By.xpath("/html/body/main/div[5]/div/div[2]/div/div/div[1]/div/div/a");


    public PirkiniuKrepselis(WebDriver driver){
        this.driver = driver;
        driver.get("https://rde.lt");
    }

    public void addToCard(){
       // WebElement addToCartProduct = driver.findElement(By.xpath("//*[@id=\"new-product-panel\"]/div[2]/ul/li[1]/a"));
       // addToCartProduct.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
        addProduct.click();



    }

    public void cookies(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"js_cookie_window\"]/p/a[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(cookies));
        cookies.click();

    }

}
