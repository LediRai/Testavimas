import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KayakHome extends KayakBase {

    private static final By stayButton = By.xpath("//a[@aria-label='Search for hotels']//*[name()='svg']");

    public KayakHome(WebDriver driver) {
        super(driver);
    }

    public static void goTo() {
        driver.get("https://www.kayak.com/");
    }

    public static void hotelioPaieska() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement stay = wait.until(ExpectedConditions.visibilityOfElementLocated(stayButton));
            stay.click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("neveikia");
        }

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        try {
//            Thread.sleep(5000);
//        WebElement stays = driver.findElement(By.cssSelector("#KTpy > div > div.MvE2.MvE2-v2.MvE2-responsive > nav:nth-child(3) > div > a:nth-child(2)"));
//            wait.until(ExpectedConditions.elementToBeClickable(stays));
//        stays.click();
//            Thread.sleep(5000);

//        WebElement paieskosLaukas = driver.findElement(By.cssSelector("input[placeholder='Enter a city, hotel, airport, address or landmark']"));
//                   wait.until(ExpectedConditions.elementToBeClickable(paieskosLaukas));
//        paieskosLaukas.sendKeys("cc");
//
//            Thread.sleep(1000);
//        WebElement dataPradzios = driver.findElement(By.xpath("//span[@aria-label='Start date calendar input']"));
//                    wait.until(ExpectedConditions.elementToBeClickable(dataPradzios));
//        dataPradzios.click();
//
//        WebElement pradziosPasirinkimas = driver.findElement(By.xpath("//body/div/div[contains(@class,'YSUE YSUE-mod-visible YSUE-mod-animate YSUE-mod-layer-default YSUE-mod-position-fixed')]/div[contains(@role,'dialog')]/div[contains(@class,'dDYU-viewport')]/div[contains(@class,'dDYU-content')]/div[contains(@class,'dDYU-body')]/div[contains(@class,'tMMr tMMr-pres-default')]/div[contains(@class,'tMMr-content')]/div[contains(@class,'c2MdE c2MdE-mod-verticalScroll')]/div[contains(@aria-label,'Start date calendar input Use left and right arrow keys to change day. Use up and down arrow keys to change week.')]/div[contains(@class,'ATGJ-monthWrapper')]/div[2]/div[2]/div[3]"));
//                    wait.until(ExpectedConditions.elementToBeClickable(pradziosPasirinkimas));
//        pradziosPasirinkimas.click();
//
//        WebElement dataPabaigos = driver.findElement(By.xpath("//span[@aria-label='End date calendar input']"));
//                    wait.until(ExpectedConditions.elementToBeClickable(dataPabaigos));
//        dataPabaigos.click();
//
//        WebElement pabaigosPasirinkimas = driver.findElement(By.xpath("//div[contains(@aria-label,'Tuesday May 9, 2023')]"));
//            wait.until(ExpectedConditions.elementToBeClickable(pabaigosPasirinkimas));
//            pabaigosPasirinkimas.click();
//
//
//        WebElement ieskoti = driver.findElement(By.xpath("//button[contains(@aria-label,'Search')]"));
//            wait.until(ExpectedConditions.elementToBeClickable(ieskoti));
//            ieskoti.click();
//    } catch(Exception e){
//            System.out.println("neveikia");
//        }
//
//    }
    }
}
