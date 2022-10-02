package tests.day18;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {
    @Test
    public void test01() {

        // https://www.hotelmycamp.com adresine gidin ve login butonuna basin
            // test datausername" manager
            // test data password: manager1!
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));
        HotelMyCamp hotelMyCamp=new HotelMyCamp();
        hotelMyCamp.login.click();
        hotelMyCamp.userName.sendKeys(ConfigReader.getProperty("userName"));
        hotelMyCamp.passWord.sendKeys(ConfigReader.getProperty("password"));
        hotelMyCamp.login2.click();

        // Degerleri girildiginde sayfayi basarili sekilde girilebildigini test edin
        Assert.assertTrue(hotelMyCamp.listOfUsers.isDisplayed());

        // Sayfayi kapatin
        Driver.getDriver().close();

    }
}
