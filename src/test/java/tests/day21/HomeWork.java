package tests.day21;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class HomeWork {
    @Test
    public void test01() {
        // Hepsiburada sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hepsiBuradaUrl"));

        // ELektroni>Bilgisayar/Tablet altindaki tum linkleri tiklayin

        // Her link'ten sonra o sayfaya gittiginizi test edin ve o sayfanin ekran goruntusunu aling

        // Sayfayi kapatin

    }

}
