package tests.day19;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_PozitifTest {
    @Test
    public void test01() {

        // https://www.hotelmycamp.com adresine gidin ve login butonuna basin
        // test datausername" manager
        // test data password: manager1!
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        HotelMyCamp hotelMyCamp=new HotelMyCamp();
        //=> Locate'lerini aldigimiz webelement'leri HotelMyCamp page'ine koyduk ve onlari
        // kullanabilmek icin o class'dan obje olusturduk.
        hotelMyCamp.login.click();
        hotelMyCamp.userName.sendKeys(ConfigReader.getProperty("hotelUserName"));

        Actions actions =new Actions(Driver.getDriver());// Tab'la password'a gecmek icin action kullancagiz.
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelPassword")).sendKeys(Keys.ENTER).perform();

        /*
        ===========> Password'dan sonraki kismi asagidaki kodlarla da yapabiliriz.<==========================
        hotelMyCamp.passWord.sendKeys(ConfigReader.getProperty("password"));
        hotelMyCamp.login2.click();
        */

        // Degerleri girildiginde sayfayi basarili sekilde girilebildigini test edin
        // => Istenilen sayfaya giris yapildigini kontrol etmek icin genelde kullanici profilinin oldugu
        // kisim locate edilir.
        Assert.assertTrue(hotelMyCamp.girisYapildi.isDisplayed());

        // Sayfayi kapatin
        Driver.getDriver().close();

    }
}
