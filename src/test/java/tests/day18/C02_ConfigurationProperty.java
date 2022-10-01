package tests.day18;

import org.testng.annotations.Test;
import utilities.Driver;

public class C02_ConfigurationProperty {
    @Test
    public void test01() {
        Driver.getDriver().get("amazonUrl");
        // configuration.properties dosyasinda (file) tanimladigimiz Url'in key degerini kullandik

    }
}
