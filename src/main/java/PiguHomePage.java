import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class PiguHomePage  { // base page , cia tevine klase

    protected WebDriver driver; // (protected) apsaugojamas nuo kitu klasiu

    public PiguHomePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://pigu.lt");


    }
    // viskas kas susije su draiveriais
}
