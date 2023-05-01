package tevineKlasePvz;

import org.openqa.selenium.WebDriver;

public class BasePage8 {
    protected WebDriver driver;

    public BasePage8(WebDriver driver){
        this.driver=driver;
        driver.manage().window().maximize();


    }
}
