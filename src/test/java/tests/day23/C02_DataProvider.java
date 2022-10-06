package tests.day23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BlueRentalCarsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {
    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"sabri@gmail.com","12345*"},
                {"sabri1@gmail.com","12345*6"},{"sabri2@gmail.com","123456**"}};
    }

    @Test(dataProvider = "kullanicilar")
    public void test01(String userEmail, String password) throws InterruptedException {
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueRentUrl"));

        //login butonuna bas
        Thread.sleep(2000);
        BlueRentalCarsPage blueRent =new BlueRentalCarsPage();
        blueRent.blueRentLogin.click();

        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        //login butonuna tiklayin

        blueRent.blueRentUser.sendKeys(userEmail);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(password)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(blueRent.blueRentLogin.isDisplayed());

        // Sayfayi kapatin
        Thread.sleep(3000);
        Driver.closeDriver();

    }
}
