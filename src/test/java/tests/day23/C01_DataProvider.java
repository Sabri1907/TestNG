package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeClassAfterClass;

public class C01_DataProvider extends TestBaseBeforeClassAfterClass {
     /*
       dataProvider = Istedigimiz sayfada birden fazla data aratmak icin kullanilir.
       data Provider ozelligini kullanmak icin:
           1. Test notasyonunun yanina parantez icinde dataProvider keyword'u yazilir ve esitligin
           sag tarafina "" icinde istedigimiz ismi veririz.
           2. Test methoduna parametre olarak String bir deger atama yapariz ve istedigimiz ismi veririz.
           3. Arama yapacagimiz arama kutusu webelementi'ne gondermek method parametresinde belirttigimiz
           String degeri yazariz
           4.Method parametresindeki String degerle aranacak kelimeleri eslestirmek icin dataProvider'in
           ustune mause'u yaklastiriz ve dataProvider notasyonuyla array data turunde method olusturup
           array'inh icine aranacak kelimeleri String olarak yazariz.
         */


    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"},{"selenium"},{"samsung"},{"iphone"}};
    }

    @Test (dataProvider = "aranacakKelimeler")
    public void test01(String kelimeler) {
        AmazonPage amazonPage = new AmazonPage();

        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //java, selenium, samsung ve iphone icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(kelimeler, Keys.ENTER);

        //sonuclarin aradigimiz kelime icerdigini test edelim
        String actualKelime = amazonPage.aramaSonucuWE.getText();
        Assert.assertTrue(actualKelime.contains(kelimeler));

    }

    @Test (dependsOnMethods = "test01")
    public void test02() {
        Driver.closeDriver();
    }

}
