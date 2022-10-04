package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C02_Assertion extends TestBaseBeforeMethodAfterMethod {
    @Test (groups = "grp1")
    public void test01() {
        // amazon sayfasina gidin
        driver.get("https://www.amazon.com");

        // Title'in "Amazon" icerdigini kontrol edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));

        // Arama kutusunuun erisilebilir oldugunu test edin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());

        // Arama kutusuna "Nutella" yazip aratin
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        // Arama yapildigini test edin
        WebElement sonuc=driver.
                findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonuc.isDisplayed());

        // Arama sonucunun "Nutella" icerdigini test
        Assert.assertTrue(sonuc.getText().contains("Nutella"));
    }
}
