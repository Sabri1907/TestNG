package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperty {
    @Test
    public void test01() throws InterruptedException {

        // Amazon sayfasina ve facebook sayfasina gidin
        //String amazonUrl=ConfigReader.getProperty("amazonUrl");
        //String faceBookUrl=ConfigReader.getProperty("faceBookUrl");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Thread.sleep(2000);
        Driver.getDriver().get(ConfigReader.getProperty("faceBookUrl"));
        Thread.sleep(2000);
        // => configuration.properties dosyasinda (file) tanimladigimiz Url'in key degerini kullandik
        // ConfigReader.getProperty("amazonUrl") yapisinda kullandik ve get() methodu icine uzun uzun
        // yazmamak icin String bir degiskene atayip kullandik. Ayni islemleri facebook icin de yaptik

        //Driver.getDriver().close();

    }
}
