import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PiguPrisijungimas extends PiguHomePage {
    private static WebDriver driver;

    public PiguPrisijungimas (WebDriver driver){
        super(driver);
        PiguPrisijungimas.driver = driver;
    }

    public  void cookies() {  //neveikia
        WebElement cookies = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/button[3]"));
        cookies.click();
    }

    public  void piguLogin(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement atidarytiZmogeli = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/ul/li[1]/a/i"));
            wait.until(ExpectedConditions.elementToBeClickable(atidarytiZmogeli));
            atidarytiZmogeli.click();

            Thread.sleep(1000);

            WebElement elPastas = driver.findElement(By.xpath("//div[@class='col-1-of-2 login-details']//input[@placeholder='El. paštas']"));
            wait.until(ExpectedConditions.elementToBeClickable(elPastas));
            elPastas.sendKeys("pumabera@gmail.com");

            Thread.sleep(1000);

            WebElement slaptazodis =driver.findElement(By.xpath("//div[@id='passwordCont']//input[@placeholder='Slaptažodis']"));
            wait.until(ExpectedConditions.elementToBeClickable(slaptazodis));
            slaptazodis.sendKeys("morengas1");
//            slaptazodis.submit();

            Thread.sleep(1000);
            WebElement prisijungti =driver.findElement(By.xpath(" //*[@id=\"loginModal\"]/div[1]/div[1]/form/div[6]/input"));
            wait.until(ExpectedConditions.elementToBeClickable(prisijungti));
            prisijungti.click();

            Thread.sleep(4000);
        } catch (Exception e){
            System.out.println("testas nepavyksta");
        }
    }
}
