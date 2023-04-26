package Pigu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//public class Pigu.PiguMegstamiausi extends Pigu.PiguPrisijungimas {
public class PiguMegstamiausi extends PiguHomePage {
    private static WebDriver driver;

    public PiguMegstamiausi(WebDriver driver) {
        super(driver);
        PiguMegstamiausi.driver = driver;
    }

    public  void pagrindinisPuslapisPigu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String[] paieskosLaukas = {"Kompiuteris", "Televevizorius", "virykle"};

        // prekiu paieskos ciklas per masyvo elementus
        for (String i : paieskosLaukas) {
            WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(searchBox));
            searchBox.sendKeys(i);
            searchBox.submit();
            try {
                // paaspaudizama sirdute ant pirmos prekes
                WebElement sirdutesPaspaudimas = driver.findElement(By.xpath("/html/body/div[10]/div/div[1]/section/div/div/div[2]/section/div[3]/div/div[1]/div/div/div[2]/div/div/button"));
                wait.until(ExpectedConditions.elementToBeClickable(sirdutesPaspaudimas));
                sirdutesPaspaudimas.click();

                Thread.sleep(1000);
            // isvalomas paieskos laukas
                WebElement paspaudimasX = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/form/button[1]"));
                wait.until(ExpectedConditions.elementToBeClickable(paspaudimasX));
                paspaudimasX.click();

                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println("Testas nepavyksta: " + e.getMessage());
            }
        }
        try {
            // tikrinama kas yra sudeta i megstamiausiu sarasa
            WebElement megstamiausiSarasas = driver.findElement(By.xpath("//*[@id=\"headeMenu\"]/li[3]/a"));
            wait.until(ExpectedConditions.elementToBeClickable(megstamiausiSarasas));
            megstamiausiSarasas.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Sirdute nesuveike");
        }
    }
}
