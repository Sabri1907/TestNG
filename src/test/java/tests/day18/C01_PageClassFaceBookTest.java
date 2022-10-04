package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.Driver;

public class C01_PageClassFaceBookTest {

    @Test
    public void test01() {
        // https://www.facebook.com adresine gidin
        Driver.getDriver().get("https://www.facebook.com");

        // POM'a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        FaceBookPage faceBookPage= new FaceBookPage();
        // => Locate edip faceBookPage class'ina attik.
        // => faceBookPage class'indaki webelementleri kullanabilmek icin o class'dan obje olusturduk.

        // Faker class'ini kullanarak email ve sifre degerlerini yazdirip giris butonuna basin
        Faker faker= new Faker();
        faceBookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        faceBookPage.sifreKutusu.sendKeys(faker.internet().password());
        faceBookPage.girisYapButonu.click();


        // Basarili giris yapilamadigini test edin
        Assert.assertTrue(faceBookPage.girisYapilamadiYazisi.isDisplayed());

        // Sayfayi kapatin
        //Driver.getDriver().close();

    }
}
