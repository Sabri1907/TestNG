package tests.day21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import pages.HepsiBuradaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;


public class C02_Odev_Hepsiburada {
    //Hepsiburada sayfasına gidiniz
    //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
    //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanın resmini alalım
    //Sayfayı kapatalım
    HepsiBuradaPage hepsiburadaPage;
    Actions actions;

    @Test
    public void test01() throws InterruptedException, IOException {
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://www.hepsiburada.com");
        //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanın resmini alalım
        hepsiburadaPage = new HepsiBuradaPage();
        actions = new Actions(Driver.getDriver());
        ReusableMethods.hover(hepsiburadaPage.elektronik1);
        ReusableMethods.hover(hepsiburadaPage.bilgisayarTablet1);
        for (int i = 0; i < hepsiburadaPage.altBasliklar.size(); i++) {
            ReusableMethods.waitFor(5);
            hepsiburadaPage.altBasliklar.get(i).click();
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            ReusableMethods.waitFor(5);
            ReusableMethods.getScreenshot("hepsiburada");
            Assert.assertTrue(hepsiburadaPage.sonucYazi.isDisplayed());
            ReusableMethods.waitFor(2);
            ReusableMethods.hover(hepsiburadaPage.elektronik1);
            ReusableMethods.waitFor(2);
            ReusableMethods.hover(hepsiburadaPage.bilgisayarTablet1);
        }
        Driver.closeDriver();
    }
}