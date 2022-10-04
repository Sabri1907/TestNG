package tests.day21;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    @Test
    public void test01() throws IOException {

        // Hepsiburada sayfasina gidiniz
        Driver.getDriver().get("https://www.hepsiburada.com");

        // Sayfanin ekran goruntusunu aliniz
        ReusableMethods.getScreenshot("hepsiburada");

        // Sayfayi kapatin
        Driver.getDriver().close();



    }
}
