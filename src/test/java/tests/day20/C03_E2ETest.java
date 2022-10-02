package tests.day20;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_E2ETest {
    @Test
    public void E2ETest() throws InterruptedException {
        // https://www.hotelmycamp.com adresine gidin ve login butonuna basin
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        // Login butonuna tiklayin
        HotelMyCamp hotelMyCamp=new HotelMyCamp();
        hotelMyCamp.login.click();

        // Username ve password metin kutularini locate edip asagidaki bilgileri girin
        // test datausername" manager
        // test data password: Manager1!
        hotelMyCamp.userName.sendKeys(ConfigReader.getProperty("hotelUserName"));
        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelPassword")).sendKeys(Keys.ENTER).perform();

        // Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hotelMyCamp.hotelManagement.click();
        Thread.sleep(2000);

        hotelMyCamp.roomReservation.click();
        Thread.sleep(2000);

        hotelMyCamp.addRoomReservation.click();
        Thread.sleep(2000);

        // Acilan sayfadaki tum metin kutularina istediginiz verileri girin
        Faker faker=new Faker();
        hotelMyCamp.idUser.sendKeys("manager");
        actions.sendKeys(Keys.TAB).sendKeys("Happy Hotel")
               .sendKeys(Keys.TAB).sendKeys("1500")
               .sendKeys(Keys.TAB).sendKeys("10/03/2022")
               .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10/05/2022")
               .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("2")
               .sendKeys(Keys.TAB).sendKeys(faker.name().fullName())
               .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone())
               .sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
               .sendKeys(Keys.TAB).sendKeys("Selam nasil gidiyor Selenium")
               .sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
               .sendKeys(Keys.ENTER).perform();

            // "Room reservation was inserted seuccesfully" yazisinin gorundugunu test edin
        Thread.sleep(3000);
        Assert.assertTrue(hotelMyCamp.roomreservationOnay.isDisplayed());


        // "ok" butonuna basin
        hotelMyCamp.roomreservationOkeyButonu.click();



    }
}
