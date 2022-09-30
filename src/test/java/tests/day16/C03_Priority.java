package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

    /*
    NOT => Test'lerimizi calistirirken istedigimiz siraya gore calismasini istersek @Test notasyonundan
    sonra (Priority) keyword'unu kullaniriz.
    => Priority kullanmazsak default olarak 0 kabul eder.
    => Hic bir test'e priority atamazsak test methodlarini alfabetik siraya gore calistirir
     */
    @Test (priority = 1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");


    }

    @Test (priority = 3)
    public void bestBuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = -2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }

    @Test // => Priority'i 0 olarak kabul eder.
    public void hepsiBuradaTestTest() {
        driver.get("https://www.hepsiburada.com");
    }
}
