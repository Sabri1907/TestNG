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

public class HomeWorkHepsiBurada {

    HepsiBuradaPage hepsiBurada = new HepsiBuradaPage();
    Actions action = new Actions(Driver.getDriver());

    @Test
    public void test01() throws IOException, InterruptedException {
        // Hepsiburada sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hepsiBuradaUrl"));

        /*

        // ELektronik>Bilgisayar/Tablet altindaki tum linkleri tiklayin
        // Her link'ten sonra o sayfaya gittiginizi test edin ve o sayfanin ekran goruntusunu alin
        List<WebElement> hepsiBuradaList= new ArrayList<>();
        hepsiBuradaList.add(0,hepsiBurada.dizustu);
        hepsiBuradaList.add(1,hepsiBurada.tablet);
        hepsiBuradaList.add(2,hepsiBurada.masaustu);
        hepsiBuradaList.add(3,hepsiBurada.oyuncu);
        hepsiBuradaList.add(4,hepsiBurada.veri);
        hepsiBuradaList.add(5,hepsiBurada.tumKategoriler);
        hepsiBuradaList.add(6,hepsiBurada.bilesenler);
        hepsiBuradaList.add(7,hepsiBurada.yurt);
        hepsiBuradaList.add(8,hepsiBurada.modem);
        hepsiBuradaList.add(9,hepsiBurada.grafik);
        hepsiBuradaList.add(10,hepsiBurada.cevre);
        hepsiBuradaList.add(11,hepsiBurada.yazilim);
        hepsiBuradaList.add(12,hepsiBurada.aksesuarlar);
        hepsiBuradaList.add(13,hepsiBurada.kulaklik);




        for (WebElement each:hepsiBuradaList) {

                ilkIkiIslem();
                action.moveToElement(each).click().perform();
                Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(each.getText()));
                ReusableMethods.getScreenshot(each.getText());
                Driver.getDriver().navigate().back();
                Thread.sleep(2000);


            }
            */

        ilkIkiIslem();
        System.out.println(hepsiBurada.sixtysixWE.size());


        // Sayfayi kapatin
        Driver.closeDriver();
        }





    private void ilkIkiIslem() {
        action.moveToElement(hepsiBurada.elektronik).perform();
        action.moveToElement(hepsiBurada.bilgisayarTablet).perform();
        }

}
