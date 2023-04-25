import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class KayakBase {
    protected static WebDriver driver;

    public KayakBase(WebDriver driver){     // konstruktoriu, jis turi buti toks pats kaip klases pavadinimas
        KayakBase.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();  // atsidarys padidintas langas
        // driver.get("https://www.kayak.com/");

    }
    public static void goTo() {
        driver.get("https://www.kayak.com/");
    }
// sioje klaseje viskas rasoma kas susije su draiveriais
}
