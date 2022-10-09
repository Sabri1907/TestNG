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
        action.moveToElement(hepsiBurada.dizUstuBilgisayar).click().perform();
        Assert.assertTrue(hepsiBurada.dizUstuBilgisayarGiris.isDisplayed());
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
        action.moveToElement(hepsiBurada.masaustuBilgisayar).click().perform();
        Assert.assertTrue(hepsiBurada.masaUstuBilgisayarGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Masaustu Bilgisayar");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //4.Oyuncu Ozel
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.oyuncuOzel).click().perform();
        Assert.assertTrue(hepsiBurada.oyuncuOzelGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Oyuncu Ozel");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //5 .Veri Depolama
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.veriDepolama).click().perform();
        Assert.assertTrue(hepsiBurada.veriDepolamaGiris.isDisplayed());
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
        action.moveToElement(hepsiBurada.bilgisayarBilesenleri).click().perform();
        Assert.assertTrue(hepsiBurada.bilgisayarBilesenleriGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Bilgisayar Bilesenleri");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //8. Yurt Disindan
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.yurtDisindan).click().perform();
        Assert.assertTrue(hepsiBurada.yurtDisindanGiris.isDisplayed());
        // Thread.sleep(2000);
        ReusableMethods.getScreenshot("Yurt Disindan");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //9. Ag-Modem-Akilli Ev
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.agModem).click().perform();
        Assert.assertTrue(hepsiBurada.agModemGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Ag Modem Akilli Ev");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //10. Grafik Tablet
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.grafikTablet).click().perform();
        Assert.assertTrue(hepsiBurada.grafikTabletGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Grafik Tablet");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //11. Cevre Birimleri
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.cevreBirimleri).click().perform();
        Assert.assertTrue(hepsiBurada.cevreBirimleriGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Cevre Birimleri");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //12. Yazilim Urunleri
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.yazilimUrunleri).click().perform();
        Assert.assertTrue(hepsiBurada.yazilimUrunleriGiris.isDisplayed());
        //Thread.sleep(2000);
        ReusableMethods.getScreenshot("Yazilim Urunleri");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().navigate().back();

        //13. Aksesuarlar
        Thread.sleep(2000);
        ilkIkiIslem();
        action.moveToElement(hepsiBurada.aksesuar).click().perform();
        Assert.assertTrue(hepsiBurada.aksesuarGiris.isDisplayed());
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



        //List<WebElement> hepsiBuradaList = new ArrayList<>();
        //hepsiBuradaList.add(0,hepsiBurada.dizUstuBilgisayar);



        // Sayfayi kapatin
        Driver.closeDriver();

    }



    private void ilkIkiIslem() {
        action.moveToElement(hepsiBurada.elektronik).perform();
        action.moveToElement(hepsiBurada.bilgisayarTablet).perform();
        }

}
