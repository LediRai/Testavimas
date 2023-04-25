import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebParduotuve {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        System.out.println("veikia");
        driver.get("https://www.rde.lt/"); // atidaromas puslapis


        // sutikti su kukiais
        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"js_cookie_window\"]/p/a[2]"));
        cookieNotice.click();  //kintamajam priskirtas elementas,

        String[] paieskosLaukas = {"Kompiuteris", "TELEVIZORIUS", "SALDYTUVAS"};

        // ciklas per masyvo elementus
        for (String i : paieskosLaukas) {
            WebElement searchBox = driver.findElement(By.xpath("/html/body/main/header/div/form/input"));
            searchBox.sendKeys(i);
            searchBox.submit();

            // prekiu saraso sudarymas

            List<WebElement> productTitles = driver.findElements(By.xpath("//*[@id=\"main_container_wrapper\"]/ul/li/div[2]/div/h3/a"));
            String[] produktai = new String[productTitles.size()];

            for (int x = 0; x < productTitles.size(); x++) {
                produktai[x] = productTitles.get(x).getText();
            }
            System.out.println("Rasti produktai su zodziu \"" + i + "\":");

            // standartinis for ciklas +  israsomi po pirmus 3 variantus
//            for (int y = 0; y < 3; y++) {
//                System.out.println(produktai[y]);
//            }


            // 2 variantas  "trumpasis variantas" isilginats isskiriant po 3 pirmus elementus
//            int indexas = 0;
//            for (String product : produktai) {
//                if (indexas < 3) {
//                    System.out.println("-" + product);
//                }
//                indexas++;
//            }


            // trumpasis budas , kuomet israsomai visi elementai po viena
            for (String product : produktai) {
                System.out.println("-" + product);
            }

            driver.navigate().back(); // turi buti gale
        }

        driver.quit();
    }
}

