package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseCross;

public class C03_SoftAssertion extends TestBaseCross {


    SoftAssert softAssert=new SoftAssert();
    @Test
    public void test01() {
        // amazon sayfasina gidin
        driver.get("https://www.amazon.com");

        // Title'in "Amazon" icerdigini kontrol edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"Girdiginiz kelimeyi icermiyor");
        // => Fail oldugunda istedigimiz hata mesajini konsolda yukaridaki sekilde yazdirabiliriz.

        // Arama kutusunuun erisilebilir oldugunu test edin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"WE erisilemiyor");

        // Arama kutusuna "Nutella" yazip aratin
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        // Arama yapildigini test edin
        WebElement sonuc=driver.
                findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed(),"SonucWE goruntulenemedi");

        // Arama sonucunun "Nutella" icerdigini test
        softAssert.assertTrue(sonuc.getText().contains("Nutella"),"Sonuc Nutella icermiyor");
        softAssert.assertAll();
        // Fail olan bir yer varsa softAssert.assertAll(); methodundan sonraki satirlar calismaz.
        System.out.println("Bu satir calisti");
    }
}
