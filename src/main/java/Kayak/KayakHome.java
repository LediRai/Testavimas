package Kayak;

import Kayak.KayakBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public class KayakHome extends KayakBase {

    private static final By stayButton = By.xpath("//a[@aria-label='Search for hotels']//*[name()='svg']");
    private static final By staySearch = By.cssSelector("input[placeholder='Enter a city, hotel, airport, address or landmark']");
    private static final By stayData = By.cssSelector("span[aria-label='Start date calendar input']");
    private static final By stayPirmaData = By.cssSelector("div[aria-label='Friday April 28, 2023']");
    //private static final By stayData2 =By.cssSelector("span[aria-label='End date calendar input']");
   // private static final By stayAntraData = By.cssSelector("span[aria-label='Thursday April 30th']");
    private static final By stayPaieska = By.cssSelector("button[aria-label='Search']");
    private static final By viewDeal = By.xpath("//*[@id=\"uO9-\"]/div/div[1]/div[1]/div/div[3]/div[3]/div/button");

    public KayakHome(WebDriver driver) {
        super(driver);
    }

    public static void goTo() {
        driver.get("https://www.kayak.com/");
    }

    public static void hotelioPaieska() throws IOException { // IO input output
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement stay = wait.until(ExpectedConditions.visibilityOfElementLocated(stayButton));
            stay.click();
            System.out.println(1);

            Thread.sleep(5000);

            WebElement kaSearchBox = wait.until(ExpectedConditions.elementToBeClickable(staySearch));
            kaSearchBox.sendKeys("daugirdas");
            Thread.sleep(5000);
            System.out.println(2);

            WebElement dataPrad = wait.until(ExpectedConditions.visibilityOfElementLocated(stayData));
            dataPrad.click();
            Thread.sleep(5000);
            System.out.println(3);

            WebElement pirmaaData = wait.until(ExpectedConditions.elementToBeClickable(stayPirmaData));
            pirmaaData.click();
            Thread.sleep(6000);
            System.out.println(4);

//            WebElement dataPab = wait.until(ExpectedConditions.visibilityOfElementLocated(stayData2));
//            dataPab.click();
//            Thread.sleep(5000);

//            WebElement antraData =wait.until(ExpectedConditions.visibilityOfElementLocated(stayAntraData));
//            antraData.click();
//            Thread.sleep(5000);

            WebElement mygtukas = wait.until(ExpectedConditions.elementToBeClickable(stayPaieska));
            mygtukas.click();
            Thread.sleep(7000);
            System.out.println(5);

            WebElement ziuretiPasiulyma = wait.until(ExpectedConditions.elementToBeClickable(viewDeal));
            ziuretiPasiulyma.click();
            System.out.println(6);

            Thread.sleep(7000);

          //  WebElement bookingTikrinimas =wait.until(ExpectedConditions.visibilityOfElementLocated(stayBooking));

         //   Thread.sleep(5000);

        } catch (Exception e) {
            System.out.println("neveikia");
        }
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Path destinationPath = Paths.get("screnchot.png");
        Files.copy(screenshotFile.toPath(), destinationPath);
    }
}
