package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {

    // => TestNG framework'unda Before/After notasyonlari yerine BeforeMethod/AfterMethod notasyonlari kullanilir.
    // => Calisma prensibi JUnit'deki Before/After ile aynidir.

    @Test (groups = "grp1")
    public void amazonTesti() {
        driver.get("https://www.amazon.com");

    }

    @Test
    public void bestBuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techProEducationTesti() {
        driver.get("https://www.techproeducation.com");
    }
}
