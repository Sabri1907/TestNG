package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentalCarsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
    @Test
    public void test01() {
        extentTest=extentReports.createTest("Pozitif Test", "Gecerli kullanici adi " +
                                            "ve password ile giris yapildi");
        // -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueRentUrl"));
        extentTest.info("Bluerentalcars sayfasina gidildi");

        // -login butonuna bas
        BlueRentalCarsPage blueRent =new BlueRentalCarsPage();
        blueRent.blueRentLogin.click();
        extentTest.info("Login butonuna basildi");

        // -test data user email: customer@bluerentalcars.com ,
        // -test data password : 12345 dataları girip login e basın
        // -login butonuna tiklayin
        blueRent.blueRentUser.sendKeys(ConfigReader.getProperty("blueRentUser"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("blueRentPassword"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("Dogru kullanici email ve sifre girildi");
        extentTest.info("Ikinci login butonuna basildi");

        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test edin
        // Assert.assertTrue(blueRent.blueRentProfil.isDisplayed()); => Bu sekilde de yapilabilir
        String actualProfilName=blueRent.blueRentProfil.getText();
        String expectedProfilName="John Walker";
        Assert.assertEquals(expectedProfilName,actualProfilName);
        extentTest.pass("Sayfaya basarili sekilde girildi");

        /*
        NOT: Testimiz hata verdiginde raporu cift tiklayip acarsak detayli hata raporunu goruruz ancak hatanin
        oldugu sayfanin goruntusunu goremeyiz.
            => Hata aldigimiz sayfanin ekran goruntusunu gormek icin:
                -> Rapora sag tik yapip open in explorer'i tiklariz
                   -> Acilan sayfadan raporu cift tikla acariz.
                     -> Ve raporun altinda kucuk simge seklinde hata linan sayfa goruntulenir.
                       -> Simge'ye cift tik yaptigimizda goruntu buyur.
         */





    }

}
