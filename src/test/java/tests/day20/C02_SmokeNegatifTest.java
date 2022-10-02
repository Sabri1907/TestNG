package tests.day20;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SmokeNegatifTest {

    // =========================================== > SMOKE NEGATIF TEST < =====================================
    // Smoke Negatif Test; Dogru Kullanici-Yanlis Sifre, Yanlis Kullanici-Dogru Sifre, Yanlis Killanici-Yanlis Sifre
    // testlerinin 3'unun birlikte yapilmasi.
    @Test
    public void yanlisKullanici() {
        // https://www.hotelmycamp.com adresine gidin ve login butonuna basin
        // test datausername" manager1
        // test data password: Manager1!
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        HotelMyCamp hotelMyCamp=new HotelMyCamp();

        hotelMyCamp.login.click();
        hotelMyCamp.userName.sendKeys(ConfigReader.getProperty("hotelWrongUserName"));

        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelPassword")).sendKeys(Keys.ENTER).perform();

        // Degerler girildiginde sayfaya girilmedigini test edin
        Assert.assertTrue(hotelMyCamp.girisYapilamadi.isDisplayed());

        // Sayfayi kapatin
        // Driver.getDriver().close();
    }

    @Test
    public void yanlisSifre() {
        // https://www.hotelmycamp.com adresine gidin ve login butonuna basin
        // test datausername" manager
        // test data password: manager2!

        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        HotelMyCamp hotelMyCamp=new HotelMyCamp();

        hotelMyCamp.login.click();
        hotelMyCamp.userName.sendKeys(ConfigReader.getProperty("hotelUserName"));

        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelWrongPassword")).sendKeys(Keys.ENTER).perform();

        // Degerler girildiginde sayfaya girilmedigini test edin
        Assert.assertTrue(hotelMyCamp.girisYapilamadi.isDisplayed());

        // Sayfayi kapatin
        Driver.getDriver().close();

    }

    @Test
    public void yanlisKullaniciSifre() {
        // https://www.hotelmycamp.com adresine gidin ve login butonuna basin
        // test datausername" manager1
        // test data password: manager2!
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        HotelMyCamp hotelMyCamp=new HotelMyCamp();

        hotelMyCamp.login.click();
        hotelMyCamp.userName.sendKeys(ConfigReader.getProperty("hotelWrongUserName"));

        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelWrongPassword")).sendKeys(Keys.ENTER).perform();

        // Degerler girildiginde sayfaya girilmedigini test edin
        Assert.assertTrue(hotelMyCamp.girisYapilamadi.isDisplayed());

        // Sayfayi kapatin
        // Driver.getDriver().close();
    }
}
