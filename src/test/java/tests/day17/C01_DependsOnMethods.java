package tests.day17;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_DependsOnMethods extends TestBaseBeforeMethodAfterMethod {
    /*
    => Asagidaki ornekte test2 test1'e ve test3 de test2'ye bagli oldugu icin test1'e gitmedigi icin
    test2 ve test3 ignore oldu.
    => Ama test4 hic bir yere depends olmadigi icin calisir.
    => Priority kullanarak oncelik de verebiliriz
     */
    @Test
    public void test01() {
        driver.get("https://www.wamazon1.com");
    }

    @Test (dependsOnMethods = "test01")
    public void test02() {
        driver.get("https://www.facebook.com");
    }

    @Test (dependsOnMethods = "test02")
    public void test03() {
        driver.get("https://www.bestbuy.com");

    }

    @Test (priority = -1)
    public void test04() {
        driver.get("https://www.youtube.com");

    }
}
