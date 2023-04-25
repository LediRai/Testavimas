import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Registracija  {
private static WebDriver driver;

    public Registracija (WebDriver driver){
        this.driver = driver;
        driver.get("https://rde.lt");
    }
    public static void ieiti(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement atidarytiRegistracija = driver.findElement(By.xpath("/html/body/header/div/div[2]/a[2]"));
            wait.until(ExpectedConditions.elementToBeClickable(atidarytiRegistracija));
             atidarytiRegistracija.click();
        } catch (Exception e){
            System.out.println("Registration element not found " + e.getMessage());
        }
    }

    public static void registruotis(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {

            WebElement regist = driver.findElement(By.xpath("//*[@id=\"auth-register-tab\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(regist));
            regist.click();

            Thread.sleep(1000);

            WebElement email = driver.findElement(By.xpath("//*[@id=\"registrationEmail\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(email));
            email.sendKeys("lasbas@gmail.com");

            Thread.sleep(1000);

            WebElement pass = driver.findElement(By.xpath("(//input[@id='registrationPassword'])[2]"));
            // kadangi htmle yra du imputai su vienodais id reikia skaityti antraji inputa, pirmasis disabled ir hidden
            pass.sendKeys("myPassword123");

            Thread.sleep(1000);

            WebElement pass2 = driver.findElement(By.xpath("(//input[@id='registrationPasswordRepeat'])[2]"));
            pass2.sendKeys("myPassword123");

            Thread.sleep(1000);

            WebElement uzsireg = driver.findElement(By.xpath("//*[@id=\"auth-register-panel\"]/form/div/footer/button/span"));
            wait.until(ExpectedConditions.elementToBeClickable(uzsireg));
            uzsireg.click();
            System.out.println("Test Done!");
        } catch (Exception e){
            System.out.println("testas nepavyksta");
        }
    }
}
