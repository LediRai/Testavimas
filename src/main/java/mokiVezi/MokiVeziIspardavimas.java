package mokiVezi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import static com.google.common.util.concurrent.Futures.withTimeout;

public class MokiVeziIspardavimas extends MokiVeziBase {

    public MokiVeziIspardavimas(WebDriver driver) {
        super(driver);
    }
    private static final By parduotuve = By.cssSelector("body > header > div.header-category-container.mt-4 > div > div > nav > div.col-9.header-categories__side.header-categories__side--left > div.header-categories__link.header-categories__link--category.link-unstyled.d-inline-block.cursor-pointer.noselect");
    private static final By ispard = By.xpath("//*[@id=\"headingispardavimasdesktop\"]/a");
    private static final  By akcija = By.cssSelector("body > header > div.header-category-container.mt-4 > div > div > nav > div.col-9.header-categories__side.header-categories__side--left > a:nth-child(3) > span");


    private static final By VisiPasiulymai = By.cssSelector("#product-item-3708272");
    private static final By Nuolaidos = By.cssSelector(".product-card__img-container__discount");

    public static void prekiuIspardavimas() {
        WebDriverWait wait = new WebDriverWait(MokiVeziBase.driver, Duration.ofSeconds(5));
        WebElement listas = wait.until(ExpectedConditions.visibilityOfElementLocated(parduotuve));
        listas.click();
        WebElement ispardavimas = wait.until(ExpectedConditions.visibilityOfElementLocated(ispard));
        ispardavimas.click();
//        WebElement nuolaida1 = wait.until(ExpectedConditions.visibilityOfElementLocated(akcija));
//        nuolaida1.click();

        List<WebElement> pasiulymai1 = driver.findElements(VisiPasiulymai);
        System.out.println(pasiulymai1.size());
        for (WebElement tittle : pasiulymai1) {
            String title = tittle.getText();
            System.out.println(title);

        WebElement pasiulymai = wait.until(ExpectedConditions.visibilityOfElementLocated(VisiPasiulymai));
        System.out.println(1);
        if (pasiulymai.isDisplayed()) {
            pasiulymai.click();
        } else {
            System.out.println("Elementas yra neaktyvus");
        }
//        List<WebElement> produktuNuolaidos = driver.findElements(Nuolaidos);
//        for (WebElement nuolaidos : produktuNuolaidos) {
//            String manoNuolaidos = nuolaidos.getText();
//            System.out.println(manoNuolaidos);
//        }

        }
    }}
