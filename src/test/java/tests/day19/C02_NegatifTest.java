package tests.day19;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegatifTest {
    @Test
    public void negatifTest() {
        // https://www.hotelmycamp.com adresine gidin ve login butonuna basin
        // test datausername" manager1
        // test data password: manager1!
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        HotelMyCamp hotelMyCamp=new HotelMyCamp();

        hotelMyCamp.login.click();
        hotelMyCamp.userName.sendKeys(ConfigReader.getProperty("hotelWrongUserName"));

        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelWrongPassword")).sendKeys(Keys.ENTER).perform();

        // Degerler girildiginde sayfaya girilmedigini test edin
       Assert.assertTrue(hotelMyCamp.girisYapilamadi.isDisplayed());

        // Sayfayi kapatin
       Driver.getDriver().close();

    }
}
