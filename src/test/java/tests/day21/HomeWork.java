package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomeWork {

    HepsiBuradaPage hepsiBurada = new HepsiBuradaPage();
    Actions action = new Actions(Driver.getDriver());

    @Test
    public void test01() throws IOException, InterruptedException {
        // Hepsiburada sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hepsiBuradaUrl"));

        // ELektronik>Bilgisayar/Tablet altindaki tum linkleri tiklayin
        // Her link'ten sonra o sayfaya gittiginizi test edin ve o sayfanin ekran goruntusunu alin

        //1.Dizustu Bilgisayar
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.dizustu).click().perform();
        Assert.assertTrue(hepsiBurada.dizUstuGiris.isDisplayed());
        ReusableMethods.getScreenshot("Dizustu Bilgisayar");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();


        //2.Tablet
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.tablet).click().perform();
        Assert.assertTrue(hepsiBurada.tabletGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Tablet");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //3.Masaustu Bilgisayar
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.masaustu).click().perform();
        Assert.assertTrue(hepsiBurada.masaUstuGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Masaustu Bilgisayar");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //4.Oyuncu Ozel
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.oyuncu).click().perform();
        Assert.assertTrue(hepsiBurada.oyuncuGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Oyuncu Ozel");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //5 .Veri Depolama
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.veri).click().perform();
        Assert.assertTrue(hepsiBurada.veriGiris.isDisplayed());
        ReusableMethods.getScreenshot("Veri Depolama");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //6. Tum Kategoriler
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.tumKategoriler).click().perform();
        Assert.assertTrue(hepsiBurada.getTumKategorilerGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Tum Kategoriler");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //7. Bilgisayar Bilesenleri
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.bilesenler).click().perform();
        Assert.assertTrue(hepsiBurada.bilesenlerGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Bilgisayar Bilesenleri");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //8. Yurt Disindan
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.yurt).click().perform();
        Assert.assertTrue(hepsiBurada.yurtGiris.isDisplayed());
        // Thread.sleep(2000);
        ReusableMethods.getScreenshot("Yurt Disindan");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //9. Ag-Modem-Akilli Ev
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.modem).click().perform();
        Assert.assertTrue(hepsiBurada.modemGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Ag Modem Akilli Ev");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //10. Grafik Tablet
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.grafik).click().perform();
        Assert.assertTrue(hepsiBurada.grafikGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Grafik Tablet");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //11. Cevre Birimleri
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.cevre).click().perform();
        Assert.assertTrue(hepsiBurada.cevreGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Cevre Birimleri");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //12. Yazilim Urunleri
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.yazilim).click().perform();
        Assert.assertTrue(hepsiBurada.yazilimGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Yazilim Urunleri");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //13. Aksesuarlar
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.aksesuarlar).click().perform();
        Assert.assertTrue(hepsiBurada.aksesuarlarGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Aksesuarlar");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //14. Kulaklik
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.kulaklik).click().perform();
        Assert.assertTrue(hepsiBurada.kulaklikGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Kulaklik");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();


        // Sayfayi kapatin
        Driver.closeDriver();

    }

    private void ilkIkiIslem() {
        action.moveToElement(hepsiBurada.elektronik).perform();
        action.moveToElement(hepsiBurada.bilgisayarTablet).perform();
        }

}
