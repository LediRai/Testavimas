import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
public class WebTesting {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/Raimonda/Downloads/chromedriver/chromedriver");
        WebTesting test1= new WebTesting();
        test1.googleSearch();
    }
    public void googleSearch(){
        WebDriver driver = new ChromeDriver();
        System.out.println("veikia");
        driver.get("https://www.google.com/");
        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        cookieNotice.click();  //kintamajam priskirtas elementas,

        String[] searchTerms = {"Java", "Kaunas", "Masina"};
        WebElement searchBox; //kintamasis kuriam nieko nepriskiriam
        String term;
        searchBox = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        for (int i = 0; i<searchTerms.length; i++){    //pavyzdys  for (String term : searchTerms){
            term = searchTerms[i];
            searchBox.sendKeys(term);
            searchBox.submit();
            String norimaReiksme = term + " - Google Search";  //tai ka atisdarius pamatau taip turi atrodyti
            String gauteReiksme = driver.getTitle(); //diver  yra chromas
            assertEquals (norimaReiksme, gauteReiksme);
            driver.navigate().back();
        }
        driver.quit();
        }

    }
