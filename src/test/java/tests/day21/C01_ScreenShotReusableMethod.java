package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
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
        //Driver.getDriver().close();

    }

    @Test
    public void test02() throws IOException {
        // Amazon sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // Nutella aratin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        // Arama sonuc yazisi Webelementi'nin ekran goruntusunuz alin
        ReusableMethods.getScreenshotWebElement("AramaSonucWE",amazonPage.aramaSonucuWE);
        // => Bu method parametre olarak String isim ve webelemn'tin locate'ini istiyor.

        // Sayfayi kapatin
        Driver.getDriver().close();


    }
}
