//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import java.util.List;
//
//public class PiguMegstamiusiuTrinimas extends PiguHomePage{
//
//        private static WebDriver driver;
//
//        public PiguMegstamiusiuTrinimas(WebDriver driver){
//            super(driver);
//            this.driver=driver;
//        }
//
//        public static void sirdutesIsvalymas(){
//
//            // Apsidraudimas ar mes tikrai esame megstamiausiu puslapi
//            if(!driver.getCurrentUrl().equals("https://pigu.lt/lt/u/wishlist")) {
//                driver.get("https://pigu.lt/lt/u/wishlist");
//            }
//            System.out.println("pradedu trinima");
//           List<WebElement> megstamuPrekiuMasyvas = driver.findElements(By.cssSelector("div > div > div > div:nth-child(2) > div > div > button"));
//            System.out.println(megstamuPrekiuMasyvas.size());
//            for (int i = 0; i < megstamuPrekiuMasyvas.size(); i++) {
//                WebElement megstamosPrekesSirdute = driver.findElement(By.xpath("/html/body/div[11]/div/section[2]/div/div/div[2]/div/div[1]/div[3]/div/div["+i+"]/div/div/div[2]/div/div/button"));
//                System.out.println(megstamosPrekesSirdute.isDisplayed());
//            }
//
//
//    }
//
//}
