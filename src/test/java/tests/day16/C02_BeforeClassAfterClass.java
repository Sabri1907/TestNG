package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {
    /*
    NOT => @BeforeClass ve @AfterClass notasyonlarini TestNG'de kullanirken JUnit'deki gibi static
    yapmaya gerek yoktur.
     */

    @Test
    public void testamazon() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void testBestBuy() {
        driver.get("https://www.bestbuy.com");

    }

    @Test
    public void testTechProEducation() {
        driver.get("https://www.techproeducation.com");
    }
}
