import org.openqa.selenium.WebDriver;
import tevineKlasePvz.BasePage8;

public class HomePage8 extends BasePage8 {

public  HomePage8(WebDriver driver){
    super (driver);
        }

        public void goTo(){
    driver.get("https://rde.lt");
        }


}
