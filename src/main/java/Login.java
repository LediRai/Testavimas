import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    private static WebDriver driver;
//    private final By login = By.xpath("//*[@id=\\\"loginEmail\\\"]\"));

    public Login(WebDriver driver) {
        this.driver = driver;
        driver.get("https://rde.lt");
    }

    public static void loginWindow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div[2]/div[1]/form/div[2]/div/input"));
            wait.until(ExpectedConditions.elementToBeClickable(email));
            email.sendKeys("pumabera@mail.com");

            Thread.sleep(3000);


            WebElement passw = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div[2]/div[1]/form/div[3]/div/input[2]"));
            wait.until(ExpectedConditions.elementToBeClickable(passw));
            passw.sendKeys("bardakas");

            Thread.sleep(3000);

            WebElement mygtukas = driver.findElement(By.xpath("//*[@id=\"auth-login-panel\"]/form/footer/div/button"));
            wait.until(ExpectedConditions.elementToBeClickable(mygtukas));
            mygtukas.click();

        } catch (Exception e){
            System.out.println("testas nepavyksta");
    }
}

}
